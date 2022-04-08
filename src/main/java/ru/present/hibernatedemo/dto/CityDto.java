package ru.present.hibernatedemo.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import ru.present.hibernatedemo.entity.Home;
import ru.present.hibernatedemo.entity.abst.AIdEntity;

@Data
public class CityDto extends AIdDto {

    private String name = "";

}
