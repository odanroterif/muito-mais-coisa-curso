package zoo;

public abstract class animal
{
    protected String name;

    public abstract String sound();
    public abstract String GETname();

    public animal(String name)
    {
        this.name = name;
    }
    public animal()
    {

    }
}
