package edu.neu.csye6200;

//ElectronicItemFactory.java (Lazy Singleton)
import java.util.List;
import java.util.ArrayList;

public class ElectronicItemFactory {
 private static ElectronicItemFactory instance;

 private ElectronicItemFactory() {}

 public static ElectronicItemFactory getInstance() {
     if (instance == null) {
         instance = new ElectronicItemFactory();
     }
     return instance;
 }

 public List<ElectronicItem> createItems(String filename) {
     List<ElectronicItem> items = new ArrayList<>();
     for (String line : FileUtil.readFile(filename)) {
         items.add(new ElectronicItem(line));
     }
     return items;
 }
}

