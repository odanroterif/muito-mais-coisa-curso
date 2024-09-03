package com.mycompany.aula5_1;

import java.util.Scanner;
import java.util.Locale;
import aluno.Students;

public class Aula5_1 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Students student = new Students();
        
        
        System.out.print("Digite seu nome: ");
        student.name = input.nextLine();   
        
        for (int c = 0; c < 3; c++) 
        {
          System.out.print("\n\n\nDigite sua nota: ");
          student.note = input.nextFloat();   
        }
        if (student.note >= 70.00) 
        {
            System.out.println("\n\n\n\n\n\n\n\n\nPASS");
        }
        else
        {
            System.out.println("\n\n\n\n\n\n\n\n\nFAILED, faltam " + student.for_pass() + " para passar." );   
        }
    }
}
//------------------------------------
package aluno;


public class Students 
{
    public String name;
    public float note;
    
    public float result()
    {
        if (note < 0) 
        {
            note = 0;
        }
        else if(note == 0 && note > 30)
        {
            note = 30;
        }
        else if(note >35) 
        {
            note = 35;            
        }
        note += note;
        return note;
    }
    public float for_pass()
    {
        return 60 - note;
    }
}
