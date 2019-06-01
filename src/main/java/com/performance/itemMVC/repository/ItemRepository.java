package com.performance.itemMVC.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.performance.itemMVC.domain.Item;

public interface ItemRepository extends CrudRepository<Item, String> {

	public List<Item> findByCategory(String category);

}
