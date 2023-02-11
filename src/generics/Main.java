package generics;

public class Main {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();


        Object d = new Object();

        FruitBox<Fruit> fruitFruitBox = new FruitBox<>();
        fruitFruitBox.add(new Apple());
        fruitFruitBox.add(new Grape());

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
        appleBox.add(new Apple());



        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);

    }
}
