package Java;

public class CrewedSpacecraft extends Spacecraft {

    @Override
    public void startUp() {
        this.type = "Tripulada";
        this.power = 1330;
        this.speed = 665;
        System.out.println("La nave " + type + " arrancó" + "\n" + "power: " + power + "\n" + "speed: " + speed + "\n");
    }

    @Override
    public void endUp() {
        this.type = "Tripulada";
        this.power = 0;
        this.speed = 0;
        System.out.println("La nave " + type + " frenó" + "\n" + "power: " + power + "\n" + "speed: " + speed + "\n");
    }
}
