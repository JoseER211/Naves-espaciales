package Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        principalMenu();

    }

    public static Integer Scan() {
        Scanner data = new Scanner(System.in);
        Integer option = data.nextInt();
        return option;
    }

    public static void programOff() {
        System.out.println("Se terminó el programa");
    }

    public static void incorrectOption() {
        System.out.println("Opción incorrecta");
    }

    public static void principalMenu() {
        System.out.println("Bienvenido a la estación de naves espaciales." );
        Integer menuOption;

        do {
            System.out.println( "\n" + "¿qué desea hacer hoy?");
            System.out.println("1. Lanzar naves" + "\n" + "2. Terminar programa");

            menuOption = Scan();
            switch (menuOption) {
                case 1:
                    launchShips();
                    break;
                case 2:
                    programOff();
                    break;

                default:
                    incorrectOption();
                    break;
            }

        } while (menuOption > 2);

    }
    
    public static void launchShips() {
        Integer menuLaunch;

        do {
            System.out.println( "\n" + "¿Cuál nave desea lanzar?");
            System.out.println("1. Vehículo lanzadera" + "\n" + "2. Nave no tripulada" + "\n" +
                                "3. Nave tripulada" + "\n" + "4. Terminar programa");

            menuLaunch = Scan();
            switch (menuLaunch) {
                case 1:
                    SpaceShuttle nave1 = new SpaceShuttle();
                    nave1.startUp();
                    break;
                case 2:
                    UncrewedSpacecraft nave2 = new UncrewedSpacecraft();
                    nave2.startUp();
                    break;

                case 3:
                    CrewedSpacecraft nave3 = new CrewedSpacecraft();
                    nave3.startUp();
                    break;

                case 4:
                    programOff();
                    break;

                case 5:
                    incorrectOption();
                    break;
            }
        } while (menuLaunch > 4);

    }
}
