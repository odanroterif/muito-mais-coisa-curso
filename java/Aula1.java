
package com.mycompany.aula1;


public class Aula1 
{

    public static void main(String[] args) 
    {
        float product_one = 2100f;
        float product_two = 650f;
        short age = 30;
        int code = 5290;
        char gender = 'F';
        
        System.out.println("----PRODUTOS----\n\n");
        System.out.printf("computador: %.3f",product_one);
        System.out.printf("\nmesa de escritorio: %.3f",product_two);
        System.out.println("\n" + age + " anos de idade, codigo " + code + " sexo " + gender);      
    }
}
