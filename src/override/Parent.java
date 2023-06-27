package override;

class Parent {
    public void hello(String name) {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }
}

class Child extends Parent{
    public void hello() {
        System.out.println("안녕!");
    }
}

class Main{
    public static void main(String[] args) {
        Child child = new Child();
        child.hello();
    }
}


