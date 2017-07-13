package com.mock.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mock.domain.TextFields;
import com.mock.service.TextService;

@Controller
public class MainController {

	@Autowired
	private TextService textService;
	
	@RequestMapping(value="/insert", method=RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity addData(@RequestBody TextFields textFields){
		textService.saveObject(textFields);
		return new ResponseEntity("Insert Success", HttpStatus.OK);
		
	}
	
//	@RequestMapping(value="/get/{id}", method = RequestMethod.GET)
//	public TextFields getTextField(@PathVariable("id") String id){
//		TextFields textFields  = textService.getObject(id);
//		return textFields;
//	}
	
	
	
}
