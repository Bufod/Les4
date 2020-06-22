package com.company;

import java.util.Scanner;

class Table{
    int countLeg;
    double square;
    String material;
    final double PRICE_COUNTERTOP = 100, PRICE_ONE_LEG = 20;

    Table(){}

    public Table(int countLeg, double square, String material) {
        this.countLeg = countLeg;
        this.square = square;
        this.material = material;
    }

    public void setCountLeg(int countLeg) {
        this.countLeg = countLeg;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double amount(){
        int k = 1;

        if (material.equalsIgnoreCase("бук"))
            k = 10;
        else if (material.equalsIgnoreCase("мдф"))
            k = 5;
        else if (material.equalsIgnoreCase("береза"))
            k = 2;

        return countLeg*PRICE_ONE_LEG + square*PRICE_COUNTERTOP*k;
    }

    // создать метод принимающий массив и вычисляющий итоговую стоимость
    // для всех столов которые были созданы
}

public class Main {

    public static void outMaterial(String[] materials){
        for (int i = 0; i < materials.length; i++) {
            System.out.println((i+1) + ") " + materials[i]);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Фабрика \"мир столов\"");
        System.out.println("Хотите заказать стол? \n 1) да \n 2) нет");

        String[] arrMaterial = {"бук", "мдф", "береза"};
        Table[] arrTable = new Table[10];
        if (in.nextInt() == 1){
            for (int i = 0; i < arrTable.length; i++) {
                System.out.println("\t 1) создать стол \n" +
                        "2) выйти из программы");
                if (in.nextInt() == 1){
                    arrTable[i] = new Table();
                    System.out.println("Выберете материал:");
                    outMaterial(arrMaterial);
                    arrTable[i].setMaterial(
                            arrMaterial[in.nextInt()] // проверить ввод
                    );
                    // спросить размер столешницы
                    // спросить количество ножек

                } else
                    break;
            }
        } else {
            System.out.println("До свидания!");
        }

        // итог

    }
}
