package com.mycompany.aula3_6;

import java.util.Scanner;

public class Aula3_6
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[][] note = new int[3][2];
        float[] result = new float[3];
                
                
        for (int c = 0; c < 3; c++) 
        {
            System.out.println("notas do aluno " + (c+1)+": "); 
            for (int i = 0; i < 2; i++) 
            {                
                note[c][i] = input.nextInt();
                result[c] = (note[c][i]+note[c][i])/2;
            }                          
        }      
        for (int i = 0; i < 3; i++) 
        {
            String situation;
            if (result[i] < 6) 
            {
              situation = "reprovado";
            }
            else
            {
              situation = "aprovado"  ;
            }
            System.out.println(result[i] + "," + situation);   
        }
    }
}
