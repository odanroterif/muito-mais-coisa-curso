package emp;




public class outside_employer  extends employer
{
    double add;
    
    public  outside_employer(String name, int hour,float money_per_hour,double add)
    {
       this.name = name;
       this.hour = hour;
       
        if (this.money_per_hour == 0f) 
        {            
            this.money_per_hour = money_per_hour;
        }
        
        if (this.add == 0f) 
        {            
            this.add = money_per_hour;
        }
    }
    
    public  outside_employer(int hour,float money_per_hour,double  add)
    {      
       this.hour = hour;
       
        if (this.money_per_hour == 0f) 
        {            
            this.money_per_hour = money_per_hour;
        }
        
        if (this.add == 0f) 
        {            
            this.add = add;
        }
    }
    
    public  outside_employer(float money_per_hour,double add)
    {      
        if (this.money_per_hour == 0f) 
        {            
            this.money_per_hour = money_per_hour;
        }
        
        if (this.add == 0f) 
        {            
            this.add = add;
        }
    }    
    
    public  outside_employer(double add)
    {      
        if (this.add == 0f) 
        {            
            this.add = add;
        }
    } 
     
    public  outside_employer(float money_per_hour)
    {      
        if (this.money_per_hour == 0f) 
        {            
            this.money_per_hour = money_per_hour;
        }
    } 
    
    public  outside_employer()
    {
      
    }
    
    @Override
    public void SETname(String name)
    {
        this.name = name;
    }
   @Override
    public String GETname()
    {
        return this.name;
    }
    

    @Override
    public float payday()
    {
       return (float) (this.money_per_hour * this.hour + (add * 1.1f));
    }
}