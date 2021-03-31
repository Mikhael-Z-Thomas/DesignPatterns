package Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();

        object1.number = object1.number*5;

        System.out.println(object1.number);
        System.out.println(object2.number);
    }
}
