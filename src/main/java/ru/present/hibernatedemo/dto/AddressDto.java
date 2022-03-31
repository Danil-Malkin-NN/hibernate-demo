package ru.present.hibernatedemo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class AddressDto extends AIdDto {

    private String city = "";

    private String street = "";

    private Integer number = Integer.MAX_VALUE;

}
