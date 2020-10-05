package com.csis3275.model_hackermen;

public class GroupMember_hackermen {
	
	private String name;
	private String photo;
	
	public GroupMember_hackermen(String name, String photo, String description) {
		this.name = name;
		this.photo = photo;
	}
	//test
	public GroupMember_hackermen() {
		this.name = "Hackermen";
		this.photo = "./Placeholder.png";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
