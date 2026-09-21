package com.example.smartpantryapp;

public class Ingredients {
    private int id;
    private String name;
    private double quantity;
    private String expirydate;
    private String unit;
//Method Overloading is used for reading an existing ingredient and adding a new ingredient
    public Ingredients(int id,String name,double quantity,String expirydate,String unit){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.unit=unit;
        this.expirydate=expirydate;
    }
    public Ingredients(String name, double quantity,
                      String unit, String expiryDate) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.expirydate = expirydate;
    }

    public int getID(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getName(){
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }
}
