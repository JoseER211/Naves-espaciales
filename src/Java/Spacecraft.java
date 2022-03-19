package Java;

public abstract class Spacecraft {
    protected String type;
    protected Integer power;
    protected Integer speed;

    public Spacecraft() {
        this.type = null;
        this.power = 0;
        this.speed = 0;
    }

    public abstract void startUp();

    public abstract void endUp();


}
