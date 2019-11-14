package io.github.lvbo.lm.condition;

import org.modelmapper.Condition;
import org.modelmapper.spi.MappingContext;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/14 11:30
 */
public class NotNullCondition implements Condition {

    @Override
    public boolean applies(MappingContext context) {
        return context.getSource() != null;
    }
}
