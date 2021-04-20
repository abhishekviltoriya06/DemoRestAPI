package com.trickksNtreckks.init;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {
	
	@RequestMapping("/Hello")//Takes GET method by post, for orher use explicitely
	public String sayHi() {
		return "hi..";
	}
}
