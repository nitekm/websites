package websites;

public abstract class Website {

    protected Reporter reporter;
    protected String name;
    protected int points;

    public abstract void update();
    public abstract String getName();
    public abstract int getPoints();

}
