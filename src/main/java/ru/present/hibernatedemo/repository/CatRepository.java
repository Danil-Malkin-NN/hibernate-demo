package ru.present.hibernatedemo.repository;

import org.springframework.stereotype.Repository;
import ru.present.hibernatedemo.entity.Cat;

@Repository
public interface CatRepository extends AIdRepository<Cat> {

}
