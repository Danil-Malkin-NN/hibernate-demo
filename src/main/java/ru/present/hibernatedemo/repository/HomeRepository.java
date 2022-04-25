package ru.present.hibernatedemo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.stereotype.Repository;
import ru.present.hibernatedemo.entity.Home;

@Repository
public interface HomeRepository extends AIdRepository<Home> {


    @Override
    @EntityGraph(
        type = EntityGraphType.FETCH,
        attributePaths = {
            "address",
            "personList",
            "city"
        })
    List<Home> findAll();
}
