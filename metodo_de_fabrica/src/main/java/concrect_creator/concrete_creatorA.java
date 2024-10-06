package concrect_creator;

import concrete_produc.concrete_productA;
import creat.creator;
import produc.product;





public class concrete_creatorA extends creator 
{
    @Override
    public product factoryMethod() 
    {
        return new concrete_productA();
    }
}
