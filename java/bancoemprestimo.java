package operations;

public class bank 
{
    int number_account;
    String person;
    double total;
    int[] limit = new int[2];  

    public bank() 
    {

    }

    public bank(int number_account, double total, String person)
    {
        this.person = person;
        this.number_account = number_account;
        this.total = total;
    }
    
    public bank(int number_account, double total, String person,double loan)
    {
        this.person = person;
        this.number_account = number_account;
        this.total = total;
    }

    public bank(int number_account, String person)
    {
        this.person = person;
        this.number_account = number_account;
    }
    
    public int account()
    {
        return number_account;
    }
    
    public String people()    
    {
        return person;
    }
    
    public void alter_people(String person)    
    {
        this.person = person;
    }
    
    public void sake(double money) 
    {
        this.total -= money;
    }

    public void deposit(double money) 
    {
        this.total += money + 5;
    }
    
    public int limit(double money) 
    {
        return this.limit[0]++;
    }
    
    public double loan_limit(double money) 
    {
        if (money > 1000) 
        {
            money = 1000;
        }
        return money - 10;
    }
      
    public double alter_total()
    {
        return total;
    }
    
    public  String tString()
    {
       return "Conta: " + number_account + " titular "+ person+ " saldo: R$"+ String.format("%.2f",total);
    }
}
//-------------------------------------------------------
package com.mycompany.banco;

import java.util.Scanner;
import cleanscreen.clean;
import java.awt.AWTException;
import java.io.IOException;
import operations.bank;

public class Banco {

    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        Scanner input = new Scanner(System.in);
        bank object = new bank();
        clean clear = new clean();
        double money;
        String name;
        int account;
        
        System.out.println("É conta empresarial?");
        String resward = input.next();

        if ("sim".equals(resward)) 
        {            
            System.out.print(" nome da empresa: ");
            name = input.nextLine();
            clear.clear();
            System.out.print("o numero da conta: ");
            account = input.nextInt();
            clear.clear();
            System.out.println("Deseja reailizar saque,deposito ou emprestimo?");
            resward = input.next();
            switch (resward) 
            {
                case "saque":
                    System.out.println("quanto?");
                    money = input.nextDouble();
                    object.sake(money);
                    break;
                case "deposito":
                    System.out.println("quanto?");
                    money = input.nextDouble();
                    object.deposit(money);
                    break;
                case "emprestimo":
                    System.out.println("quanto?");
                    money = input.nextDouble();
                    object.limit(money);
                    
                    break;
                default:
                    throw new AssertionError();
            }
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
        System.out.println(object.tString());
    }
}
//----------------------------------------------------
