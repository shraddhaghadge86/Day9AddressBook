package com.bridgelabz.addressbook;

import java.util.ArrayList;

public class AddressBook {
    static ArrayList<ContactPerson> contactPersons = new ArrayList<ContactPerson>();

    static void addPerson(ContactPerson person){
        contactPersons.add(person);
    }
    static void deleteContact(String name){
        System.out.println("Deleting " + name);
        System.out.println("");
        for (int i=0; i<contactPersons.size(); i++){
            if(contactPersons.get(i).firstName == name){
                contactPersons.remove(i);
            }
        }
    }
    static void editContactPerson(String name, ContactPerson person){
        System.out.println("Replacing " + name + " with " + person.firstName);
        System.out.println("");
        for (int i = 0; i < contactPersons.size(); i++){
            if(contactPersons.get(i).firstName == name){
                contactPersons.set(i,person);
            }
        }
    }
    static void showContacts(){
        System.out.println("Contact details");
        System.out.println("");
        for (int i = 0; i < contactPersons.size(); i++) {
            System.out.println(i+1 + ":" + contactPersons.get(i).firstName);
            System.out.println("____________________________________");
            System.out.println("Name : " + contactPersons.get(i).firstName + " " + contactPersons.get(i).lastName);
            System.out.println("Address : " + contactPersons.get(i).address);
            System.out.println("City : " + contactPersons.get(i).city);
            System.out.println("State : " + contactPersons.get(i).state);
            System.out.println("Zip : " + contactPersons.get(i).zip);
            System.out.println("Phone Number : " + contactPersons.get(i).phoneNumber);
            System.out.println("Email : " + contactPersons.get(i).email);
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        ContactPerson contact1 = new ContactPerson(
                "Shraddha",
                "Ghadge",
                "Kalmbi",
                "Satara",
                "MH",
                "415512",
                "8605512168",
                "shraddhaghadge86@gmail.com"
        );

        ContactPerson contact2 = new ContactPerson(
                "Avadhut",
                "Ghadge",
                "Kalambi",
                "Satara",
                "MH",
                "415512",
                "9156894526",
                "avadhutghadge@gmail.com"
        );
        ContactPerson contact3 = new ContactPerson(
                "Anvi",
                "Patil",
                "Palus",
                "Sangli",
                "MH",
                "416310",
                "7030568952",
                "anvipatil@gmail.com"
        );

        addPerson(contact1);
        addPerson(contact2);
        addPerson(contact3);

        showContacts();

        editContactPerson("Anvi",contact2);

        showContacts();
        deleteContact("Shraddha");
        showContacts();
    }
}
