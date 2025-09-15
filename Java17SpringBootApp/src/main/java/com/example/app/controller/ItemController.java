
package com.example.app.controller;

import com.example.app.model.Item;
import com.example.app.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable int id) {
        return itemService.getItem(id);
    }

    @PostMapping
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @PutMapping("/{id}")
    public void updateItem(@PathVariable int id, @RequestBody Item item) {
        itemService.updateItem(id, item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id) {
        itemService.deleteItem(id);
    }
}
