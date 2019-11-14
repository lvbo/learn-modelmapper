package io.github.lvbo.lm.provider;

import io.github.lvbo.lm.model.Person;
import org.modelmapper.AbstractProvider;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/14 11:26
 */
public class PersonProvider extends AbstractProvider<Person> {
    @Override
    protected Person get() {
        return new Person();
    }
}
