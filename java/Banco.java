package com.mycompany.banco;

import java.util.Scanner;
import cleanscreen.clean;
import java.awt.AWTException;
import java.io.IOException;
import operations.bank;

public class Banco 
{

    public static void main(String[] args) throws IOException, InterruptedException, AWTException 
    {
        Scanner input = new Scanner(System.in);
        bank object = new bank();
        clean clear = new clean();
        double money;

        System.out.print("Diga seu nome: ");
        String name = input.nextLine();
        clear.clear();
        System.out.print("o numero da sua conta: ");
        int account = input.nextInt();
        clear.clear();
        System.out.println("quer realizar um deposito?");
        String resward = input.next();
        clear.clear();
        if ("sim".equals(resward)) 
        {
            System.out.println("quanto?");
            money = input.nextDouble();
            object = new bank(account, money, name);
        } 
        else 
        {
            object = new bank(account, name);
        }
        clear.clear();

        do 
        {
            System.out.println("Deseja reailizar saque ou deposito?");
            resward = input.next();
            if ("saque".equals(resward))
            {
                System.out.println("quanto?");
                money = input.nextDouble();
                object.sake(money);
            } 
            else if ("deposito".equals(resward))
            {
                System.out.println("quanto?");
                money = input.nextDouble();
                object.deposit(money);
            }            
            clear.clear();
            System.out.println("fazer outra operação?");
            resward = input.next();
        } while ("sim".equals(resward));
        clear.clear();
        System.out.println(object.tString());
    }
}