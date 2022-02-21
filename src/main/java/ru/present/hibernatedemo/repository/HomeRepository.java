package ru.present.hibernatedemo.repository;

import org.springframework.stereotype.Repository;
import ru.present.hibernatedemo.entity.Home;

@Repository
public interface HomeRepository extends AIdRepository<Home> {

}
