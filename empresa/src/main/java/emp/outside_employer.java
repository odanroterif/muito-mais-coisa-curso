package emp;

import java.util.ArrayList;
import java.util.List;




public class outside_employer  extends employer
{
    List<Double> add = new ArrayList<>();
    
    public  outside_employer(String name, int hour,float money_per_hour,double add)
    {      
      super(name,hour,money_per_hour);
      this.add.add(add * 1.1);
    }
    
    public  outside_employer(int hour,float money_per_hour,double  add)
    {        
       super(hour,money_per_hour);
       this.add.add(add * 1.1);
    }
    
    public  outside_employer(float money_per_hour,double add)
    {              
       super(money_per_hour);
       this.add.add(add * 1.1);
    }    
    
    public  outside_employer(double add)
    {      
        this.add.add(add * 1.1);
    } 
     
    public  outside_employer(float money_per_hour)
    {      
      super(money_per_hour);
    } 
    
    public  outside_employer(String name, int hour)
    {
      super(name,hour);
    }
    
    public  outside_employer(String name, float money_per_hour)
    {
      super(name,money_per_hour);
    }
    
    public  outside_employer()
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
            double conversion = add.get(i);
            
            solution.add((this.money_per_hour.get(i) * this.hour.get(i)) + (float)conversion);            
        }
        return  solution;
    }
}