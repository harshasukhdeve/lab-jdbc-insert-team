package model;

public class Team{
	
	String fname;
	String coach; 
	String captain;
	City city;
	public String getName() {
		return fname;
	}
	public void setName(String fname) {
		this.fname = fname;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Team(String fname, String coach, String captain, City city) {
		super();
		this.fname = fname;
		this.coach = coach;
		this.captain = captain;
		this.city = city;
	}
	
	
	
}
