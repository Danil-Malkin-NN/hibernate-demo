package ru.present.hibernatedemo.entity;

import javax.persistence.*;

import lombok.Data;
import ru.present.hibernatedemo.entity.abst.AIdEntity;

import java.util.ArrayList;
import java.util.List;

@Table(name = "home")
@Entity
@Data
public class Home extends AIdEntity {

    @OneToOne
    private Address address = new Address();

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Cat cat = new Cat();

}
