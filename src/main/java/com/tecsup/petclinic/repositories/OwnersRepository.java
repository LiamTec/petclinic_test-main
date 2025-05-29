package com.tecsup.petclinic.repositories;

import com.tecsup.petclinic.entities.Owners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OwnersRepository extends JpaRepository<Owners, Integer> {

    // Fetch owners by first name
    List<Owners> findByFirstName(String first_name);

    // Fetch owner by id
    Optional<Owners> findById(int id); // Optional para manejar los casos en los que no se encuentra el owner

    // Fetch owners by last name
    List<Owners> findByLastName(String last_name);

    // Fetch all owners
    @Override
    List<Owners> findAll();

}
