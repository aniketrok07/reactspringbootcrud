package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "players")
public class Player {
//(according to role add runs and wickets),match played
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "player_id")
	private int id;
	@Column(name = "player_name")
	private String name;
	@Column(name = "team_name")
	private String team;
	@Enumerated(EnumType.STRING)
	@Column(name = "player_role")
	private PlayerRole role;
	private int runs;
	private int wickets;
	private int matchPlayed;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public PlayerRole getRole() {
		return role;
	}
	public void setRole(PlayerRole role) {
		this.role = role;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getMatchPlayed() {
		return matchPlayed;
	}
	public void setMatchPlayed(int matchPlayed) {
		this.matchPlayed = matchPlayed;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", team=" + team + ", role=" + role + ", runs=" + runs
				+ ", wickets=" + wickets + ", matchPlayed=" + matchPlayed + "]";
	}
	
	
	
}
