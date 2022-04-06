package ru.present.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import ru.present.hibernatedemo.entity.abst.AIdEntity;

@Table(name = "cat")
@Entity
@Data
public class Cat extends AIdEntity {

    @Column(name = "name")
    String name = "";

    @ManyToOne
    @JoinColumn(name = "home_id", referencedColumnName = "id")
    private Home home;

}
