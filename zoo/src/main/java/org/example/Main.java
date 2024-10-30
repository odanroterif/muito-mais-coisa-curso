package org.example;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;
import cleanscreen.clean;
import zoo.manager;



public class Main
{
    public static void main(String[] args) throws IOException, InterruptedException, AWTException
    {
        Scanner input = new Scanner(System.in);
        clean clear = new clean();
        manager employ = new manager();
        int resward;


        do
        {
            System.out.print("1- adicionar criatura \n2- som das criaturas \n3- listar criaturas \n4- sair\n\nSELECT: ");
            resward = input.nextInt();
            clear.clear();


            switch (resward)
            {
                case 1:
                    employ.add();
                    break;
                case 2:
                    employ.all_sounds();
                    break;
                case 3:
                    employ.list();
                    break;
                default:
                    if (resward != 4)
                    {
                        System.out.println("esta criatura não esta aqui");
                    }
            }
        }while (resward != 4);
        clear.clear();
        System.out.println("volte sempre");
        input.close();
    }
}