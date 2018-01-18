//////////////////////////////////////////////////////////////////////////
// The CustomBurger class is one of the varieties of the BaseHamburger  //
// that includes 6 additions.                                           //
/////////////////////////////////////////////////////////////////////////



package com.prykhodko;

public class CustomBurger extends BaseHamburger{

    private String extraItem1;
    private double extraItem1price;

    private String extraItem2;
    private double extraItem2price;

    public CustomBurger(String meat, double price) {
        super("ExtraVip", "Italian with flex seeds", meat, price);

    }

    public void addExtra1(String item, double price){
        this.extraItem1 = item;
        this.extraItem1price = price;
    }

    public void addExtra2(String item, double price){
        this.extraItem2 = item;
        this.extraItem2price = price;
    }

    @Override
    public double burgerPrice() {
        double newPrice = super.burgerPrice();
        if(extraItem1 != null){
            newPrice += extraItem1price;
            System.out.println("An extra " + extraItem1 + " was added for the " + extraItem1price );
        }

        if(extraItem2 != null){
            newPrice += extraItem2price;
            System.out.println("An extra " + extraItem2 + " was added for the " + extraItem2price );
        }
        return newPrice;
    }


}
