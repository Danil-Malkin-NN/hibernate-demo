package ru.present.hibernatedemo.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomeDto extends AIdDto {

    String name = "";

    private AddressDto address = new AddressDto();

    private List<PersonDto> personList = new ArrayList<>();

    private List<Cat> catList = new ArrayList<>();

    private CityDto city = new CityDto();

    private List<Integer> list = new ArrayList<>();

}
