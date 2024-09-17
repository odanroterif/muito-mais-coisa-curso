package com.mycompany.aula7;

import  cleanscreen.clean;
import Store.Storage;
import java.awt.AWTException;
import java.io.IOException;
import java.util.Scanner;

public class Aula7
{

    public static void main(String[] args) throws IOException, InterruptedException, AWTException 
    {
        clean clear = new clean();
        Scanner input = new Scanner(System.in);
        Storage Storage = new Storage();
        String name;
        float price;
        int amount;
         
        System.out.println("Adicionar produto ao estoque?");
        String resward = input.next().toLowerCase();
        clear.clear();
        
        if ("sim".equals(resward)) 
        {
            System.out.print("nome do produto: ");
            name = input.nextLine();
            clear.clear();
            System.out.print("preço do produto: ");
            price = input.nextFloat();
            clear.clear();
            System.out.print("quantidade do produto: ");
            amount = input.nextInt();
            clear.clear();
            if (amount == 0) 
            {
                Storage = new Storage(name, price);
            }
            else
            {
                Storage = new Storage(name, price, amount);
            }
            System.out.println("colocar mais coisas?");
            resward = input.next().toLowerCase();
            while ("sim".equals(resward)) 
            {                
                 System.out.print("nome do produto: ");
                 name = input.nextLine();
                 clear.clear();
                 System.out.print("preço do produto: ");
                 price = input.nextFloat();
                 clear.clear();
                 System.out.print("quantidade do produto: ");
                amount = input.nextInt();
                clear.clear();
                if (amount == 0) 
                {
                   Storage = new Storage(name, price);
                }
                else
                {
                   Storage = new Storage(name, price, amount);
                }
                System.out.println("colocar mais coisas?");
                resward = input.next().toLowerCase();
            }
        }
        else 
        {            
            System.out.println("esse estoque não tem nada");
        }
        clear.clear();
        Storage.toString();
    }
}
//-----------------------------------------------------------------------------------
package Store;


public class Storage 
{
    String name;
    float price;
    int amount;
    int total_Storage = 0;
    
    public Storage()
    {
        
    }
    public Storage(String name,float price)
    {
        this.name = name;
        this.price = price;
    }
    public Storage(String name,float price,int amount)
    {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

   public float total_Storage()
   {      
      return total_Storage += price;
   }
    
   public  void add_product(int amount)
   {
       this.amount += amount;
   }
   
   public  void remove_product(int amount)
   {
       this.amount -= amount;
   }
   
   public String toString()
   {
       return "neste estoque existem " + amount + " produtos e o valor total deste estoque é de " + String.format("%.2f",total_Storage);
   }
}
