package org.example;

public class BusinessContact extends Contact {

    String companyName;
    String telephoneNumber;


    public BusinessContact(String name, String companyName, String telephoneNumber) {
        super(name);
        this.companyName = companyName;
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "companyName='" + companyName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
