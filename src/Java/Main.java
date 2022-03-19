package Java;

public class Main {
    public static void main(String[] args) {

        SpaceShuttle nave1 = new SpaceShuttle();
        nave1.startUp();
        nave1.endUp();

        CrewedSpacecraft nave2 = new CrewedSpacecraft();
        nave2.startUp();
        nave2.endUp();

        UncrewedSpacecraft nave3 = new  UncrewedSpacecraft();
        nave3.startUp();
        nave3.endUp();

    }
}
