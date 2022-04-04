package ru.present.hibernatedemo.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.present.hibernatedemo.entity.abst.AIdEntity;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Table(name = "home")
@Entity
@Data
public class Home extends AIdEntity {

    @Column(name = "home_name")
    private String name = "";

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address = new Address();

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
        name="home_person",
        joinColumns=@JoinColumn(name="home_id"),
        inverseJoinColumns=@JoinColumn(name="person_id")
    )
    private List<Person> personList = new ArrayList<>();

    @JoinColumn(name = "home_id", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cat> catList = new ArrayList<>();

}
