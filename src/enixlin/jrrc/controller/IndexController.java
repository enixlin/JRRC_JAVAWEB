package enixlin.jrrc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value="/index.do")
	public String show(){
	
		System.out.println("show index controller");
		return "index";
	}
}
