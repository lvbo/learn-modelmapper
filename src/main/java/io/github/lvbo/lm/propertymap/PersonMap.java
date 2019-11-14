package io.github.lvbo.lm.propertymap;

import io.github.lvbo.lm.condition.NotNullCondition;
import io.github.lvbo.lm.converter.ToUppercaseConverter;
import io.github.lvbo.lm.dto.PersonDto;
import io.github.lvbo.lm.model.Person;
import io.github.lvbo.lm.provider.PersonProvider;
import org.modelmapper.PropertyMap;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/13 17:53
 */
public class PersonMap extends PropertyMap<Person, PersonDto> {

    public static final String INITECH = "Initech";

    protected void configure() {
        // Defining Mappings
        map().setName(source.getFirstName());
        map().setLastName(source.getSurName());
        map(source.getAddress(), destination.getStreetAddress());
        map().setEmployer(INITECH);

        // Deep Mapping
        map().setAge(source.getAge().getAge());

        // Skipping Properties
        skip().setDescription(null);

        // Converters
        using(new ToUppercaseConverter()).map(source.getLowerName(), destination.getUpperName());

        // Providers
        with(new PersonProvider());

        // Conditional Mapping
        when(new NotNullCondition()).map().setCountry(source.getCountry());
    }
}