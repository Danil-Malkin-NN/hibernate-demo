package ru.present.hibernatedemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.present.hibernatedemo.dto.HomeDto;
import ru.present.hibernatedemo.entity.Home;

@Mapper(componentModel = "spring")
public interface HomeMapper {

    HomeMapper INSTANCE = Mappers.getMapper(HomeMapper.class);

    HomeDto homeToHomeDto(Home home);

    Home homeDtoToHome(HomeDto homeDto);


}
