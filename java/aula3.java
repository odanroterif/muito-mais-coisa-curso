package com.mycompany.aula3;

import java.util.Scanner;
public class Aula3 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String password = "batatamina";
                
        System.out.print("Digite a senha: ");
        password = input.next();
        
        while (password != "batatamina") 
        {
            System.out.println("Senha invalida");
            System.out.print("\n\n\n\nDigite novamente: ");
            password = input.next();
        }
        System.out.println("Acesso permitido");
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------package com.mycompany.aula3;

import java.util.Scanner;

public class aula3_1
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] gas = new int[3];

        System.out.print("Digite a senha: ");
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
                    default:
                        System.out.print("indisponivel, digite outro: ");
                         code = input.next().charAt(0);
                }
            } 
            else 
            {
                System.out.print("código invalido, digite outro: ");
            }
        }
        System.out.println("alcool: " + gas[0]);
        System.out.println("gasolina: " + gas[1]);
        System.out.println("diesel: " + gas[2]);
    }
}
------------------------------------------------------------------------------------------------------------------------
package com.mycompany.aula3;

import java.util.Scanner;

public class aula3_3 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number;

        do 
        {
            System.out.print("Digite um numero: ");
            number = input.nextInt();

        } while (number > 1 && number < 5);
