package com.jbk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testapi")
public class QuesetionsController {
	
	public Quesetion getQuesetions() {
		Quesetion quesetion = new Quesetion(); //This is just dummy code.
		quesetion.setQuesetionText("Java is plateform independent.");
		quesetion.setOption1("Yes");
		quesetion.setOption2("No");
		quesetion.setCorrectOption("1");
		quesetion.setExplanations("Due to byte code.......Java is os independent.");
		return quesetion;
	}

}
