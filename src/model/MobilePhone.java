package model;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>(); //artik bos bir arraylist'im var. Rahatca ekleme cıkarma yapabilcez
    }


    //findContact: Contact türünde bir parametre alır ve int değer döndürür. Dönüş değeri Contact objesinin listedeki
    // indeksi olmalıdır. Eğer eleman listede yoksa -1 değeri döner.

    public int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    //findContact: yukardaki findContact metodu ile aynı şekilde çalışır. Sadece parametresinin tipi String olmalıdır.

    public int findContact(String name){
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i); //i. siradaki contact'i elde ederiz
            if(contact.getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }

    //addNewContact: Contact türünde bir parametre alır. Boolean türünde bir değer döndürür. Contact listede yoksa
    // Contact objesini listeye ekleyip true varsa false değeri döner.

    public boolean addNewContact(Contact contact){
        if(contact == null || contact.getName() == null || contact.getPhoneNumber() == null){
            return false;
        }
        if(findContact(contact.getName()) >= 0){
            //contact ekledigimde boyle bir contact varsa false donsun.
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int oldContactIndex = findContact(oldContact);
        if(oldContactIndex < 0 ){
            return false;
        }
        this.myContacts.set(oldContactIndex, newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact) < 0){
            return false;
        }
        this.myContacts.remove(contact);
        return true;
    }

}
