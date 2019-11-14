package io.github.lvbo.lm.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/9 20:34
 */
@Data
@AllArgsConstructor
public class Address {
    private String street;
    private String city;
}
