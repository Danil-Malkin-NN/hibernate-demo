package ru.present.hibernatedemo.entity.abst;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class AIdEntity {

    @Id
    @GeneratedValue
    protected Long id;

}
