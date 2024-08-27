package xadrez;


public abstract class piece 
{
   public  abstract void move();
}
//--------------------------------------------------------------
package xadrez;


public class pawn extends piece
{
      @Override 
           public   void move() 
    {
        System.out.println("moveu-se em frente");
    }
}
//---------------------------------------------------------------
package xadrez;


public class horse extends piece
{
     @Override 
        public void move() 
    {
        System.out.println("moveu-se em L");
    }
}
//---------------------------------------------------------------
package xadrez;


public class bishop extends piece
{
     @Override
         public void move() 
    {
        System.out.println("moveu-se em diagonal");
    }
}
//------------------------------------------------------------------
package teste;


import java.util.Scanner;
import xadrez.bishop;
import xadrez.horse;
import xadrez.pawn;

public class Aula4 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        pawn peao = new pawn();
        horse cavalo = new horse();
        bishop bispo = new bishop();
             

       System.out.println("cual pieza moveras?\n");
       String select = input.next();
        System.out.println("\n\n\n\n");

        switch (select) 
        {
            case "cavalo":
                cavalo.move();
                break;
            case "peao":
               peao.move();
                break;
            case "bispo":
               bispo.move();
                break;
            default:
               System.out.println("essa peça existe? tente mover outra");                
       }
    }
}
