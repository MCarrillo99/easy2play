package com.easy2play.repo;

import com.easy2play.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface TeamRepo extends JpaRepository<Team, Long> {

    @Query(value = "SELECT * FROM easy2play.team t WHERE lati <= ?1 AND lati >= ?2 AND longi <= ?3 AND longi >= ?4",
    nativeQuery = true)
    List<Team> findByLatiAndLongi(double latiPiuRag, double latiMenoRag, double longiPiuRag, double longiMenoRag);
}
