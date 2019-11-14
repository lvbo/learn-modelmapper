package io.github.lvbo.lm.dto;

import lombok.Data;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/9 20:36
 */
@Data
public class OrderDto {
    private String customerFirstName;
    private String customerLastName;
    private String billingStreet;
    private String billingCity;
}
