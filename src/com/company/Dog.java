package com.company;

public class Dog {
    private String NameOfDog;
    private int Age;
    private int HumanAge;
    public Dog() {};

    public void setNameOfDog(String nameOfDog) {
        NameOfDog = nameOfDog;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getNameOfDog() {
        return NameOfDog;
    }

    public int getAge() {
        return Age;
    }

    public void translatingAge(){
        HumanAge = Age*7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "NameOfDog='" + NameOfDog + '\'' +
                ", Age=" + Age +
                ", HumanAge=" + HumanAge +
                '}';
    }
}
