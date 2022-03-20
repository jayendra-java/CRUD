package com.grocery.RequestparamandModelattribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grocery.model.User;

@Controller
public class RequestparamModelattribute {
	@RequestMapping("/values")
	public String getValues(Model model,@RequestParam String username,@RequestParam String password)
	{
		System.out.println("values fetched using @Requestpaaram is"+username +" "+password);
		model.addAttribute("username", username);
		return "rehome";
	}
	@RequestMapping("/DTOvalues")
	public String getDTOvalues(Model model,User user)
	{
		System.out.println("values fetched using @Requestpaaram is"+user.getUsername() +" "+user.getPassword());
		model.addAttribute("user", user);
		return "dtohome";
	}
	
	@RequestMapping("/model")
	public String getmodelvalues(@ModelAttribute("user") User user)
	{
		//System.out.println("values fetched using @Requestpaaram is"+user.getUsername() +" "+user.getPassword());
		//model.addAttribute("user", user);
		return "modelhome";
	}

	
	
}
