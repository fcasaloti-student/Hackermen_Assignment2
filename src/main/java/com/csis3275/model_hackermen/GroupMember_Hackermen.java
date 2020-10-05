package com.csis3275.model_hackermen;

public class GroupMember_hackermen {
	
	private String name;
	private String photo;
	private String description;
	
	public GroupMember_hackermen(String name, String photo, String description) {
		this.name = name;
		this.photo = photo;
		this.description = description;
	}
	public GroupMember_hackermen() {
		this.name = "Hackermen";
		this.photo = "./Placeholder.png";
		this.description = "Men who hack";
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
