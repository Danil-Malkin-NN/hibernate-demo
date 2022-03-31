package ru.present.hibernatedemo.dto;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class AIdDto implements Serializable {

    @Id
    @GeneratedValue
    protected Long id;

}
