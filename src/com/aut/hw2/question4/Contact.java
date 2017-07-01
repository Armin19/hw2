package com.aut.hw2.question4;


public class Contact {
    private String name;
    private String phoneNumber;
    private String birthday;

    public Contact contact1(String name, String phoneNumber, String birthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        return null;
    }

    public Contact contact2(String name2, String phoneNumber2, String birthday2) {
        this.name = name2;
        this.phoneNumber = phoneNumber2;
        this.birthday = null;
        return null;
    }

    public class AddressBook {
        private String[] contacts;
        private int last = 0;

        private void contactList() {
            String[] list = contacts;
            System.out.println(list);
        }

        private void add(String newContactName, String newContactphoneNumber) {
            name = newContactName;
            phoneNumber = newContactphoneNumber
        }

        public void setContacts(String[] contacts) {
            this.contacts = contacts;
            last++;
        }
    }

    public static void main(String[] args) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
