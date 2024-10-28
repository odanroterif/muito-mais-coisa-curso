package emp;

import java.util.List;


public class primer_employer extends employer
{
    public  primer_employer(String name, int hour,float money_per_hour)
    {
      super(name,hour,money_per_hour);
    }
    
    public  primer_employer(int hour,float money_per_hour)
    {      
      super(hour,money_per_hour);
    }
    
    public  primer_employer(float money_per_hour)
    {      
      super(money_per_hour);
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
    public List<String> GETname()
    {
        return this.name;
    }
    
    
    @Override
    public List<Float> payday()
    {
        for (int i = 0; i < this.hour.size(); i++) 
        {            
            solution.add(this.money_per_hour.get(i) * this.hour.get(i));            
        }
        return  solution;
    }
}