package zoo;

public class elephant extends  animal
{
    public elephant(String name)
    {
        super(name);
    }

    public elephant()
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
        return "elefante";
    }

    @Override
    public String sound()
    {
        return "bbrgrdb";
    }
}