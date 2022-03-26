package ru.present.hibernatedemo.entity;


import lombok.Data;
import ru.present.hibernatedemo.entity.abst.AIdEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "address")
public class Address extends AIdEntity {

    private String city = "";
    private String street = "";
    private Integer number = Integer.MAX_VALUE;

    @OneToOne
    private Home home;


}
