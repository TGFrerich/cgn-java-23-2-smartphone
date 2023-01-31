package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Smartphone iPhone = new Smartphone();

        Friend ingo = new Friend("Ingo", "+4913344452");
        Friend johannes = new Friend("Johannes", "+49524342342");
        Friend hamideh = new Friend("Hamideh", "01556434345");
        Friend roh = new Friend("Roh", "0226323555");
        BusinessContact bjoern = new BusinessContact("Björn", "Draeger","017443479853");

        System.out.println(ingo.toString());

        List<Contact> tomsContacts = new ArrayList<>();
        iPhone.setContactList(tomsContacts);
        tomsContacts.add(ingo);
        tomsContacts.add(johannes);
        tomsContacts.add(hamideh);
        tomsContacts.add(roh);
        iPhone.addContact(bjoern);



        iPhone.startRadio();
        iPhone.stopRadio();
        System.out.println(iPhone.getPosition());

        System.out.println(iPhone.toString());



    }
}