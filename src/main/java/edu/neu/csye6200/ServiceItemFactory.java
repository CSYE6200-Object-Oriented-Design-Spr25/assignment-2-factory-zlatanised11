package edu.neu.csye6200;

//ServiceItemFactory.java (Eager Singleton)
import java.util.List;
import java.util.ArrayList;

public class ServiceItemFactory {
 private static final ServiceItemFactory instance = new ServiceItemFactory();

 private ServiceItemFactory() {}

 public static ServiceItemFactory getInstance() {
     return instance;
 }

 public List<ServiceItem> createItems(String filename) {
     List<ServiceItem> items = new ArrayList<>();
     for (String line : FileUtil.readFile(filename)) {
         items.add(new ServiceItem(line));
     }
     return items;
 }
}

