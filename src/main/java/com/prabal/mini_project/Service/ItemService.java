package com.prabal.mini_project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabal.mini_project.Model.Item;
import com.prabal.mini_project.Repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	ItemRepository itemRepository;
	
	public List<Item> getAllItems(){
		return itemRepository.findAll();
	}
	
	public Item getItemsById(Long id){
		return itemRepository.getReferenceById(id); //getById is depreciated
	}
	
	public Item addItem(Item item) {
		return itemRepository.save(item);
	}
	
	public Item updateItemById(Long id, Item updateItem) {
		if(itemRepository.existsById(id)) {
			return itemRepository.save(updateItem);
		}
		throw new RuntimeException("Item does not exist");
	}
	
	public String deleteItem(Long id) {
		
		itemRepository.deleteById(id);
		return "Item Deleted!";
	}
}
