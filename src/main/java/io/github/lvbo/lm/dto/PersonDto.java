package io.github.lvbo.lm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/13 17:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    private String name;
    private String lastName;
    private String streetAddress;
    private String employer;
    private int age;
    private String description;
    private String upperName;
    private String country = "China";
}
