package com.eugenio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.eugenio.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
