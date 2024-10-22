package emp;


public abstract class employer 
{
    String name;
    int hour;
    float money_per_hour;
    
    public abstract String GETname();
    public abstract void SETname(String name);
    public abstract int GEThour();
    public abstract void SEThour(int hour);
    public abstract float GETmoney_per_hour();
    
    public abstract float payday();
}
//-------------------------------------------------------------------------
package emp;


public class primer_employer extends employer
{
    @Override
    public void SETname(String name)
    {
        this.name = name;
    }
   @Override
    public String GETname()
    {
        return this.name;
    }
    
    
    @Override
    public void SEThour(int hour)
    {
        this.hour = hour;
    }
   @Override
    public int GEThour()
    {
        return this.hour;
    }
    
    @Override
    public float GETmoney_per_hour()
    {
        return this.money_per_hour;
    }
    
    public float payday()
    {
       return this.money_per_hour * this.hour;
    }
}
//-----------------------------------------------------------
package emp;




public class outside_employer  extends employer
{
    float add;
    
    @Override
    public void SETname(String name)
    {
        this.name = name;
    }
   @Override
    public String GETname()
    {
        return this.name;
    }
    
    
    @Override
    public void SEThour(int hour)
    {
        this.hour = hour;
    }
   @Override
    public int GEThour()
    {
        return this.hour;
    }
    
    @Override
    public float GETmoney_per_hour()
    {
        return this.money_per_hour;
    }
    
    public float payday()
    {
       return this.money_per_hour * this.hour + (add * 1.1f);
    }
}
//--------------------------------------------------------------------
package com.mycompany.empresa;

import java.util.Scanner;
import emp.outside_employer;
import emp.primer_employer;
import cleanscreen.clean;
import java.awt.AWTException;
import java.io.IOException;

public class Empresa 
{

    public static void main(String[] args) throws IOException, InterruptedException, AWTException 
    {
        Scanner input = new Scanner(System.in);
        clean clear = new clean();
        primer_employer emplor = new primer_employer();
        outside_employer employer = new outside_employer();
        
        
        System.out.println("eres empleado de esta empresa o de afuera?");
        String resward = input.next().toLowerCase();
        clear.clear();
        System.out.println("cuantas horas trabajas?");
        int hour = input.nextInt();
        clear.clear();
        System.out.println("cual es tu nombre?");
        String name = input.nextLine();
        clear.clear();
        System.out.println("cuanto ganas por hora?");
        float money = input.nextFloat();
        clear.clear();
        
        
        switch (resward)
        {
            case "esta":
                emplor.SETname(name);
                emplor.SEThour(hour);
                System.err.println("tu salario es de" + emplor.payday());
                break;
           case "afuera":
               System.out.println("cuanto ganas de bonus?");
               float add = input.nextFloat();
                clear.clear();
                employer.SETname(name);
                employer.SEThour(hour);
                System.err.println("tu salario es de" + employer.payday());
               break;
            default:
                System.out.println("esta opcion nin siquiera existe");
        }
    }
}
