package week7;
public class FruitDemo {
    public static void main(String[] args) {
        Apple apple = new Apple("Red Apple", "medium");
        Orange orange = new Orange("Orange", "large");

        System.out.println(apple.eat());  // Output: Crunching on a Red Apple - it tastes sweet.
        System.out.println(orange.eat()); // Output: Savoring a Navel Orange - it tastes tangy.
    }
}
