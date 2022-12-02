package TodayTest_02_12_22;


import java.util.InputMismatchException;
import java.util.Scanner;
    public class PhoneBookTest {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            PhoneBook phone = new PhoneBook();
            PhoneBook allData = new PhoneBook();

            try {
                while (true) {

                    System.out.println("Select Choice ------");
                    System.out.println("1.Add Contact");
                    System.out.println("2.Delete Contact");
                    System.out.println("3.Update Contact ");![](../../../../../../ABHISH~1/AppData/Local/Temp/download.jpg)
                    System.out.println("4.Search Contact");
                    System.out.println("5.Display all Contacts");
                    System.out.println("6.Exit");
                    System.out.println("Enter your choice:");
                    int ch = sc.nextInt();
                    if (ch == 1) {
                        System.out.println("Enter New Contact Name :");
                        String contactName = sc.next();
                        if (contactName.matches("^[a-zA-Z]*$*")){}
                        else {
                            throw new InputMismatchException();
                        }
                        System.out.println("Enter Contact Number :");
                        double contactNumber = sc.nextDouble();
                        System.out.println("Enter Email  :");
                        String email = sc.next();
                        PhoneBook phoneBook = new PhoneBook(contactName, contactNumber, email);
                        phone.addContact(phoneBook);
                        System.out.println("Contact Added Successfully");
                    } else if (ch == 2) {
                        System.out.println("Enter contact number which you want to delete :");
                        double contactNumber = sc.nextDouble();
                        PhoneBook phoneBook = phone.getContact(contactNumber);
                        phone.deleteContact(phoneBook);
                        System.out.println("Contact Deleted Successfully");
                    } else if (ch == 3) {

                        System.out.println("enter the index of the phone number :");
                        int index = sc.nextInt();
                        System.out.println("enter your choice to Update 1:Phone number 2:Name");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter your phone Number to update :");
                                double newContactNumber = sc.nextDouble();
                                phone.updateContactViaNumber(newContactNumber, index);
                                break;
                            case 2:
                                System.out.println("Enter your new Name to update :");
                                String newContactName = sc.next();
                                phone.updateContactViaName(index, newContactName);
                                break;
                        }

                    } else if (ch == 4) {
                        System.out.println("Enter contact number which you want to search :");
                        double contactNumber = sc.nextDouble();
                        PhoneBook phoneBook = phone.getContact(contactNumber);
                        System.out.println(phoneBook);
                    } else if (ch == 6) {
                        System.out.println("Program Ended ......");
                        break;
                    }
                    else if (ch == 5) {
                        for(PhoneBook alldata : phone.getPhoneBookList()) {
                            System.out.println(alldata);
                        }

                    }else {
                        ch = 1;
                    }
                }

            } catch (InputMismatchException | NumberFormatException  e) {
                if(e instanceof NumberFormatException)
                    System.out.println("NumberFormat Exception");
                else if(e instanceof InputMismatchException)
                    System.out.println("Input Format is wrong");
            }


        }
    }