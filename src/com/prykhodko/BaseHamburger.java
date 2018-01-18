///////////////////////////////////////////////////////////////////////////
// The BaseHamburger class includes 4 extra additions that charged an    //
// additional price.                                                     //
//////////////////////////////////////////////////////////////////////////



package com.prykhodko;

public class BaseHamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addItemName1;
    private double addItemPrice1;

    private String addItemName2;
    private double addItemPrice2;

    private String addItemName3;
    private double addItemPrice3;

    private String addItemName4;
    private double addItemPrice4;

    public BaseHamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addAdditionalItem1(String name, double price){
        this.addItemName1 = name;
        this.addItemPrice1 = price;
    }

    public void addAdditionalItem2(String name, double price){
        this.addItemName2 = name;
        this.addItemPrice2 = price;
    }

    public void addAdditionalItem3(String name, double price){
        this.addItemName3 = name;
        this.addItemPrice3 = price;
    }

    public void addAdditionalItem4(String name, double price){
        this.addItemName4 = name;
        this.addItemPrice4 = price;
    }


    /////Getters/////////////////

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }



    public double burgerPrice(){
        double burgerPrice = this.price;
        System.out.println("The " + this.name + " is on a " + this.breadRollType + " costs " + this.price);

        if(this.addItemName1 != null){
            burgerPrice += this.addItemPrice1;
            System.out.println(this.addItemName1 + " was added for an extra " + this.addItemPrice1);

        }

        if(this.addItemName2 != null){
            burgerPrice += this.addItemPrice2;
            System.out.println(this.addItemName2 + " was added for an extra " + this.addItemPrice2);

        }

        if(this.addItemName3 != null){
            burgerPrice += this.addItemPrice3;
            System.out.println(this.addItemName3 + " was added for an extra " + this.addItemPrice3);

        }

        if(this.addItemName4 != null){
            burgerPrice += this.addItemPrice4;
            System.out.println(this.addItemName4 + " was added for an extra " + this.addItemPrice4);

        }

        return burgerPrice;

    }
}
