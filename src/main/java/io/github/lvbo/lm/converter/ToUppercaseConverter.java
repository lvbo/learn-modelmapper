package io.github.lvbo.lm.converter;

import org.modelmapper.AbstractConverter;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/14 10:47
 */
public class ToUppercaseConverter extends AbstractConverter<String, String> {

    @Override
    protected String convert(String source) {
        return source == null ? null : source.toUpperCase();
    }
}
