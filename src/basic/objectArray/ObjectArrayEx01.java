package basic.objectArray;

public class ObjectArrayEx01 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new Tv());
        buyer.buy(new SmartPhone());
    }
}

class Product{
    int price;
}

class Tv extends Product{
    public void print(){
        System.out.println("Tv");
    }
}

class SmartPhone extends Product{
    public void print(){
        System.out.println("SmartPhone");
    }
}

class Buyer{
    Product[] cart = new Product[10];
    int i = 0;

    public void buy(Product product){
        cart[i++] = product;
    }

    public void print(){
        for(int i = 0; i < cart.length; i ++){

        }
    }
}