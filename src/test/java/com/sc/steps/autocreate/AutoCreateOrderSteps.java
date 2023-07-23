package com.sc.steps.autocreate;

import com.sc.core.service.autocreate.AutoCreateOrderService;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PreDestroy;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class AutoCreateOrderSteps {
    private static final int MAX_TASK_INVOKERS = 4;
    private ThreadPoolExecutor  executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(MAX_TASK_INVOKERS);

    @Autowired
    private AutoCreateOrderService autoCreateOrderService;

    @When("Создали заявление по {string} {int} раз в филиале {string} под {string} по заявителю {string}")
    public void createOrder(String serviceTitle, int count, String mfcDisplayName, String roleName, String requesterFullDisplayName) {
        int invokers = Runtime.getRuntime().availableProcessors() * 70 / 100;
        invokers = Math.min(invokers, MAX_TASK_INVOKERS);

        Integer countForInvoker = count / invokers;

        for (int i = 0; i < invokers; i++) {
            executor.submit(new Thread() {
                        @Override
                        public void run() {
                            super.run();

                            autoCreateOrderService.createOrderInOneThread(mfcDisplayName, roleName, countForInvoker, requesterFullDisplayName, serviceTitle);
                        }});
        }

        while (executor.getActiveCount() != 0) {
            LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(5));
        }
    }

    @PreDestroy
    public void shutdown() {
        executor.shutdown();
    }
}
