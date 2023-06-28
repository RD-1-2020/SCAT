package com.sc.core.factory;

import com.sc.core.constant.ParserType;
import com.sc.core.dto.DepartmentMessageDto;
import com.sc.core.utils.ResourceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

import static com.sc.core.constant.DepartmentResponseBody.MVD_DENIED_REQUEST_FILE;
import static com.sc.core.constant.DepartmentResponseBody.MVD_EXECUTED_REQUEST_FILE;

@Service
public class DepartmentMessageDtoFactory {
    @Autowired
    private ResourceUtils resourceUtils;

    public DepartmentMessageDto build(Long orderId, ParserType parserType, boolean isPositiveResponse) {
        DepartmentMessageDto departmentMessageDto = new DepartmentMessageDto();
        departmentMessageDto.setOrderId(orderId);
        departmentMessageDto.setParserName(parserType.name());
        departmentMessageDto.setFileIds(Collections.emptyList());

        responseByParserType(parserType, isPositiveResponse, departmentMessageDto);

        return departmentMessageDto;
    }

    private void responseByParserType(ParserType parserType, boolean isPositiveResponse, DepartmentMessageDto departmentMessageDto) {
        switch (parserType) {
            case BaseMvdMessageExchangeParse: {
                if (isPositiveResponse) {
                    departmentMessageDto.setXml(resourceUtils.readString(MVD_EXECUTED_REQUEST_FILE));
                    break;
                }

                departmentMessageDto.setXml(resourceUtils.readString(MVD_DENIED_REQUEST_FILE));
            }
            case BaseMessageExchangeParse:
                break;
            case MspMessageExchangeParse:
                break;
            case Election2018MessageExchangeParse:
                break;
        }
    }
}
