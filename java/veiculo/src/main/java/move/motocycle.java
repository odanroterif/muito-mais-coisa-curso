package move;


public class motocycle extends vehicle
{
     float displacament;    
     
    public motocycle(String mark,String model,float displacament)
    {
         super(mark, model);
         this.displacament = displacament;
    }     
    
    public motocycle(String mark,String model)
    {
         super(mark, model);         
    }
    
    public motocycle(float displacament)
    {         
         this.displacament = displacament;
    }
    
    public motocycle()
    {
        
    }
    
   @Override
   public void view_details()
   {
       System.out.println("marca: " + this.mark);       
       System.out.println("modelo: " + this.model);
       System.out.println("number of displacament: " + this.displacament);
   }
   
   @Override
   public String driver()
   {
       return "esta moto esta dirigindo";
   }
}
