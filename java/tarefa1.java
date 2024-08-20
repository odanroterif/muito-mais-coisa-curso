package com.mycompany.tarefa1;

import java.util.Scanner;

public class Tarefa1 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Diga um numero equivalente ao dia da semana: ");
        char week = input.next().charAt(0);

        switch (week) 
        {
            case '1':
                System.out.println("Domingo");
                break;
            case '2':
                System.out.println("Segunda");
                break;
            case '3':
                System.out.println("Terça");
                break;
            case '4':
                System.out.println("Quarta");
                break;
            case '5':
                System.out.println("Quinta");
                break;
            case '6':
                System.out.println("Sexta");
                break;
            case '7':
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Esse dia ainda não existe");
        }
    }
}
