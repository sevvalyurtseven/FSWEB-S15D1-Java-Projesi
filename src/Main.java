import model.GroceryList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryList groceryList = new GroceryList();
        int choice;
        do{
            System.out.println("Yapılmak istenen operasyonu seçin(0: Quit, 1: Ekleme, 2: Çıkarma)");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz: (Birden fazlaysa virgül kullanın)");
                    String itemsToAdd = scanner.nextLine();
                    groceryList.addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.println("Silinmesini istediğiniz elemanları giriniz: (Birden fazlaysa virgül kullanın)");
                    String itemsToRemove = scanner.nextLine();
                    groceryList.removeItems(itemsToRemove);
                    break;
                default:
                    System.out.println("0,1,2 arasında değer seçmeniz gerekiyor! Sizin seçiminiz: " + choice);
                    break;
            }
            groceryList.printSorted();
        } while(choice != 0);
        scanner.close();
    }
}