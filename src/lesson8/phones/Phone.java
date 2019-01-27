package lesson8.phones;

public class Phone {

    int price;
    double weight;
    String countryProduced;

    public Phone(int price, double weight, String countryProduced) {
        System.out.println("Phone constuctor was invoked...");
        this.price = price;
        this.weight = weight;
        this.countryProduced = countryProduced;
    }
    void orderPhone (){
        System.out.println("Order phone invoked...");
    }
}
