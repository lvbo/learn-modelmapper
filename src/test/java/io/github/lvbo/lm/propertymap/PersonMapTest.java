package io.github.lvbo.lm.propertymap;

import io.github.lvbo.lm.dto.PersonDto;
import io.github.lvbo.lm.model.Age;
import io.github.lvbo.lm.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.modelmapper.ModelMapper;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/13 17:59
 */
public class PersonMapTest {

    @Test
    public void personMapTest() {
        Age age = new Age(1);
        Person person = new Person("dd", "mm", "tt", age, "aa", "lower", null);
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new PersonMap());
        PersonDto personDto = modelMapper.map(person, PersonDto.class);
        Assert.assertEquals(personDto.getName(), person.getFirstName());
        Assert.assertEquals(personDto.getLastName(), person.getSurName());
        Assert.assertEquals(personDto.getStreetAddress(), person.getAddress());
        Assert.assertEquals(personDto.getEmployer(), PersonMap.INITECH);
        Assert.assertEquals(personDto.getAge(), person.getAge().getAge());
        Assert.assertNull(personDto.getDescription());
        Assert.assertEquals(personDto.getUpperName(), person.getLowerName().toUpperCase());
        Assert.assertEquals("China", personDto.getCountry());
    }
}