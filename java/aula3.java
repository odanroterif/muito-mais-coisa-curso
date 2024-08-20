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
