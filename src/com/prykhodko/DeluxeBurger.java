//////////////////////////////////////////////////////////////////////////
// The DeluxeBurger class is one of the varieties of the BaseHamburger  //
// that includes chips and drinks as additions but do not allow any     //
// extra additions to modify the order.                                 //
/////////////////////////////////////////////////////////////////////////


package com.prykhodko;

public class DeluxeBurger extends BaseHamburger {

    public DeluxeBurger() {
        super("Deluxe", "White with seeds", "chicken", 10.99);
        super.addAdditionalItem1("Chips", 3.25);
        super.addAdditionalItem2("Drink", 1.55);
    }

    @Override
    public void addAdditionalItem1(String name, double price) {
        System.out.println("Cannot add more items to a deluxe burger");
    }

    @Override
    public void addAdditionalItem2(String name, double price) {
        System.out.println("Cannot add more items to a deluxe burger");
    }

    @Override
    public void addAdditionalItem3(String name, double price) {
        System.out.println("Cannot add more items to a deluxe burger");
    }

    @Override
    public void addAdditionalItem4(String name, double price) {
        System.out.println("Cannot add more items to a deluxe burger");
    }
}
