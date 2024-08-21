package com.mycompany.aula3_1;

import java.util.Scanner;

public class Aula3_1
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] gas = {0,0,0};

        System.out.print("Digite o codigo: ");
        char code = input.next().charAt(0);

        while (code != '4') 
        {
            if (code != '1' || code != '2' || code != '3')
            {                
                switch (code) 
                {
                    case '1':
                        gas[0]++;
                        break;
                    case '2':
                        gas[1]++;
                        break;
                    case '3':
                        gas[2]++;
                        break;                    
                }
            } 
            else
            {
                System.out.print("código invalido, digite outro: ");
                code = input.next().charAt(0);
            }
            System.out.println("\n\n\nDIGITE 4 PARA ENCERRAR\n\n\n");
            System.out.println("Digite mais um codigo: ");
            code = input.next().charAt(0);
        }
        System.out.println("\n\nalcool: " + gas[0]);
        System.out.println("gasolina: " + gas[1]);
        System.out.println("diesel: " + gas[2]);
    }
}
