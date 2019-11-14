package io.github.lvbo.lm.converter;

import io.github.lvbo.lm.dto.NameDto;
import io.github.lvbo.lm.model.Name;
import org.junit.Assert;
import org.junit.Test;
import org.modelmapper.ModelMapper;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/14 14:33
 */
public class ConverterTest {

    @Test
    public void test() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addConverter(new ToUppercaseConverter());
        Name name = new Name("First", "Last");
        NameDto nameDto = modelMapper.map(name, NameDto.class);
        Assert.assertEquals(nameDto.getFirstName(), name.getFirstName().toUpperCase());
        Assert.assertEquals(nameDto.getLastName(), name.getLastName().toUpperCase());
    }
}