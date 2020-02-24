package io.amen.springboot.topics;

public class Topic {
    
	private String id;
	private String name;
	private String adress;
	private String date;
	private int phone;
	

	
	public Topic() {
	
}


public Topic(String id, String name, String adress, String date, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.date= date;
		this.phone= phone;
		
		
		
	}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
	
}

public String getdate() {
	return date;
}
public void setdate(String date) {
	this.date = date;
	
}

public int getphone() {
	return phone;
}
public void setphone(int phone) {
	this.phone = phone;
	
}

}
