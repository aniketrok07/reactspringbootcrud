package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Player;
import com.app.service.IPlayerService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private IPlayerService serv;
	
	@GetMapping("/add")
	public String addPlayer(Player p)
	{
		return "/admin/addPlayer";
	}
	
	@PostMapping("/add")
	public String savePlayer(Player p)
	{
		serv.addNewPlayer(p);
		return "/admin/welcome";
	}
	
	@GetMapping("/displayAll")
	public String displayAll(ModelMap map)
	{
		map.addAttribute("allPlayer",serv.displayAll());
		return "/admin/displayAll";
	}
	
	@GetMapping("/remove")
	public String remove(ModelMap map)
	{
		map.addAttribute("allPlayer",serv.displayAll());
		return "/admin/remove";
	}
	
	@GetMapping("/remove1")
	public String remove(@RequestParam int id)
	{
		serv.remove(id);
		return "redirect:/admin/remove";
	}
	
	@GetMapping("/bestBatsmen")
	public String bestBatsmen(ModelMap map)
	{
		map.addAttribute("allPlayer",serv.bestBat());
		return "/admin/displayAll";
	}
	
	@GetMapping("/bestBowler")
	public String bestBowler(ModelMap map)
	{
		map.addAttribute("allPlayer",serv.bestBowl());
		return "/admin/displayAll";
	}
}
