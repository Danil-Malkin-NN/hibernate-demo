package ru.present.hibernatedemo.entity;

import javax.persistence.*;

import lombok.Data;
import ru.present.hibernatedemo.entity.abst.AIdEntity;

@Table(name = "cat")
@Entity
@Data
public class Cat extends AIdEntity {

    @Column(name = "name")
    String name = "";

}
