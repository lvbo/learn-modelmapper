package io.github.lvbo.lm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/13 17:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstName;
    private String surName;
    private String address;
    private Age age;
    private String description;
    private String lowerName;
    private String country;
}
