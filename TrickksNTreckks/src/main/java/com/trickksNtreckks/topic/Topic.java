package com.trickksNtreckks.topic;



public class Topic {
	private String iD;
	private String name;
	private String description;
	public String getID() {
		return iD;
	} 
	public void setID(String iD) {
		iD = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		description = description;
	}
	
    public	Topic (){}
	
	public Topic(String iD, String name, String description) {
		super();
		this.iD = iD;
		this.name = name;
		this.description = description;
	}
	
}
