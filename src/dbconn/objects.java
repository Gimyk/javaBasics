package dbconn;

import java.util.Scanner;

public class objects {

    public static void main(String[] args) {
        Animal an = new Animal("Dog", 2, 1, 12.5);
        test(an);
    }

    public static void test(Animal nn) {
        System.out.println("The Name are: " + nn.getName());
        System.out.println("The Age are: " + nn.getAge());
        System.out.println("The Height are: " + nn.getHeight());
        System.out.println("The Weight are: " + nn.getWeight());
    }

}

class Animal {

    private String name;
    int age;
    double height, weight;

    public Animal(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
