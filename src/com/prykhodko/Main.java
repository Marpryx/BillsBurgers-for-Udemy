////////////////////////////////////////////////////////////
// The Main class created to test the results of the      //
// BaseHamburger, CustomerBurger and DeluxeBurger classes //
///////////////////////////////////////////////////////////


package com.prykhodko;

public class Main {

    public static void main(String[] args) {

        BaseHamburger hamburger = new BaseHamburger("Basic", "Brown", "Chicken", 4.25);
        double price = hamburger.burgerPrice();

        hamburger.addAdditionalItem1("Lettuce", 0.95);
        hamburger.addAdditionalItem2("Cucumber", 0.45);
        hamburger.addAdditionalItem3("Cheese", 1.25);
        hamburger.addAdditionalItem4("Onion", 0.25);

        System.out.println("Total price is: " + hamburger.burgerPrice());

        CustomBurger customBurger = new CustomBurger("Ham", 5.99);
        customBurger.addExtra1("Tomatoes", 1.25);
        customBurger.addExtra2("Eggs", 1.05);
        System.out.println("The custom burger price is " + customBurger.burgerPrice());

    }

}
