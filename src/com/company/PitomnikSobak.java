package com.company;

import java.util.Scanner;

public class PitomnikSobak {
    private Dog[] mas;

    public PitomnikSobak() {
        int n;
         String NameOfDog;
         int Age;
        Scanner scan = new Scanner(System.in);;
        System.out.println("Введите количество собак, которых хотите добавить");
        n=scan.nextInt();
        this.mas = new Dog[n];
        for(int i=0;i<n;i++){
            System.out.print("Введите имя собаки: ");
            NameOfDog=scan.nextLine();
            System.out.print("Введите возраст собаки: ");
            Age= scan.nextInt();
            Dog first=new Dog();
            first.setAge(Age);
            first.setNameOfDog(NameOfDog);
        }
    }
}
