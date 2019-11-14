package io.github.lvbo.lm.provider;

import org.junit.Test;
import org.modelmapper.ModelMapper;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/14 14:40
 */
public class ProviderTest {

    @Test
    public void test() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setProvider(new PersonProvider());
    }

}