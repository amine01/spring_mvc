package com.essamine.domain;

public class Reservation {
	private String courtName;
	private Player player;
	private SportType sportType;

	

	public String getCourtName() {
		return courtName;
	}

	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public SportType getSportType() {
		return sportType;
	}

	public void setSportType(SportType sportType) {
		this.sportType = sportType;
	}

	public Reservation(String courtName, Player player, SportType sportType) {
		this.courtName = courtName;
		this.player = player;
		this.sportType = sportType;
	}
	
	

}
