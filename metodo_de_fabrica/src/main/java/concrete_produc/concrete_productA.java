package concrete_produc;

import produc.product;

// Concrete Products
public class concrete_productA extends product 
{
    @Override
    public void display()
    {
	System.out.println("produto A fabricado.");
    }
}