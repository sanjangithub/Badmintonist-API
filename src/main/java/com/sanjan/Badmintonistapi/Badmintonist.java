package com.sanjan.Badmintonistapi;

import org.springframework.beans.factory.annotation.Autowired;

public class Badmintonist 
{
	private int id;
	
	@Override
	public String toString() {
		return "Badmintonist [id=" + id + ", name=" + name + ", country=" + country + ", style=" + style
				+ ", maritialStatus=" + maritialStatus + "]";
	}
	@Autowired
	public Badmintonist(int id, String name, String country, String style, MaritialStatus maritialStatus) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.style = style;
		this.maritialStatus = maritialStatus;
	}
	private String name;
	private String country;
	private String style;
	private MaritialStatus maritialStatus;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	public MaritialStatus getMaritialStatus() {
		return maritialStatus;
	}
	public void setMaritialStatus(MaritialStatus maritialStatus) {
		this.maritialStatus = maritialStatus;
	}
	public Badmintonist() {}
}
