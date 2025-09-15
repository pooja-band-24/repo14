
package com.example.app.service;

import com.example.app.model.Item;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemService {
    private final Map<Integer, Item> items = new HashMap<>();

    public List<Item> getAllItems() {
        return new ArrayList<>(items.values());
    }

    public Item getItem(int id) {
        return items.get(id);
    }

    public void addItem(Item item) {
        items.put(item.getId(), item);
    }

    public void updateItem(int id, Item item) {
        items.put(id, item);
    }

    public void deleteItem(int id) {
        items.remove(id);
    }
}
