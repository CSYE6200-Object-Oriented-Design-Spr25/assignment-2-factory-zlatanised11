package edu.neu.csye6200;

//FoodItemFactory.java
import java.util.List;
import java.util.ArrayList;

public class FoodItemFactory {
 public List<FoodItem> createItems(String filename) {
     List<FoodItem> items = new ArrayList<>();
     for (String line : FileUtil.readFile(filename)) {
         items.add(new FoodItem(line));
     }
     return items;
 }
}

