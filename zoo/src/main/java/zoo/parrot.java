package zoo;

public class parrot extends  animal
{
    public parrot(String name)
    {
        super(name);
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
    public String GEType()
    {
        return "papagaio";
    }

    @Override
    public String sound()
    {
        return "python é ruim";
    }
}