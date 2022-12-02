package TodayTest_02_12_22;

// Simulate a PhoneBook application where you can add Contacts, update a contact,
// delete a contact , view all contacts and also view a contact based on contact number.

import java.util.ArrayList;
import java.util.List;
public class PhoneBook {

    private String ContactName;
    private double contactNumber;
    private String email;
    // Constructor
    public PhoneBook(String contactName, double contactNumber, String address) {
        ContactName = contactName;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public PhoneBook() {

    }

    private List<PhoneBook> phoneBookList = new ArrayList<>();
    public List<PhoneBook> getPhoneBookList() {
        return phoneBookList;
    }

    public void setPhoneBookList(List<PhoneBook> phoneBookList) {
        this.phoneBookList = phoneBookList;
    }

    //   Method for Adding Contact
    public void addContact(PhoneBook phoneBook) {
        phoneBookList.add(phoneBook);
    }

    //   Method for Deleting a Contact
    public void deleteContact(PhoneBook phoneBook) {
        phoneBookList.remove(phoneBook);
    }

    //   Method for Updating Contact via Number
    public void updateContactViaNumber(double newContactNumber ,int index) {
        PhoneBook ph1=phoneBookList.get(index);
        ph1.setContactNumber(newContactNumber);
    }

    //   Method for Updating Contact via Name
    public void updateContactViaName(int index , String newContactName) {
        PhoneBook ph2=phoneBookList.get(index);
        ph2.setContactName(newContactName);
    }

    //   Method for Search Contact
    public PhoneBook getContact(double contactNumber) {
        boolean flag = false;
        PhoneBook searchedContact = new PhoneBook();
        for (PhoneBook phoneBook : phoneBookList) {
            if (phoneBook.getContactNumber() == contactNumber) {
                searchedContact = phoneBook;
                flag = true;
            }
        }
        if (flag) {
            return searchedContact;
        }
        else {
            return null;
        }

    }

    // Getters and Setters
    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public double getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(double contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return email;
    }

    public void setAddress(String address) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "ContactName='" + ContactName + '\'' +
                ", contactNumber=" + contactNumber +
                ", address='" + email + '\'' +
                '}';
    }
}