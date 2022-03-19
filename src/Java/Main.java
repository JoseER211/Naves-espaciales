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
                    launchSpacecrafts();
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

    public static void launchSpacecrafts() {
        Integer menuLaunch;

        do {
            System.out.println( "\n" + "¿Cuál nave desea lanzar?");
            System.out.println("1. Vehículo lanzadera" + "\n" + "2. Nave no tripulada" + "\n" +
                                "3. Nave tripulada" + "\n" + "4. Terminar programa");

            menuLaunch = Scan();
            switch (menuLaunch) {
                case 1:
                    SpaceShuttle spaceCraft1 = new SpaceShuttle();
                    spaceCraft1.startUp();
                    launchedSpacecraft1();
                    break;

                case 2:
                    UncrewedSpacecraft spaceCraft2 = new UncrewedSpacecraft();
                    spaceCraft2.startUp();
                    launchedSpacecraft2();
                    break;

                case 3:
                    CrewedSpacecraft spaceCraft3 = new CrewedSpacecraft();
                    spaceCraft3.startUp();
                    launchedSpacecraft3();
                    break;

                case 4:
                    programOff();
                    break;

                default:
                    incorrectOption();
                    break;
            }
        } while (menuLaunch > 4);

    }

    public static void launchedSpacecraft1(){
        System.out.println("¿Qué hará la nave?");

        System.out.println("1. Girar" + "\n" + "2. Frenar");
        Integer menuLaunchShip;
        menuLaunchShip = Scan();
        switch (menuLaunchShip){
            case 1:
                SpaceShuttle rotateSpaceCraft = new SpaceShuttle();
                rotateSpaceCraft.turnSpaceCraft();

            case 2:
                SpaceShuttle stopSpaceCraft = new SpaceShuttle();
                stopSpaceCraft.endUp();
                break;

        }
    }

    public static void launchedSpacecraft2(){
        System.out.println("¿Qué hará la nave?");
        Integer menuLaunchShip;
        menuLaunchShip = Scan();
        switch (menuLaunchShip){
            case 1:
                UncrewedSpacecraft nave = new UncrewedSpacecraft();
                nave.endUp();
                break;

            case 2:


        }
    }
    public static void launchedSpacecraft3(){
        System.out.println("¿Qué hará la nave?");
        Integer menuLaunchShip;
        menuLaunchShip = Scan();
        switch (menuLaunchShip){
            case 1:
                CrewedSpacecraft nave = new CrewedSpacecraft();
                nave.endUp();
                break;

            case 2:


        }
    }
}
