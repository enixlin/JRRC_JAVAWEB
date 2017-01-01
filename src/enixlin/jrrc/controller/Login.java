package enixlin.jrrc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {

	@RequestMapping("/login")
	public void show(){
		System.out.println("show login controller");
		System.out.println("show login controller");
	}
}
