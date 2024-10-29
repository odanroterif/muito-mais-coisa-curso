package zoo;

public class parrot extends  animal
{
    public parrot(String name)
    {

    }

    public parrot()
    {

    }

    @Override
    public String GETname()
    {
        return this.name;
    }

    @Override
    public String sound()
    {
        return "python é ruim";
    }
}
