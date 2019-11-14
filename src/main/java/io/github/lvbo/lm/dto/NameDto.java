package io.github.lvbo.lm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/14 14:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NameDto {
    private String firstName;
    private String lastName;
}
