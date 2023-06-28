package com.sc.core.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

public class DepartmentMessageDto implements Serializable {
    private static final long serialVersionUID = 1074955426527687147L;

    @NotBlank(message = "xml is required")
    private String xml;

    @NotNull(message = "fileIds is required")
    private List<String> fileIds;

    @NotNull(message = "orderId is required")
    private Long orderId;

    @NotBlank(message = "parserName is required")
    private String parserName;

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public List<String> getFileIds() {
        return fileIds;
    }

    public void setFileIds(List<String> fileIds) {
        this.fileIds = fileIds;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getParserName() {
        return parserName;
    }

    public void setParserName(String parserName) {
        this.parserName = parserName;
    }

    @Override
    public String toString() {
        return "MessageExchangeParserDto{" +
                "xml='" + xml + '\'' +
                ", fileIds=" + fileIds +
                ", orderId=" + orderId +
                ", parserName='" + parserName + '\'' +
                '}';
    }
}
