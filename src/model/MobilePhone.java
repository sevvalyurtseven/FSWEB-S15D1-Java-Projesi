package model;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>(); //artik bos bir arraylist'im var. Rahatca ekleme cıkarma yapabilcez
    }
}
