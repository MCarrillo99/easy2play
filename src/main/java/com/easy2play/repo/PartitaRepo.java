package com.easy2play.repo;

import com.easy2play.entities.Partita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PartitaRepo extends JpaRepository<Partita, Long> {

}
