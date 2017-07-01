package com.aut.hw2.question3;


public class Address {

    private String number;
    private String street;
    private String apartmentNumber;
    private String city;
    private String postCode;
    Address address;

    public Address(Address address2) {
        this.address2 = address2;
        address = new Address(this.address2);
    }

    public Address address(String number, String street, String apartmentNumber, String city, String postCode) {
        this.number = number;
        this.street = street;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.postCode = postCode;

        return null;
    }

    public Address address2(String number2, String street2, String apartmentNumber2, String city2, String postCode2) {
        this.number = number2;
        this.street = street2;
        this.apartmentNumber = apartmentNumber2;
        this.city = city2;
        this.postCode = postCode2;
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    String s1 = address.toString();
    private Address address2;
    String s2 = address2.toString();

    private boolean isEqual() {
        if (s1.equals(s2)) {
            return true;
        } else return false;
    }

    boolean equal = address.isEqual(address2);

    private boolean isEqual(Address address2) {
        if (s1.equals(s2)) return true;
        else return false;
    }

    public static void main(String[] args) {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
