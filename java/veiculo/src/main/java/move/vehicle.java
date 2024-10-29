
package move;


public abstract class vehicle 
{
    protected String mark;
    protected String model;
    
    public abstract String driver();
    public abstract void view_details();
    
    public vehicle(String mark, String model)
    {
         this.mark = mark;
         this.model = model;
    }
    
    public vehicle()
    {
        
    }
}
