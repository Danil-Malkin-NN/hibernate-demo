package ru.present.hibernatedemo.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.present.hibernatedemo.entity.abst.AIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "address")
public class Address extends AIdEntity {

    @Column(name = "city")
    private String city = "";

    @Column(name = "street")
    private String street = "";

    @Column(name = "number")
    private Integer number = Integer.MAX_VALUE;

//    @Column(name = "home_id")
    @OneToOne(mappedBy = "address")
    private Home home;


}
