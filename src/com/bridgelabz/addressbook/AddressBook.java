package com.bridgelabz.addressbook;

import java.util.ArrayList;

public class AddressBook {
    static ArrayList<ContactPerson> contactPersons = new ArrayList<ContactPerson>();

    static void addPerson(ContactPerson person){
        contactPersons.add(person);
    }

    static void editContactPerson(String name, ContactPerson person){
        for (int i = 0; i < contactPersons.size(); i++){
            if(contactPersons.get(i).firstName == name){
                contactPersons.set(i,person);
            }
        }
    }

    static void showContacts(){
        for (int i = 0; i < contactPersons.size(); i++)
            System.out.println(contactPersons.get(i).firstName + " " +
                    contactPersons.get(i).lastName + " -> " + contactPersons.get(i).phoneNumber);
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
                "A",
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

        editContactPerson("Anvi",contact3);

        showContacts();
    }
}
