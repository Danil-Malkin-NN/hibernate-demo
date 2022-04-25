package ru.present.hibernatedemo.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import ru.present.hibernatedemo.entity.abst.AIdEntity;

@Entity
@Table(name = "city")
@Data
public class City extends AIdEntity {

    private String name = "";

    @ManyToOne
//    @JoinColumn(name = "")
    private Home home;
}