package com.mycompany.metodo_de_fabrica;

import concrect_creator.concrete_creatorA;
import concrect_creator.concrete_creatorB;
import creat.creator;
import produc.product;




public class Metodo_de_fabrica 
{
    public static void main(String[] args) 
    {
        creator creatorA = new concrete_creatorA();
	product productA = creatorA.factoryMethod();
        
	productA.display();

	creator creatorB = new concrete_creatorB();
	product productB = creatorB.factoryMethod();
        
	productB.display();        
    }        		
}
