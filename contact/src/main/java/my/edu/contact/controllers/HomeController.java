package my.edu.contact.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import my.edu.contact.service.ContactService;

@Controller
public class HomeController {

	@Autowired
	private ContactService contactService;



	 
}
