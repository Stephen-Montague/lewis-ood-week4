package edu.lewisu.ood.week4.iterator;

import java.util.ArrayList;

public class ProduceGroceries implements Groceries {
	ArrayList<GroceryItem> groceryItems;
 
	public ProduceGroceries() {
		groceryItems = new ArrayList<GroceryItem>();
		addItem("Asparagus");
		addItem("Broccoli");
		addItem("Cabbage");
	}

	public void addItem(String name) {
		GroceryItem groceryItem = new GroceryItem(name);
		groceryItems.add(groceryItem);
	}
 
	public ArrayList<GroceryItem> getGroceryItems() {
		return groceryItems;
	}
  
	public Iterator createIterator() {
		return new ProduceGroceriesIterator(groceryItems);
	}
  
	public String toString() {
		return "Produce groceries on sale";
	}

}
