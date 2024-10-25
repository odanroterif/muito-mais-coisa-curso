package emp;

import java.util.List;


public abstract class employer 
{
    protected List<String> name;
    protected List<Integer> hour;
    protected List<Float> money_per_hour;
    
    public abstract String GETname();
    public abstract void SETname(String name);
    
    public abstract float payday();
    
    public  employer(String name, int hour,float money_per_hour)
    {
        this.name.add(name);
        this.hour.add(hour);
        this.money_per_hour.add(money_per_hour);
    }
    
    public  employer(String name, int hour)
    {
        this.name.add(name);
        this.hour.add(hour);        
    }
    
    public  employer(String name, float money_per_hour)
    {
        this.name.add(name);        
        this.money_per_hour.add(money_per_hour);
    }
    
    public  employer(int hour,float money_per_hour)
    {        
        this.hour.add(hour);
        this.money_per_hour.add(money_per_hour);
    }
      
    public  employer(float money_per_hour)
    {        
        this.money_per_hour.add(money_per_hour);
    }
    
    public  employer(int hour)
    {        
        this.hour.add(hour);        
    }
}