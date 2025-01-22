package com.prabal.mini_project.Service;

import java.util.List;
import java.util.Optional;

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
		Optional<Item> userOptional = itemRepository.findById(id); 
		return userOptional.orElse(null);
	}
         
	
	public Item addItem(Item item) {
		return itemRepository.save(item);
	}
	
	public Item updateItemById(Item updateItem) {
		if(itemRepository.existsById(updateItem.getId())) {
			return itemRepository.save(updateItem);
		}
		throw new RuntimeException("Item does not exist");

	}
	
	public String deleteItem(Long id) {
		if(itemRepository.existsById(id)) {
			itemRepository.deleteById(id);
			return "Item Deleted!";
		}
		else {
			return "Item does not Exist";
		}
		
	}
}
