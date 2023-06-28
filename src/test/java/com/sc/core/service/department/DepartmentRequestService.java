package com.sc.core.service.department;

import com.codeborne.selenide.WebDriverRunner;
import com.sc.core.dto.DepartmentMessageDto;
import org.openqa.selenium.Cookie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Set;

import static com.sc.core.constant.UrlConstant.ADD_RESPONSE_TO_QUEUE_PATH;
import static org.springframework.http.HttpMethod.POST;

@Service
public class DepartmentRequestService {
    private final static Logger logger = LoggerFactory.getLogger(DepartmentRequestService.class);

    @Value("${ais.base.url:http://192.168.141.185:8080/cpgu/}")
    private String baseUrl;
    private RestTemplate restTemplate;

    @PostConstruct
    public void init() {
        restTemplate = new RestTemplate();
    }

    public void sendRequest(DepartmentMessageDto departmentMessageDto) {
        Set<Cookie> cookies = WebDriverRunner.getWebDriver().manage().getCookies();
        HttpHeaders headers = new HttpHeaders();
        cookies.forEach(cookie -> headers.add("Cookie", cookie.getName() + "=" + cookie.getValue()));

        HttpEntity<DepartmentMessageDto> requestEntity = new HttpEntity<>(departmentMessageDto, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseUrl + ADD_RESPONSE_TO_QUEUE_PATH,
                POST,
                requestEntity,
                String.class);
        logger.warn(response.getBody());
    }
}
