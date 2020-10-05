package com.csis3275.model_hackermen;

public class GroupMember_hackermen {
	/**
	 * This class describes a group member, with name and photo properties
	 * @param	name	A String containing the name of the group member
	 * @param	photo	A String containing a link for the image to be used in the spring MVC application
	 */
	private String name;
	private String photo;
	
	/**
	 * Class Constructors, with a default option with no arguments and an option initializing groupName and groupDescription */
	public GroupMember_hackermen(String name, String photo, String description) {
		this.name = name;
		this.photo = photo;
	}
	public GroupMember_hackermen() {
		this.name = "Hackermen";
		this.photo = "./static/images/Placeholder.png";
	}
	
	/**
	 * Class getters and setters */
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
