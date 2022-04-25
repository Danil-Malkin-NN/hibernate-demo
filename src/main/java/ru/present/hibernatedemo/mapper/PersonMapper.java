package ru.present.hibernatedemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.present.hibernatedemo.dto.HomeDto;
import ru.present.hibernatedemo.dto.PersonDto;
import ru.present.hibernatedemo.entity.Home;
import ru.present.hibernatedemo.entity.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDto toDto(Person home);

    Person fromDto(PersonDto homeDto);


}
