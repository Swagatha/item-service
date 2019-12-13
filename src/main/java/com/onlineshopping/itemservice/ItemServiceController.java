package com.onlineshopping.itemservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemServiceController {
	
	@Autowired
	ItemRepository itemRepository;

	@GetMapping("/items/{itemName}")
	public Items getItemsByItemName(@PathVariable String itemName) {
		//		return new Items(1001L, "Tie", "Red Silk Tie" , 399.00);
		
		Items items = itemRepository.findByItemName(itemName);
		return items;
	}
	
	
}
