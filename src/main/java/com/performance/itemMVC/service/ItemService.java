package com.performance.itemMVC.service;

import java.util.List;

import com.performance.itemMVC.domain.Item;

public interface ItemService {

	public List<Item> findByCategory(String category);

	public Item createItem(Item item);

	public List<Item> createAllItems(List<Item> items);

}
