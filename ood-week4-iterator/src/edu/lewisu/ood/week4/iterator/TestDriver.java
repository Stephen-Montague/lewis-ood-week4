package edu.lewisu.ood.week4.iterator;

import java.util.ArrayList;

/*
 * Stephen Montague
 * Object Oriented Development
 * Fall 2019 - Term 1
 * Week 4 - Iterator
 *
 * Summary:
 *     Demonstrates an Iterator Pattern using a grocery theme.
 *     Slightly mods Diner-themed code from course textbook -
 *     Head First Design Patterns, by Freeman, et al., available from -
 *     https://www.wickedlysmart.com/head-first-design-patterns/
 *
 * Program Notes:
 *     Uses an Iterator Pattern to print a list of grocery items.
 *     Does not implement java.util.iterator 
 *     so a remove() function is not supported / required.
 *     Current output:
 *         Produce on sale:
 *         Asparagus Broccoli Cabbage
 */

public class TestDriver {

	public static void main(String[] args) {
		printGroceries();
	}

	public static void printGroceries() {
		ProduceGroceries produceGroceries = new ProduceGroceries();
		ArrayList<GroceryItem> produceItems = produceGroceries.getGroceryItems();
		System.out.println("Produce on sale:");
		for (GroceryItem groceryItem : produceItems) {
			System.out.print(groceryItem.getName() + " ");
		}
	}
}