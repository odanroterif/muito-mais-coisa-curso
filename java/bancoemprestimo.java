package com.mycompany.banco;

import java.util.Scanner;
import cleanscreen.clean;
import java.awt.AWTException;
import java.io.IOException;
import operations.bank;
import operations.special_bank;

public class Banco 
{

    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        Scanner input = new Scanner(System.in);
        bank object = new bank();
        clean clear = new clean();
        special_bank special_object = new special_bank();
        double money = 0;
        String name;
        int account;
        
        System.out.println("É conta empresarial?");
        String resward = input.nextLine();
        clear.clear();

        if ("sim".equals(resward)) 
        {            
            System.out.print(" nome da empresa: ");
            name = input.nextLine();
            clear.clear();
            System.out.print("o numero da conta: ");
            account = input.nextInt();
            clear.clear();
            System.out.println("quer realizar um deposito inicial?");
            resward = input.next();
            clear.clear();
            if ("sim".equals(resward))
            {
                System.out.println("quanto?");
                money = input.nextDouble();
                special_object = new special_bank(account, money, name);
            } 
            else 
            {
                special_object = new special_bank(account, name);
            }
            clear.clear();
            do 
            {                
               System.out.println("Deseja reailizar saque,deposito ou emprestimo?");
               resward = input.next();
               clear.clear();
               switch (resward) 
               {
                 case "saque":
                    System.out.println("quanto?");
                    money = input.nextDouble();
                    special_object.sake(money);
                    break;
                 case "deposito":
                    System.out.println("quanto?");
                    money = input.nextDouble();
                    special_object.deposit(money);
                    break;
                 case "emprestimo":
                    System.out.println("quanto?");
                    money = input.nextDouble();
                    special_object.limit(money);                    
                    break;
                 default:
                    System.out.println("não fazemos esta operação");
               } 
                System.out.println("continuar operações?");
                resward = input.next();
            } while ("sim".equals(resward));
                  
        }
        else
        {
            System.out.print("Diga seu nome: ");
            name = input.nextLine();
            clear.clear();
            System.out.print("o numero da sua conta: ");
            account = input.nextInt();
            clear.clear();
            System.out.println("quer realizar um deposito?");
            resward = input.next();
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
        }
        clear.clear();
        System.out.println("consultar conta de pessoa fisica ou empresa?");
        resward = input.next();    
        if ("pessoa".equals(resward)) 
        {
            System.out.println(object.tString());
        }
        else if("empresa".equals(resward))
        {
            System.out.println(special_object.tString());
        }
        else
        {
            System.out.println("essa conta o lula levou");
        }
    }
}
