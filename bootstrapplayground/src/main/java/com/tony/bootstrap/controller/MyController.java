package com.tony.bootstrap.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tony.bootstrap.model.ResponseList;
import com.tony.bootstrap.model.ResponseModel;
import com.tony.bootstrap.model.ResponseModelOne;
import com.tony.bootstrap.model.ResponseModelTwo;

@Controller
public class MyController {

	@RequestMapping("/")
	public String home(){
		
		return "home";
	}
	
	@RequestMapping(value={"/model"},
					produces={MediaType.APPLICATION_JSON_VALUE},
					method={RequestMethod.GET})
	@ResponseBody 
	public ResponseList getModel() throws InterruptedException{
		Thread.sleep(2000);
		ResponseModelOne model = new ResponseModelOne();
		model.setAddress("xxxy");
		model.setName("my name");
		model.setSex("female");
		model.setAddress1("zzzz");
		
		ResponseModelTwo model2 = new ResponseModelTwo();
		model2.setAddress("3333");
		model2.setAddress2("qqqq");
		model2.setName("her name");
		
		ResponseList list = new ResponseList();
		list.getList().add(model);
		list.getList().add(model2);
		
		return list;
	}
}
