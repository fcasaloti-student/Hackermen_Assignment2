package com.csis3275.controller_hackermen;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.csis3275.model_hackermen.GroupMember_hackermen;
import com.csis3275.model_hackermen.Group_hackermen;

/**
 * @author Hackermen
 * Oct 05th 2020
 */

@Controller
//Controller to respond to requests from /academic for the academic servlet.

@RequestMapping("/")
public class MemberController_hackermen {

	//Handle get requests by creating new objects from GroupMember and Group classes
	@RequestMapping(method = RequestMethod.GET)
	public String newProfile(ModelMap model) {
		
		GroupMember_hackermen member = new GroupMember_hackermen();
		
		String groupDesc = "We are a team of aspiring developers working together with the goal of developing a Hotel Management System software. "
				+ "Our members come from business, development and infrastructure backgrounds, allowing us to contribute to different aspects of the development process, learning with each other to complete this challenge.";
		
		//Instantiate each member
		Group_hackermen group = new Group_hackermen("Hackermen", groupDesc);
		
		model.addAttribute("member", member);
		model.addAttribute("group", group);

//		//Return assignment2_hackermen view
		return "assignment2_hackermen";
	}

}
