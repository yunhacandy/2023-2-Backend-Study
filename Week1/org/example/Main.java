package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public int plus(int a, int b) {
                return a + b;
            }
            @Override
            public int minus(int a, int b) {
                return a - b;
            }
            @Override
            public int mul(int a, int b) {
                return a * b;
            }
            @Override
            public int div(int a, int b) {
                return a / b;
            }
        };

        System.out.println("1234 + 4321 = " + calculator.plus(1234, 4321));
        System.out.println("911 - 170 = " + calculator.minus(911, 170));
        System.out.println("2 * 3 = " + calculator.mul(2, 3));
        System.out.println("33 / 11 = " + calculator.div(33, 11));

        System.out.println("\n");

        class Cat extends Animal {
            @Override
            public void speak() {
                System.out.println("Cats says Meow!");
            }
        }

        class Dog extends Animal {
            @Override
            public void speak() {
                System.out.println("Dogs says Woof!");
            }
        }

        Cat cat = new Cat(); // 다른 동물 하셔도 상관 없습니다!
        Dog dog = new Dog() ;
        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}