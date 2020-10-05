package com.csis3275.model_hackermen;

/**
 * @author Hackermen
 * Oct 05th 2020
 */

public class Group_hackermen {
	/**
	 * This class describes a group, with name and description properties
	 * @param	groupName	A String containing the name of the group
	 * @param	groupDescription	A String containing a description for the group
	 */

	private String groupName;
	private String groupDescription;
	
	/**
	 * Class Constructors, with a default option with no arguments and an option initializing groupName and groupDescription */
	public Group_hackermen() {
		
	}
	public Group_hackermen(String groupName, String groupDescription) {
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}
	/**
	 * Class getters and setters */
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
