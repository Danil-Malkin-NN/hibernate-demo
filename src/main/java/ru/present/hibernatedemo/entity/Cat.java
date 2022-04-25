package ru.present.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.present.hibernatedemo.entity.abst.AIdEntity;

@EqualsAndHashCode(callSuper = true)
@Table(name = "cat")
@Entity
@Data
public class Cat extends AIdEntity {

    @Column(name = "name")
    String name = "";

    @JoinColumn(name = "home_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Home home;

}
