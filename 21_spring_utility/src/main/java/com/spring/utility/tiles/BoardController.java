package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles/board")
public class BoardController {

	@GetMapping("/boardList")
	public String bList() {
		
		return "bList";
		
	}
	
	@GetMapping("/boardWrite")
	public String bWrite() {
		
		return "bWrite";
		
	}
	
	@GetMapping("/boardUpdate")
	public ModelAndView bUpdate() {
		
		return new ModelAndView("bUpdate");
		
	}
	
	@GetMapping("/boardDelete")
	public ModelAndView bDelete() {
		
		return new ModelAndView("bDelete");
		
	}
	
}
