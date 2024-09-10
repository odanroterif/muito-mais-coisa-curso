package operations;

public class bank 
{
    int number_account;
    String person;
    double total;

    public bank() 
    {

    }

    public bank(int number_account, double total, String person)
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
