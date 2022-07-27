package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IUserDao;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements  IUserService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	public User validateUser(String name,String password)
	{
		return userDao.findByNameAndPassword(name, password).orElseThrow(()->new RuntimeException("Invalid"));
		
	}
}
