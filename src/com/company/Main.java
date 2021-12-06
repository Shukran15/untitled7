package com.company;

import animals.Camel;
import interfaces.Transfer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        {
          int animals[] = new int [0];
         try {

             System.out.println("Подсчет животных");
             animals[2] = 1;
         } catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Ошибка! Вы ввели больше одного животного!");
         }


        }


        {
            File file = new File("Dog");

            try {
                Scanner scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка, такого файла не существует!");
            }

        }

        Train train = new Train();
        train.transfer(100, "Некрасовку");
        train.fillup(500);
        train.transfer(100, "Некрасовку");


        Electrictrain electrictrain = new Electrictrain();
        electrictrain.transfer(70, "Пенягино");
        electrictrain.fillup(300);
        electrictrain.transfer(70, "Пенягино");

        Transfer[] transfers = new Transfer[3];
        transfers[0] = new Train();
        transfers[1] = new Electrictrain();
        transfers[2] = new Camel();

        System.out.println();

        transferAll(2, "Египет", transfers);


        Way way1 = new Way("Nekrasovka-Kosino", 1000);
        Way way2 = new Way("Kosino-Nekrasovka", 1000);

        Priceway priceway = new Priceway(45, 65);

        Tunnel tunnel1 = new Tunnel(200);
        Tunnel tunnel2 = new Tunnel(300);
        Tunnel tunnel3 = new Tunnel(500);

        Depo depo = new Depo(15, "Lermontovsy prospekt");
    }

    private static void transferAll(int people, String place, Transfer[] transfers) {
        for (Transfer ts : transfers) {
            ts.transfer(people, place);
        }

    }




}
