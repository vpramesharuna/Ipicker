package com.items.itemms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.items.itemms.model.ItemData;
import com.items.itemms.service.ItemService;

/*import com.items.item.model.ItemData;
import com.items.item.service.ItemService;
import com.items.item.service.ItemServiceImpl;*/
//import com.items.item.util.ApplicationProperties;

@RestController
@RequestMapping("/app")	
public class ItemController {

/*	private ApplicationProperties application;

	@Autowired
	public void setApplication(ApplicationProperties application) {
		this.application = application;
	}*/
	@Autowired
	ItemService itemList;
	
	@RequestMapping(value= "/itemList", method = RequestMethod.GET)
	public List<ItemData> getFoodDataList(){
		return itemList.getItemsList();
	}
	
	@RequestMapping("/tt")
	public String welcome(){
		return "Welcome TO the SPring";
	}
}
