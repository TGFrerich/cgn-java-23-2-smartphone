package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS {

    boolean hasRadio = true;
    boolean hasGPS = true;

    private String modelName;
    private String nameOfManufacturer;
    private List<Contact> contactList;
    public boolean startRadio() {
        System.out.println("Radio started.");
        return true;
    }
    public boolean stopRadio() {
        System.out.println("Radio stopped.");
        return false;
    }

    public String getPosition() {
        return "Köln";

    }

    public Smartphone() {
    }

    public Smartphone(boolean hasRadio, boolean hasGPS, String modelName, String nameOfManufacturer, List<Contact> contactList) {
        this.hasRadio = hasRadio;
        this.hasGPS = hasGPS;
        this.modelName = modelName;
        this.nameOfManufacturer = nameOfManufacturer;
        this.contactList = contactList;
    }

    public void addContact(Contact newContact){
        contactList.add(newContact);

    }

    // Getter and Setter ///////////////////////////////////////

        public boolean isHasRadio () {
        return hasRadio;
    }

        public void setHasRadio ( boolean hasRadio){
        this.hasRadio = hasRadio;
    }

        public boolean isHasGPS () {
        return hasGPS;
    }

        public void setHasGPS ( boolean hasGPS){
        this.hasGPS = hasGPS;
    }

        public String getModelName () {
        return modelName;
    }

        public void setModelName (String modelName){
        this.modelName = modelName;
    }

        public String getNameOfManufacturer () {
        return nameOfManufacturer;
    }

        public void setNameOfManufacturer (String nameOfManufacturer){
        this.nameOfManufacturer = nameOfManufacturer;
    }

        public List<Contact> getContactList () {
        return contactList;
    }

        public void setContactList (List < Contact > contactList) {
        this.contactList = contactList;
    }

//    //////////////////////////////////

    @Override
    public String toString() {
        return "Smartphone{" +
                "hasRadio=" + hasRadio +
                ", hasGPS=" + hasGPS +
                ", modelName='" + modelName + '\'' +
                ", nameOfManufacturer='" + nameOfManufacturer + '\'' +
                ", contactList=" + contactList +
                '}';
    }
}

