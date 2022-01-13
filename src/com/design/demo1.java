package com.design;

public class demo1 {
    public static void main(String[] args) {
        FruitFactory factory = new AppleFruitFactory();
        //s
        Apple fruit = (Apple) factory.produceFruit();

        fruit.eat();

    }
}
abstract class Fruit {

    public abstract void eat();
}
abstract class FruitFactory {

    public abstract Fruit produceFruit();
}
class Apple extends Fruit {
    @Override
    public void eat() {
        System.out.println("吃🍎");
    }
}
class AppleFruitFactory extends FruitFactory{
    @Override
    public Fruit produceFruit() {
        return new Apple();
    }
}