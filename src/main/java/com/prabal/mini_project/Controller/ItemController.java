package com.prabal.mini_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prabal.mini_project.Model.Item;
import com.prabal.mini_project.Service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
	
	@GetMapping("/{id}")
	public Item getById(@PathVariable Long id) {
		return itemService.getItemsById(id);
	}
	
	@PostMapping
	public Item addItem(@RequestBody Item item) {
		return itemService.addItem(item);
	}
	
	@PutMapping
	public Item updateItem(@RequestBody Item updatedItem) {
		return itemService.updateItemById(updatedItem);
	}
	
	@DeleteMapping("/{id}")
	public String deleteItemById(@PathVariable Long id) {
		return itemService.deleteItem(id);
	}
}
