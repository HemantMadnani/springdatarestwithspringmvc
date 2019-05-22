package co.in.springmvcjpa.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import co.in.springmvcjpa.model.Person;

@RepositoryRestResource
public interface PersonDao extends JpaRepository<Person, Integer> {

	Optional<Person> findById(int id);

}
