package move;



public class car extends vehicle
{
    private int door;    
    
    
    public car(String mark,String model,int door)
    {
         super(mark, model);
         this.door = door;
    }     
    
    public car(String mark,String model)
    {
         super(mark, model);         
    }
    
    public car(int door)
    {         
         this.door = door;
    }
    
    public car()
    {
        
    }
    
   @Override
   public void view_details()
   {
       System.out.println("marca: " + this.mark);       
       System.out.println("modelo: " + this.model);
       System.out.println("number of doors: " + this.door);
   }
   
   @Override
   public String driver()
   {
       return "este carro esta dirigindo";
   }
}