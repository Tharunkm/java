package week7;
class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public String eat() {
        return "Eating " + name + " - it tastes " + taste + ".";
    }
}

class Apple extends Fruit {
    public Apple(String name, String size) {
        super(name, "sweet", size);
    }

    @Override
    public String eat() {
        return "Crunching on an " + name + " - it tastes " + taste + ".";
    }
}

class Orange extends Fruit {
    public Orange(String name, String size) {
        super(name, "tangy", size);
    }

    @Override
    public String eat() {
        return "Savoring an " + name + " - it tastes " + taste + ".";
    }
}

