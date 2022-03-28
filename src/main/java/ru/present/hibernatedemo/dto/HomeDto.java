package ru.present.hibernatedemo.dto;

import lombok.Getter;
import lombok.Setter;
import ru.present.hibernatedemo.entity.Address;

import java.io.Serializable;

@Getter
@Setter
public class HomeDto implements Serializable {

    String name = "";

    private AddressDto addressDto = new AddressDto();

}
