package edu.neu.csye6200;

//Store.java
import java.util.*;

public class Store extends AbstractStore {
 private List<Item> items = new ArrayList<>();

 @Override
 public void demo() {
     // Load items from CSV files
     items.addAll(new FoodItemFactory().createItems("FoodItemCSV.txt"));
     items.addAll(ElectronicItemFactory.getInstance().createItems("ElectronicItemCSV.txt"));
     items.addAll(ServiceItemFactory.getInstance().createItems("ServiceItemCSV.txt"));

     // Sorting and displaying
     System.out.println("Sorted by ID:");
     items.sort(Comparator.comparingInt(Item::getId));
     items.forEach(System.out::println);

     System.out.println("\nSorted by Name:");
     items.sort(Comparator.comparing(Item::getName));
     items.forEach(System.out::println);

     System.out.println("\nSorted by Price:");
     items.sort(Comparator.comparingDouble(Item::getPrice));
     items.forEach(System.out::println);
 }
}
