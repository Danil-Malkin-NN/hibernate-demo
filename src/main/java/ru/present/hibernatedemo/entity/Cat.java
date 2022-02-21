package ru.present.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "cat")
@Entity
@Data
public class Cat extends AIdEntity {

    @Column(name = "name")
    String name = "";

}
