package Java;

import java.util.ArrayList;

public abstract class Spacecraft implements Rotate {
    protected String type;
    protected Integer power;
    protected Integer speed;
    protected ArrayList<String> planetas = new ArrayList<String>();

    public Spacecraft() {
        this.type = null;
        this.power = 0;
        this.speed = 0;

        planetas.add("Mercurio");
        planetas.add("Venus");
        planetas.add("Marte");
        planetas.add("Júpiter");
        planetas.add("Saturno");
        planetas.add("Urano");
        planetas.add("Neptuno");
        planetas.add("Plutón");

    }

    public abstract void startUp();

    public abstract void endUp();

    public abstract String random();
}
