package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 5 чисел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int[] mas = new int[5];
        //int [] mas={1, -2, 3, 7, 5};
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();
        }

       System.out.print("Чётные: ");
        for (int x : mas) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }

        System.out.println("");
        System.out.print("Нечётные: ");
        for (int y : mas) {
            if (y % 2 == 1|| y%2==-1) {
                System.out.print(y + " ");
            }
        }
        System.out.println(" ");
        int max=mas[0];
        for(int i=0; i<mas.length; i++){
            if(mas[i]>max){
                max=mas[i];}
        }
        System.out.println("Максимальное число: "+max);

        int min=mas[0];
        for(int i=0; i<mas.length; i++){
            if(mas[i]<min){
                min=mas[i];}
        }
        System.out.println("Минимальное число: "+min);
            }


        }



   // }

