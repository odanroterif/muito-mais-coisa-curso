
package com.mycompany.aula8;

import java.util.Scanner;
import  cleanscreen.clean;
import entity.normal;
import entity.import_;       
import entity.used;
import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;


public class Aula8 
{

    public static void main(String[] args) throws IOException, InterruptedException, AWTException 
    {
        Scanner input = new Scanner(System.in);
        clean clear = new clean();
        normal f = new normal();
        import_  ali = new import_();
        used  olx = new used();   
        ArrayList<String> type = new ArrayList<>();   
        
        System.out.println("quantos produtos? ");
        int products = input.nextInt();
        clear.clear();
        for (int i = 0; i < products; i++) 
        {
            System.out.println("nome: ");
            String name = input.next();
            System.out.print("\ntipo(importado, usado,normal): ");
            String tipe = input.next();
            type.add(tipe);
            System.out.print("preço: ");
            float price = input.nextFloat();
            switch (tipe) 
            {
                case "importado":
                     ali = new import_(name,price);
                    break;
                case "usado":
                     ali = new import_(name,price);
                    break;
                case "normal":
                     ali = new import_(name,price);
                    break;
                default:
                    throw new AssertionError();
            }
            clear.clear();      
        }
        for (String item : type) 
        {
            if ("importado".equals(type)) 
            {
                ali.ticket();
            }
            else if ("usado".equals(type))
            {
                olx.ticket();
            }
            else
            {
                f.ticket();
            }
        }           
    }
}
//-------------------------------------------------------------------------------

package entity;

import java.util.ArrayList;




public abstract class product 
{
    ArrayList<String> name =new ArrayList<>();    
    ArrayList<Float> price =new ArrayList<>();
    
    public  product()
    {
    }
    public  product(String name, float price)
    {
        this.name.add(name);
        this.price.add(price);
    }
    
    public abstract String ticket();
}
//------------------------------------------------------------------

package entity;


public class normal extends product
{
    public normal()
    {       
    }
    public normal(String name, float price)
    {
        super(name,price);
    }
    
    @Override
    public String ticket()
    {
        return "produto: " + name + "\npreço:  R$" + String.format("%.2f",price);        
    }
}
//-------------------------------------------------------------------
package entity;


public class import_  extends product
{
    float tax;
    
    public import_()
    {       
    }
     public import_(String name, float price)
    {
        super(name,price);
        
        if (price > 50) 
        {
            tax = price * 0.92f;
        }
        else
        {
            tax = price * 0.45f;
        }
    }
    
    @Override
    public String ticket()
    {
        return "produto: " + name + "\npreço:  R$" + String.format("%.2f",price);
    }    
}
//-----------------------------------------------------------------

package entity;


public class  used extends product
{
    public  used()
    {
        
    }
    public used(String name, float price)
    {
        super(name,price);
    }
    
    @Override
    public String ticket()
    {
        return "produto: " + name + "\npreço:  R$" + String.format("%.2f",price);
    }
}
