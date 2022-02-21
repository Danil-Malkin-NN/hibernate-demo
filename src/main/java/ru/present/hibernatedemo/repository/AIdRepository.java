package ru.present.hibernatedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AIdRepository<T> extends JpaRepository<T, Long> {

}
