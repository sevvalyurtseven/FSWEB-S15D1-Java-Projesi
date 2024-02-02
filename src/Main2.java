import model.Contact;
import model.MobilePhone;

public class Main2 {
    public static void main(String[] args) {
        Contact mehmet = new Contact("Mehmet", "555-555-55-55");
        Contact ayse = new Contact("Ayse", "555-555-55-54");
        Contact ahmet = new Contact("Ahmet", "555-555-55-53");
        Contact murat = new Contact("Murat", "555-555-55-52");

        MobilePhone mobilePhone = new MobilePhone("555-555-55-00");
        mobilePhone.addNewContact(mehmet);
        mobilePhone.addNewContact(ayse);
        mobilePhone.addNewContact(murat);
        mobilePhone.addNewContact(ahmet);

        System.out.println("---- phone started!");
        mobilePhone.printContact();

        System.out.println("---- phone contact show ended!");

        System.out.println("Update Contact");
        mobilePhone.updateContact(ahmet, new Contact("Ahmet", "444-444-44-44"));
        mobilePhone.printContact();

        System.out.println("Remove Contact");

        mobilePhone.removeContact(mehmet);
        mobilePhone.printContact();

        System.out.println("Query Contact");
        Contact contact = mobilePhone.queryContact("Test");

        if(contact != null)
        System.out.println(contact.toString());
        else
            System.out.println("Result null for Query");

        System.out.println("Find Contact 1 started");
        int contact1 = mobilePhone.findContact(murat);
        System.out.println("contact1 index: " + contact1);

        System.out.println("Find Contact 2 started");
        int contact2 = mobilePhone.findContact("Ahmet");
        System.out.println("Contact 2 index: " + contact2);


    }
}
