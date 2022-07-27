package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IPlayerDao;
import com.app.pojos.Player;

@Service
@Transactional
public class PlayerService implements IPlayerService{

	@Autowired
	private IPlayerDao playerDao;
	
	@Override
	public Player addNewPlayer(Player p)
	{
		Player player = playerDao.save(p);
		return player;
	}
	
	@Override
	public List<Player> displayAll()
	{
		return playerDao.findAll();
	}
	
	@Override
	public void remove(int id)
	{
		playerDao.deleteById(id);
	}
	
	@Override
	public List<Player> bestBat()
	{
		return playerDao.bestBat();
	}
	
	@Override
	public List<Player> bestBowl()
	{
		return playerDao.bestBowl();
	}
}
