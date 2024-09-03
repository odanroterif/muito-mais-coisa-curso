#----------------------------------------------------
  package pagamento;

 import java.util.Scanner;
 import calculos.employer;
 import java.util.Locale;

public class Aula5 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        employer emp = new employer();
     
        
        System.out.print("Digite seu nome: ");
         emp.name = input.nextLine();
        System.out.print("\n\n\n\nDigite seu salário: ");
        emp.brute_wage = input.nextDouble();
        System.out.print("\n\n\n\nDigite o imposto a pagar: ");
        emp.tax = input.nextDouble();
       
                    
        System.out.println("\n\n\n\nquantas porcentos gostaria de ganhar a mais referente ao salário liquido?");
        double percent = input.nextDouble();
        input.close();
        emp.increased(percent);
    }
}
//---------------------------------------------------------------------
package calculos;

//import java.util.Scanner;

public class employer 
{
    public  String name;
    public  double brute_wage;
    public  double tax;
   

    public double liquid_calculate() 
    {
        return brute_wage - tax;
    }

    public void increased(double W) 
    {
        brute_wage += brute_wage * W / 100;

        System.out.println("seu salario final é " + brute_wage);

    }
}
#----------------------------------------------------------------------------------
