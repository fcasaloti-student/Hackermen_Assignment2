package com.csis3275.model_hackermen;

public class Group_hackermen {

	private String groupName;
	private String groupDescription;
	
	public Group_hackermen() {
		
	}
	public Group_hackermen(String groupName, String groupDescription) {
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupDescription() {
		return groupDescription;
	}
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}
}
