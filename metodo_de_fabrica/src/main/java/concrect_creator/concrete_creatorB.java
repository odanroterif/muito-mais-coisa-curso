package concrect_creator;


import concrete_produc.concrete_productB;
import creat.creator;
import produc.product;



public class concrete_creatorB extends creator 
{
    @Override
    public product factoryMethod() 
    {
        return new concrete_productB();
    }
}
