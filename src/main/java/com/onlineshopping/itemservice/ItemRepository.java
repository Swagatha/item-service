package com.onlineshopping.itemservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Items, Long> {
	Items findByItemName(String itemName);
}
