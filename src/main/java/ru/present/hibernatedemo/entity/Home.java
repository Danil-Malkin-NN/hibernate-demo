package ru.present.hibernatedemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "home")
@Entity
@Data
public class Home extends AIdEntity{

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Cat cat;

    @Column(name = "address")
    private String address = "";

}
