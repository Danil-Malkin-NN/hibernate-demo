package ru.present.hibernatedemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
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

    //    @Column(name = "address_id")
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Address address = new Address();

//    @OneToOne(cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    private Cat cat = new Cat();

}
