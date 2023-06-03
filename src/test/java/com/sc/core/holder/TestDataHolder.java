package com.sc.core.holder;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class TestDataHolder {
    private final static ConcurrentHashMap<String, Object> holder = new ConcurrentHashMap<>();
    private static final String ORDER_NUMBER_KEY = "orderNumber";
    private static final String DEPARTMENT_TITLE_KEY = "departmentTitle";
    private static final String SERVICE_TITLE_KEY = "serviceTitle";
    private static final String SUB_DEPARTMENT_TITLE_KEY = "subDepartmentTitle";
    private static final String OUTCOME_PACKET_NUMBER_KEY = "outcomePacketNumber";
    private static final String COURIER_JOURNAL_NUMBER_KEY = "courierJournalNumber";
    private static final String INCOME_PACKET_NUMBER_KEY = "incomePacketNumber";

    public void setOrderNumber(String orderId) {
        holder.put(ORDER_NUMBER_KEY, orderId);
    }

    public String getOrderNumber() {
        return (String) holder.get(ORDER_NUMBER_KEY);
    }

    public void setDepartmentTitle(String depTitle) {
        holder.put(DEPARTMENT_TITLE_KEY, depTitle);
    }

    public String getDepartmentTitle() {
        return (String) holder.get(DEPARTMENT_TITLE_KEY);
    }

    public void setServiceTitle(String serviceTitle) {
        holder.put(SERVICE_TITLE_KEY, serviceTitle);
    }

    public String getServiceTitle() {
        return (String) holder.get(SERVICE_TITLE_KEY);
    }

    public void setSubDepartmentTitle(String subDepTitle) {
        holder.put(SUB_DEPARTMENT_TITLE_KEY, subDepTitle);
    }

    public String getSubDepartmentTitle() {
        return (String) holder.get(SUB_DEPARTMENT_TITLE_KEY);
    }

    public void setOutcomePacketsNumberFromToast(String createPacketToastMessage) {
        String[] splitMessage = createPacketToastMessage.split(StringUtils.SPACE);
        holder.put(OUTCOME_PACKET_NUMBER_KEY, splitMessage[splitMessage.length - 1]);
    }

    public String getOutcomePacketsNumber() {
        return (String) holder.get(OUTCOME_PACKET_NUMBER_KEY);
    }

    public void setCourierJournalNumberFromModalText(String createJournalModalText) {
        String journalNumber = createJournalModalText
                .replace("Распечатать", StringUtils.EMPTY)
                .replace("Номер сформированной ведомости: ", StringUtils.EMPTY)
                .trim();
        holder.put(COURIER_JOURNAL_NUMBER_KEY, journalNumber);
    }

    public String getCourierJournalNumber() {
        return (String) holder.get(COURIER_JOURNAL_NUMBER_KEY);
    }

    public void setIncomePacketsNumberFromToast(String createPacketToastMessage) {
        String[] splitMessage = createPacketToastMessage.replace("№", StringUtils.EMPTY).split(StringUtils.SPACE);
        holder.put(INCOME_PACKET_NUMBER_KEY, splitMessage[splitMessage.length - 1]);
    }

    public String getIncomePacketsNumber() {
        return (String) holder.get(INCOME_PACKET_NUMBER_KEY);
    }
}
