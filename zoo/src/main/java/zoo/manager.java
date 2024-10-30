package zoo;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cleanscreen.clean;


public class manager
{
    List<animal> specimi = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    clean clear = new clean();

    public void list()
    {
        for (animal object : specimi)
        {
            System.out.println("nome da criatura: " + object.GETname());
            System.out.println("tipo: " + object.GEType());
            System.out.println("#----------------------------#");
        }
    }

    public void add() throws IOException, InterruptedException, AWTException
    {
        System.out.print("1- leao \n 2- elefante \n 3- papagaio \n select: ");
        byte resward = input.nextByte();
        input.nextLine();
        clear.clear();


        switch (resward)
        {
            case 1:
                System.out.print("nome do leão: ");
                String name = input.next();
                input.nextLine();
                specimi.add(new lion(name));
                break;
            case 2:
                System.out.print("nome do elefante: ");
                name = input.next();
                input.nextLine();
                specimi.add(new elephant(name));
                break;
            case 3:
                System.out.print("nome do papagaio: ");
                name = input.next();
                input.nextLine();
                specimi.add(new parrot(name));
                break;
            default:
                System.out.println("esta criatura não esta aqui");
        }
    }

    public void all_sounds()
    {
        for (animal object : specimi)
        {
            System.out.println("nome da criatura: " + object.GETname());
            System.out.println("som: " + object.sound());
            System.out.println("#----------------------------#");
        }
    }
}