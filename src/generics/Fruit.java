package generics;

public class Fruit implements Eatable{
    public String toString(){
        return "Fruit";
    }

    @Override
    public void eat() {
        System.out.println("냠냠");
    }
}
