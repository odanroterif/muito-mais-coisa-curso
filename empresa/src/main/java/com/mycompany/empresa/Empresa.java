package com.mycompany.empresa;

import java.util.Scanner;
import emp.outside_employer;
import emp.primer_employer;
import cleanscreen.clean;
import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Empresa 
{

    public static void main(String[] args) throws IOException, InterruptedException, AWTException 
    {
        Scanner input = new Scanner(System.in);
        clean clear = new clean();        
        List<primer_employer> emplor = new ArrayList<>();
        List<outside_employer> employer = new ArrayList<>();
        double add;
        
        
        System.out.println("eres empleado de esta empresa o de afuera?");
        String resward = input.next().toLowerCase();
        clear.clear();
        System.out.println("cuantas horas trabajas?");
        int hour = input.nextInt();
        clear.clear();
        input.nextLine();
        System.out.println("cual es tu nombre?");
        String name = input.nextLine();
        clear.clear();
        System.out.println("cuanto ganas por hora?");
        float money = input.nextFloat();
        clear.clear();
        
        
        switch (resward)
        {
           case "esta":
               emplor.add(new primer_employer(name,hour,money));                
               break;
           case "afuera":
               System.out.println("cuanto ganas de bonus?");
               add = input.nextFloat();
               clear.clear();
               employer.add(new outside_employer(name,hour,money,add));            
               break;
            default:
                System.out.println("esta opcion nin siquiera existe");
        }
        System.out.println("\n\n\nnecesitas agregar alguien mas?");
        resward = input.next().toLowerCase();
        
        while ("si".equals(resward) && !"no".equals(resward)) 
        {
            System.out.println("eres empleado de esta empresa o de afuera?");
            resward = input.next().toLowerCase();
            clear.clear();
            System.out.println("cuantas horas trabajas?");
            hour = input.nextInt();
            clear.clear();
            input.nextLine();
            System.out.println("cual es tu nombre?");
            name = input.nextLine();
            clear.clear();
            System.out.println("cuanto ganas por hora?");
            money = input.nextFloat();
            clear.clear();
        
        
            switch (resward)
            {
                case "esta":
                    emplor.add(new primer_employer(name,hour,money));                
                    break;
                case "afuera":
                    System.out.println("cuanto ganas de bonus?");
                    add = input.nextFloat();
                    clear.clear();
                    employer.add(new outside_employer(name,hour,money,add));               
                    break;
                default:
                    System.out.println("esta opcion nin siquiera existe");
            }
            clear.clear();
            System.out.println("\n\n\nnecesitas agregar alguien mas?");
            resward = input.next().toLowerCase();
        }
        clear.clear();
        System.out.println("EMPLEADOS DE ESTA EMPRESA\n\n");
        for (primer_employer object : emplor)
        {
            System.out.println(object.GETname() + " esta recebendo R$" + object.payday() + "\n");
        }
        System.out.println("EMPLEADOS DE TERCEROS\n\n");
        for (outside_employer object : employer)
        {
            System.out.println(object.GETname() + " esta recebendo R$" + object.payday() + "\n");
        }
        input.close();
    }
}