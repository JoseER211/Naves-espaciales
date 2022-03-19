package Java;

public class SpaceShuttle extends Spacecraft {

    @Override
    public void startUp() {
        this.type = "vehículo lanzadera";
        this.power = 366;
        this.speed = 183;
        System.out.println("La nave " + type + " arrancó" + "\n" + "power: " + power + "\n" + "speed: " + speed + "\n");
    }

    @Override
    public void endUp() {
        this.type = "vehículo lanzadera";
        this.power = 0;
        this.speed = 0;
        System.out.println("La nave " + type + " frenó" + "\n" + "power: " + power + "\n" + "speed: " + speed + "\n");
    }
}
