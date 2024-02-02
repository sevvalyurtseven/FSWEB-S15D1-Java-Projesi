package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GroceryList {
    private ArrayList<String> items;

    public GroceryList() {
        this.items = new ArrayList<>();
    }

    public void addItems(String items){
        String[] splitItems = splitItems(items); //elemanlar virgülle ayrılabilir
        for(String item : splitItems){ //her bir item'i splitItems'in icini gezerek alalim
            String trimmedItem = item.trim(); //bastaki ve sondaki bosluklari siler
            if(checkItemIsInList(trimmedItem)){ //item listede var mi yok mu kontrol ediyor!
                System.out.println(trimmedItem + " already exist!");
            }
            else {
                this.items.add(trimmedItem);
                sortItems();
            }
        }
    }

    public void removeItems(String items){
        String[] splitItems = splitItems(items);
        for(String item : splitItems){
            String trimmedItem = item.trim();
            if(checkItemIsInList(trimmedItem)){
                System.out.println("Remove operation failed because item is not exist: " + trimmedItem);
            }
            else {
               this.items.remove(trimmedItem);
            }
        }
    }

    private void sortItems(){
        Collections.sort(items);
    }

    private boolean checkItemIsInList(String trimmedItem){
        return items.contains(trimmedItem); //gelen item listede varsa TRUE doncek
    }

    private String[] splitItems(String items){
        return items.split(",");  //virgule gore split ediyor ve bir array donuyor.
    }
}
