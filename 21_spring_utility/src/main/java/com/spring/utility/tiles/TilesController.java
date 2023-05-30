package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class TilesController {
	
	@GetMapping("/content1") // 사용자가 이쪽으로 찾아옴
	public String content1() {
		//return "tiles/tilesEx/content1";	// before
		return "aaa";	// (after) definition태그 name 속성과 바인딩
	}
	
	@GetMapping("/content2")
	public ModelAndView content2() {
		
		ModelAndView mv = new ModelAndView();
		//mv.setViewName("tiles/tilesEx/content2");	// before
		mv.setViewName("bbb");	// (after) definition태그 name 속성과 바인딩
		
		return mv;
		
	}
	
	@GetMapping("/content3")
	public ModelAndView content3() {
		
		//return new ModelAndView("tiles/tilesEx/content3");	// before
		return new ModelAndView("ccc");	// (after) definition태그 name 속성과 바인딩
		
	}
	
}
