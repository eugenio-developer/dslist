package com.eugenio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eugenio.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
