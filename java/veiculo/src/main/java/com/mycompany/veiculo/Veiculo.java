package com.mycompany.veiculo;

import java.util.Scanner;
import cleanscreen.clean;
import java.awt.AWTException;
//import java.awt.List;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import move.vehicle;
import move.car;
import move.motocycle;


public class Veiculo
{

    public static void main(String[] args) throws IOException, InterruptedException, AWTException 
    {
        Scanner input = new Scanner(System.in);
        clean clear = new clean();
        List<vehicle> motorist = new ArrayList<>();   
        int door;
        float displacament;
        
        
        System.out.println("tienes moto o coche?");
        String resward = input.next().toLowerCase();
        clear.clear();
        System.out.print("marca de " + resward + ": ");
        String mark = input.nextLine();
        clear.clear();
        input.nextLine();
        System.out.print("modelo de " + resward + ": ");
        String model = input.nextLine();
        clear.clear();        
        
        
        switch (resward)
        {
           case "moto":
               System.out.println("cuantas cilindras?");
               displacament = input.nextFloat();
               motorist.add(new motocycle(mark,model,displacament));                
               break;
           case "coche":
               System.out.println("cuantas puertas?");
               door = input.nextInt();
               motorist.add(new car(mark,model,door));
               break;
            default:
                System.out.println("esta opcion nin siquiera existe");
        }
        System.out.println("\n\n\nnecesitas informar mas veiculos?");
        resward = input.next().toLowerCase();
        
        while ("si".equals(resward) && !"no".equals(resward)) 
        {
            System.out.println("tienes moto o coche?");
            resward = input.next().toLowerCase();
            clear.clear();
            System.out.print("marca de " + resward + ": ");
            mark = input.nextLine();
            clear.clear();
            input.nextLine();
            System.out.print("modelo de " + resward + ": ");
            model = input.nextLine();
            clear.clear();
        
        
          switch (resward)
            {
                case "moto":
                    System.out.println("cuantas cilindras?");
                    displacament = input.nextFloat();
                    motorist.add(new motocycle(mark,model,displacament));                
                    break;
                case "coche":
                    System.out.println("cuantas puertas?");
                    door = input.nextInt();
                    motorist.add(new car(mark,model,door));
                    break;
                default:
                    System.out.println("esta opcion nin siquiera existe");
            }
            System.out.println("\n\n\nnecesitas informar mas veiculos?");
            resward = input.next();
         }
        clear.clear();
        
        for (vehicle object : motorist)
        {
            System.out.println(object.driver()  +  "\n\n");
            System.out.println("DETALHES\n");
            object.view_details();
            System.out.println("\n#-------------------------------");            
        }
    }
}
