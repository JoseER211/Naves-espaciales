package Java;

public class UncrewedSpacecraft extends Spacecraft {

    @Override
    public void startUp() {
        this.type = "No Tripulada";
        this.power = 8850;
        this.speed = 4425;
        System.out.println("La nave " + type + " arrancó" + "\n" + "power: " + power + "\n" + "speed: " + speed + "\n");
    }

    @Override
    public void endUp() {
        this.type = "No Tripulada";
        this.power = 0;
        this.speed = 0;
        System.out.println("La nave " + type + " frenó" + "\n" + "power: " + power + "\n" + "speed: " + speed + "\n");
    }
}
