package com.essamine.domain;

public class Reservation {
	private String CourtName;
	private Player player;
	private SportType sportType;

	public String getCourtName() {
		return CourtName;
	}

	public void setCourtName(String courtName) {
		CourtName = courtName;
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
		CourtName = courtName;
		this.player = player;
		this.sportType = sportType;
	}
	
	

}
