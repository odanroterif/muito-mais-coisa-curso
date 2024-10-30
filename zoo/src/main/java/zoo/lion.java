package zoo;

public class lion extends animal
{
    public lion(String name)
    {
        super(name);
    }

    public lion()
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
        return "leão";
    }

    @Override
    public String sound()
    {
        return "fowgdfbçuoibew";
    }
}