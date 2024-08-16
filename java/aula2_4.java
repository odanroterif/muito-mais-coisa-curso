package com.mycompany.aula2;

import java.util.Scanner;

public class aula2_4 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        float price;

        System.out.print("Digite o codigo: ");
        int code = input.nextInt();
        System.out.print("\n\nDigite a quantidade: ");
        int size = input.nextInt();
        input.close();

        switch (code) 
        {
            case 1:
                price = 4f;
                System.out.printf("\n\n\n\nvalor a pagar: R$%.2f",price*size);
                break;
            case 2:    
                price = 4.50f;
                System.out.printf("\n\n\n\nvalor a pagar: R$%.2f",price*size);
                break;
            case 3:
                price = 5f;
                System.out.printf("\n\n\n\nvalor a pagar: R$%.2f",price*size);
                break;
            case 4:
                price = 2f;
                System.out.printf("\n\n\n\nvalor a pagar: R$%.2f",price*size);
                break;
            case 5:
                price = 1.50f;
                System.out.printf("\n\n\n\nvalor a pagar: R$%.2f",price*size);
                break;
            default:
                throw new AssertionError();
        }
    }
}
