package com.items.itemms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.items.itemms.model.ItemData;

@Service
public class ItemServiceImpl implements ItemService{
	
	protected RestTemplate restTemplate; 
	
	protected String serviceUrl ="http://google.com";
	
	@SuppressWarnings("unchecked")
	public List<ItemData> getItemsList(){

		//this.serviceUrl = application.getDbServiceUrl()+":"+application.getDbServicePort();
		List<ItemData> itemDataList = null;
		/*if(this.serviceUrl !=null){
			itemDataList  =  (List<ItemData>) restTemplate.getForObject(this.serviceUrl+ "/items/itemsList", ItemData.class, "");
		}*/
		itemDataList = new ArrayList<ItemData>();
		ItemData itdata = new ItemData();
		itdata.setItemId("I01");
		itdata.setItemName("Briyani");

		ItemData itdata1 = new ItemData();
		itdata1.setItemId("I02");
		itdata1.setItemName("Dosa");

		ItemData itdata2 = new ItemData();
		itdata2.setItemId("I03");
		itdata2.setItemName("Paani Puri");
		
		itemDataList.add(itdata);
		itemDataList.add(itdata1);
		itemDataList.add(itdata2);
		
		return itemDataList;
		
		//return null;
	}
}