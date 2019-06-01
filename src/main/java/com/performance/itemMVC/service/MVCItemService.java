package com.performance.itemMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.performance.itemMVC.domain.Item;
import com.performance.itemMVC.repository.ItemRepository;

@Service
public class MVCItemService implements ItemService {

	@Autowired
	private ItemRepository itemRepo;

	@Override
	public List<Item> findByCategory(String category) {
		// TODO Auto-generated method stub
		return itemRepo.findByCategory(category);
	}

	@Override
	public List<Item> createAllItems(List<Item> items) {
		// TODO Auto-generated method stub
		return (List<Item>) itemRepo.saveAll(items);
	}

	@Override
	public Item createItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepo.save(item);
	}

}
