package Bench;

import java.util.Random;

public class Test{

    public static void main(String args[]){
        int a = 0; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"

        Random r = new Random();

        System.out.println(r.nextInt(100-1));
    }
}