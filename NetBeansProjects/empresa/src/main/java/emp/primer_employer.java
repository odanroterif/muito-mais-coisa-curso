package emp;


public class primer_employer extends employer
{
    public  primer_employer(String name, int hour,float money_per_hour)
    {
       super(name,hour,money_per_hour);
       this.name = name;
       this.hour = hour;
        if (this.money_per_hour == 0f) 
        {            
            this.money_per_hour = money_per_hour;
        }
    }
    
    public  primer_employer(int hour,float money_per_hour)
    {      
       this.hour = hour;
        if (this.money_per_hour == 0f) 
        {            
            this.money_per_hour = money_per_hour;
        }
    }
    
    public  primer_employer(float money_per_hour)
    {      
        if (this.money_per_hour == 0f) 
        {            
            this.money_per_hour = money_per_hour;
        }
    }    
    
    public  primer_employer()
    {
      
    }
    
    
    @Override
    public void SETname(String name)
    {
        this.name.add(name);
    }
   @Override
    public String GETname()
    {
        return this.name;
    }
    

    @Override
    public float payday()
    {
       return this.money_per_hour * this.hour;
    }
}