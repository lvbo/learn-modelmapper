package io.github.lvbo.lm;

import io.github.lvbo.lm.dto.OrderDto;
import io.github.lvbo.lm.dto.UserDto;
import io.github.lvbo.lm.model.*;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.ValidationException;

import static org.junit.Assert.assertEquals;

public class ConvertTest {

    @Test
    public void orderToOrderDtoTest() {
        Name name =  new Name("first name", "last name");

        Customer customer = new Customer();
        customer.setName(name);

        Address address = new Address("street", "city");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(address);

        ModelMapper modelMapper = new ModelMapper();
        OrderDto orderDTO = modelMapper.map(order, OrderDto.class);

        assertEquals(order.getCustomer().getName().getFirstName(), orderDTO.getCustomerFirstName());
        assertEquals(order.getCustomer().getName().getLastName(), orderDTO.getCustomerLastName());
        assertEquals(order.getBillingAddress().getStreet(), orderDTO.getBillingStreet());
        assertEquals(order.getBillingAddress().getCity(), orderDTO.getBillingCity());
    }

    @Test
    public void orderToOrderDtoValidatingTest() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.createTypeMap(Order.class, OrderDto.class);
        modelMapper.validate();
    }

    @Test(expected = ValidationException.class)
    public void userToUserDtoValidatingTest() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.createTypeMap(User.class, UserDto.class);
        modelMapper.validate();
    }
}
