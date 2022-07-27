package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Player;

public interface IPlayerDao extends JpaRepository<Player, Integer>{

	@Query(nativeQuery = true,value = "select * from players p where p.runs=(select max(e.runs) from players e)")
	public List<Player> bestBat();
	@Query(nativeQuery = true,value = "select * from players p where p.wickets=(select max(e.wickets) from players e)")
	public List<Player> bestBowl();
	
}
