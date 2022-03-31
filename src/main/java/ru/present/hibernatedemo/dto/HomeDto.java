package ru.present.hibernatedemo.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import ru.present.hibernatedemo.entity.Person;

@Getter
@Setter
public class HomeDto extends AIdDto {

    String name = "";

    private AddressDto address = new AddressDto();

    private List<Person> personList = new ArrayList<>();

}
