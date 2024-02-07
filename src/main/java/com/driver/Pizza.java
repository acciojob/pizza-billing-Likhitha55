package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraToppingsPrice;
    private int paperBag;
    private int extraCheese;
    private int vegPizzaPrice=300;
    private int nonVegPizzaPrice=400;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
    }

    public int getPrice(){
        if(this.isVeg.equals(true)){
            return vegPizzaPrice;
        }
        else{
            return nonVegPizzaPrice;
        }

    }

    public void addExtraCheese(){
        this.extraCheese=80;
    }

    public void addExtraToppings(){
        if(this.isVeg.equals(true)){
            this.extraToppingsPrice=70;
        }else{
            this.extraToppingsPrice=120;
        }
    }

    public void addTakeaway(){
        this.paperBag=20;
    }

    public String getBill(){
        bill="";
        if(this.isVeg.equals(true)){
            bill+="Base Price Of The Pizza: "+this.vegPizzaPrice+"\n";
            price+=this.vegPizzaPrice;
        }else{
            bill+="Base Price Of The Pizza: "+this.nonVegPizzaPrice+"\n";
            price+=this.nonVegPizzaPrice;
        }
        if(this.extraCheese!=0){
            bill+="Extra Cheese Added: "+this.extraCheese+"\n";
            price+=this.extraCheese;
        }
        if(this.extraToppingsPrice!=0){
            bill+="Extra Toppings Added: "+this.extraToppingsPrice+"\n";
            price+=this.extraToppingsPrice;
        }
        if(this.paperBag!=0){
            bill+="Paperbag Added: "+this.paperBag+"\n";
            price+=this.paperBag;
        }
        bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}
