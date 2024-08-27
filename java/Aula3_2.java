package com.mycompany.aula3_2;

import java.util.Scanner;
import java.util.ArrayList;

public class Aula3_2 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Digite numeros positivos: ");
        int number = input.nextInt();
        numbers.add(number);

        while (number >= 0) 
        {
            System.out.print("continue digitando: ");
            number = input.nextInt();
            numbers.add(number);
        }
        System.out.println("\n\n\nPARES: ");
        for (int object : numbers) 
        {
            if (object % 2 == 0 && object >= 0) 
            {
                System.out.println(object);
            }
        }
        System.out.println("\nIMPARES: ");
        for (int object : numbers) {
            if (object % 2 != 0 && object >= 0) 
            {
                System.out.println(object);
            }
        }
    }
}
