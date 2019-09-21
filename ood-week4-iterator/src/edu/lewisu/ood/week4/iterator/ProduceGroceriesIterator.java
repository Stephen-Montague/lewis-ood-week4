package edu.lewisu.ood.week4.iterator;

import java.util.ArrayList;

public class ProduceGroceriesIterator implements Iterator {
	ArrayList<GroceryItem> items;
	int position = 0;
 
	public ProduceGroceriesIterator(ArrayList<GroceryItem> items) {
		this.items = items;
	}
 
	public GroceryItem next() {
		GroceryItem item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
