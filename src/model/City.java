package model;

public class City{
	long cityid;
	String cityName;
	public long getCityid() {
		return cityid;
	}
	public void setCityid(long cityid) {
		this.cityid = cityid;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public City(long cityld,String cityName) {
		this.cityid=cityid;
		this.cityName=cityName;
	}
	
	
}


