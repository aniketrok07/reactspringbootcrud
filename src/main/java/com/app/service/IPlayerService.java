package com.app.service;

import java.util.List;

import com.app.pojos.Player;

public interface IPlayerService {

	Player addNewPlayer(Player p);

	List<Player> displayAll();

	void remove(int id);

	List<Player> bestBat();

	List<Player> bestBowl();

}
