package operations;

public class bank 
{
    protected int number_account;
    protected String person;
    protected double total;     

    public bank() 
    {

    }

    public bank(int number_account, double total, String person)
    {
        this.person = person;
        this.number_account = number_account;
        this.total = total;
    }
    
    public bank(int number_account, double total, String person,double loan)
    {
        this.person = person;
        this.number_account = number_account;
        this.total = total;
    }

    public bank(int number_account, String person)
    {
        this.person = person;
        this.number_account = number_account;
    }
    
    public int account()
    {
        return number_account;
    }
    
    public String people()    
    {
        return person;
    }
    
    public void alter_people(String person)    
    {
        this.person = person;
    }
    
    public void sake(double money) 
    {
        this.total -= money;
    }

    public void deposit(double money) 
    {
        this.total += money + 5;
    }   
      
    public double alter_total()
    {
        return total;
    }
    
    public  String tString()
    {
       return "Conta: " + number_account + " titular "+ person+ " saldo: R$"+ String.format("%.2f",total);
    }
}
//---------------------------------------------------------------------
package operations;


public class special_bank extends bank
{
    int limit = 0;  
    double loan;

    public special_bank() 
    {

    }

    public special_bank(int number_account, double total, String person)
    {
        this.person = person;
        this.number_account = number_account;
        this.total = total;
    }
    //esse construtor esta aqui por precaução
    public special_bank(int number_account, double total, String person,double loan)
    {
        this.person = person;
        this.number_account = number_account;
        this.total = total;
    }

    public special_bank(int number_account, String person)
    {
        this.person = person;
        this.number_account = number_account;
    }
    
    @Override
    public int account()
    {
        return number_account;
    }
    
    @Override
    public String people()    
    {
        return person;
    }
    
    @Override
    public void alter_people(String person)    
    {
        this.person = person;
    }
    
    @Override
    public void sake(double money) 
    {
        this.total -= money;
    }

    @Override
    public void deposit(double money) 
    {
        this.total += money + 5;
    }
    
    public void limit(double money) 
    {
        this.limit++;
    }
    
    public double loan_limit(double money) 
    {
        if (money > 2000) 
        {
            money = 2000;
        }
        if (total != 0) 
        {
            return 0;
        }
        else
        {
            loan = money - 10;
            return money - 10;
        }        
    }
      
    @Override
    public double alter_total()
    {
        return total;
    }
    
    @Override
    public  String tString()
    {
        if (this.limit != 0) 
        {
            return "Conta: " + number_account + " titular "+ person+ " saldo: R$"+ String.format("%.2f",total) +"\n\n\nvocê fez " + this.limit + " emprestimos e o emprestimo atual foi de " + loan;                               
        }
        else
        {
            return "Conta: " + number_account + " titular "+ person+ " saldo: R$"+ String.format("%.2f",total);    
        }   
    }
}
