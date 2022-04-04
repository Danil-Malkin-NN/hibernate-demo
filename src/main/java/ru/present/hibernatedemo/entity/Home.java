package ru.present.hibernatedemo.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.present.hibernatedemo.entity.abst.AIdEntity;

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
        name = "home_person",
        joinColumns = @JoinColumn(name = "home_id"),
        inverseJoinColumns = @JoinColumn(name = "person_id")
    )
    private List<Person> personList = new ArrayList<>();

    @JoinColumn(name = "home_id", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cat> catList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "home_id", referencedColumnName = "id")
    private City city;

}
