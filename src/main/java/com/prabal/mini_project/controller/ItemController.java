package com.prabal.mini_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prabal.mini_project.entities.Item;
import com.prabal.mini_project.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
	
	@GetMapping("/{itemId}")
	public Item getById(@PathVariable(name="itemId") Long id) {
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
