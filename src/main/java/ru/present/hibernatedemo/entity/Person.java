package ru.present.hibernatedemo.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.PreRemove;
import javax.persistence.Table;
import lombok.Data;
import ru.present.hibernatedemo.entity.abst.AIdEntity;

@Table(name = "person")
@Entity
@Data
public class Person extends AIdEntity {

    private String name;

    @ManyToMany(mappedBy = "personList")
    private List<Home> homeList = new ArrayList<>();

}
