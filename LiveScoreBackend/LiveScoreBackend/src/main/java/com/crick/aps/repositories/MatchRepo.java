package com.crick.aps.repositories;

import com.crick.aps.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
//This interface provides methods for database operations on the
// Match entity

//This is a Spring Data interface that provides generic CRUD operations.
//It requires the entity type (Match) and the type of its primary key (Integer).
public interface MatchRepo extends JpaRepository<Match,Integer> {
    //Match fetch on basis of team name
    Optional<Match>findByTeamHeading(String teamHeading);
}
