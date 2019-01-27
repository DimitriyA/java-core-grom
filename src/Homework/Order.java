package Homework;

import java.util.Date;


public class Order {



    //1 fields
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;
//2 constructors


    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }



//3 methods

    void  confirmOrder(){
        this.isConfirmed = true;
        dateConfirmed = new Date();
    }

    public boolean checkPrice(){
        return this.price > 1000;

    }

    public  boolean isValidType(){
        return(this.type.equals("Buy" ) || this.type.equals("Sale") );

    }
}
