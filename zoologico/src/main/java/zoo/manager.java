package zoo;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cleanscreen.clean;

public class manager
{
    Scanner input = new Scanner(System.in);
    clean clear = new clean();

    public void list(List<animal> specimi)
    {
        for (animal object : specimi)
        {
            System.out.println("nome da criatura: " + object.GETname());
            System.out.println("som: " + object.sound());
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
                clear.clear();
                break;
            case 2:
                System.out.print("nome do elefante: ");
                name = input.next();
                input.nextLine();
                clear.clear();
                break;
            case 3:
                System.out.print("nome do papagaio: ");
                name = input.next();
                input.nextLine();
                clear.clear();
                break;
        }
        input.close();
    }
}
