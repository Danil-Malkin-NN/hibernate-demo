package ru.present.hibernatedemo.mapper;

import java.util.List;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.present.hibernatedemo.dto.Cat;
import ru.present.hibernatedemo.dto.HomeDto;
import ru.present.hibernatedemo.entity.Home;

@Mapper(componentModel = "spring")
public interface HomeMapper {

    HomeMapper INSTANCE = Mappers.getMapper(HomeMapper.class);

    HomeDto homeToHomeDto(Home home);

    Home homeDtoToHome(HomeDto homeDto);

}
