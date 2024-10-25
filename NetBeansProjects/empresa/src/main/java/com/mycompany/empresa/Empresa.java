package com.mycompany.empresa;

import java.util.Scanner;
import emp.outside_employer;
import emp.primer_employer;
import emp.employer;
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
        //List<employer> j = new ArrayList<>();
        primer_employer emplor = new primer_employer(0);
        outside_employer employer = new outside_employer(0);
        
        
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
                emplor = new primer_employer(name,hour,money);
                //System.err.println(emplor.GETname() +",tu salario es de " + emplor.payday());
                break;
           case "afuera":
               //System.out.println("cuanto ganas de bonus?");
               float add = input.nextFloat();
               clear.clear();
               employer = new outside_employer(name,hour,money,add);
               //System.out.println(employer.GETname() + ",tu salario es de " + employer.payday());
               break;
            default:
                System.out.println("esta opcion nin siquiera existe");
        }
        System.out.println("\n\n\nnecesitas hacer alguna alteracion?");
        resward = input.next().toLowerCase();
        
        while ("sim".equals(resward) && !"não".equals(resward)) 
        {
                        
        }
        input.close();
    }
}