package com.mycompany.aula2;

import java.util.Scanner;

public class aula2_5 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        float money;
        
        System.out.println("Declare sua renda: ");
        float econome = input.nextFloat();
        input.close();
        
        if(econome >= 0f && econome <=2000f)
        {
            System.out.println("\n\n\n\n nao pagaras imposto");
        }
        else if (econome >= 2000.01f && econome <=3000f) 
        {
            money = (econome - 2000) * 0.08f;
            System.out.printf("faz o L e paga: %.2f",money);
        }
        else if (econome >= 3000.01f && econome <=4500f) 
        {
            money = (econome - 3000) * 0.18f;
            System.out.printf("faz o L e paga: %.2f",money);
        }
        else if (econome > 4500f) 
        {
            money = (econome - 4500) * 0.28f;
            System.out.printf("faz o L e paga: %.2f",money);
        }
    }   
}
