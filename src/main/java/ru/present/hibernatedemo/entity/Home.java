package ru.present.hibernatedemo.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.present.hibernatedemo.entity.abst.AIdEntity;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "home")
@Entity
@Getter
@Setter
public class Home extends AIdEntity {

    @Column(name = "home_name")
    private String name = "";

    //    @OneToOne(cascade = CascadeType.PERSIST)
    @OneToOne(cascade = CascadeType.ALL,
        targetEntity = Address.class,//Параметр не обязателен.
        orphanRemoval = true,
        optional = false)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @ManyToMany(
        cascade = CascadeType.PERSIST,
        targetEntity = Person.class,
        fetch = FetchType.EAGER
    )
    @JoinTable(
        name = "home_person",
        joinColumns = @JoinColumn(name = "home_id"),
        inverseJoinColumns = @JoinColumn(name = "person_id")
    )
    private List<Person> personList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "home", orphanRemoval = true)
    private List<Cat> catList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city = new City();

    public void setCatList(List<Cat> catList) {
        catList.forEach(cat -> cat.setHome(this));
        this.catList = catList;
    }

}
