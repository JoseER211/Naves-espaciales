package Java.Naves;

import Java.Spacecraft;

import static Java.Main.Scan;
import static Java.Main.incorrectOption;

public class UncrewedSpacecraft extends Spacecraft {

    @Override
    public void startUp() {
        this.type = "no Tripulada";
        this.power = 8850;
        this.speed = 4425;
        System.out.println("La nave " + type + " arrancó" + "\n" + "power: " + power + "\n" + "speed: " + speed + "\n");
    }

    @Override
    public void endUp() {
        this.type = "no Tripulada";
        this.power = 0;
        this.speed = 0;
        System.out.println("La nave " + type + " frenó" + "\n" + "power: " + power + "\n" + "speed: " + speed + "\n");
    }

    @Override
    public void rotateSpaceCraft() {
        Integer direction;
        do {

            System.out.println("¿En qué dirección girará la nave?");
            System.out.println("1. Arriba" + "\n" + "2. Abajo" + "\n" + "3. Izquierda" + "\n" +
                    "4. Derecha" + "\n" + "5. Aterrizar nave");
            direction = Scan();
            switch (direction) {
                case 1:
                    System.out.println("La nave ha girado hacia arriba" + "\n");
                    break;
                case 2:
                    System.out.println("La nave ha girado hacia abajo" + "\n");
                    break;
                case 3:
                    System.out.println("La nave ha girado hacia la izquierda" + "\n");
                    break;
                case 4:
                    System.out.println("La nave ha girado hacia la derecha" + "\n");
                    break;

                case 5:
                    System.out.println("Orbitando el planeta Venus");
                    break;
                default:
                    incorrectOption();
                    System.out.println("Aterrizando en un planeta extraño...");
                    break;
            }
        } while (direction < 5);
    }
}