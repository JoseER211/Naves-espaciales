package Java;

import Java.Spacecrafts.CrewedSpacecraft;
import Java.Spacecrafts.SpaceShuttle;
import Java.Spacecrafts.UncrewedSpacecraft;
import Java.Spacecrafts.atvSpacecraft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        principalMenu();

    }

    /**
     * Escanea un dato por teclado
     * @return El dato escaneado
     */
    public static Integer Scan() {
        Scanner data = new Scanner(System.in);
        Integer option = data.nextInt();
        return option;
    }

    /**
     * Termina el programa
     */
    public static void programOff() {
        System.out.println("Se terminó el programa");
    }

    /**
     * Manda un mensaje de opción incorrecta
     */
    public static void incorrectOption() {
        System.out.println("Opción incorrecta");
    }

    /**
     * Hace que las naves aterricen por defecto en el planeta tierra
     */
    public static void landInEarth() {
        System.out.println("Aterrizando de nuevo en el planeta tierra");
    }

    /**
     * Menú principal para decidir lanzar las naves
     */
    public static void principalMenu() {
        System.out.println("Bienvenido a la estación de naves espaciales.");
        Integer menuOption;

        do {
            System.out.println("\n" + "¿qué desea hacer hoy?");
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

    /**
     * Menú para decidir que tipo de nave lanzar
     */
    public static void launchSpacecrafts() {
        Integer menuLaunch;

        do {
            System.out.println("\n" + "¿Cuál nave desea lanzar?");
            System.out.println("1. Vehículo lanzadera" + "\n" + "2. Nave no tripulada" + "\n" +
                    "3. Nave tripulada" + "\n" + "4. ATV" + "\n" + "5. Terminar programa");

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
                    atvSpacecraft spaceCraft4 = new atvSpacecraft();
                    spaceCraft4.startUp();
                    launchedSpacecraft4();
                    break;

                case 5:
                    programOff();
                    break;

                default:
                    incorrectOption();
                    break;
            }
        } while (menuLaunch > 5);

    }

    /**
     * Menú para decidir las acciones de la nave
     */
    public static void launchedSpacecraft1() {
        Integer menuLaunchShip;
        do {
            System.out.println("\n" + "¿Qué hará la nave?");
            System.out.println("1. Girar" + "\n" + "2. Aterrizar" + "\n" + "3. Frenar");

            menuLaunchShip = Scan();
            switch (menuLaunchShip) {
                case 1:
                    SpaceShuttle rotateSpaceCraft = new SpaceShuttle();
                    rotateSpaceCraft.rotateSpaceCraft();
                    break;

                case 2:
                    landInEarth();
                    break;

                case 3:
                    SpaceShuttle stopSpaceCraft = new SpaceShuttle();
                    stopSpaceCraft.endUp();
                    break;

                default:
                    incorrectOption();
                    break;
            }
        } while (menuLaunchShip > 3);

    }

    public static void launchedSpacecraft2() {
        Integer menuLaunchShip;
        do {
            System.out.println("\n" + "¿Qué hará la nave?");
            System.out.println("1. Girar" + "\n" + "2. Aterrizar" + "\n" + "3. Frenar");

            menuLaunchShip = Scan();
            switch (menuLaunchShip) {
                case 1:
                    UncrewedSpacecraft rotateSpaceCraft = new UncrewedSpacecraft();
                    rotateSpaceCraft.rotateSpaceCraft();
                    break;

                case 2:
                    landInEarth();
                    break;

                case 3:
                    UncrewedSpacecraft  stopSpaceCraft = new UncrewedSpacecraft ();
                    stopSpaceCraft.endUp();
                    break;

                default:
                    incorrectOption();
                    break;
            }
        } while (menuLaunchShip > 3);
    }

    public static void launchedSpacecraft3() {
        Integer menuLaunchShip;
        do {
            System.out.println("\n" + "¿Qué hará la nave?");
            System.out.println("1. Girar" + "\n" + "2. Aterrizar" + "\n" + "3. Frenar");

            menuLaunchShip = Scan();
            switch (menuLaunchShip) {
                case 1:
                    CrewedSpacecraft rotateSpaceCraft = new CrewedSpacecraft();
                    rotateSpaceCraft.rotateSpaceCraft();
                    break;

                case 2:
                    landInEarth();
                    break;

                case 3:
                    CrewedSpacecraft stopSpaceCraft = new CrewedSpacecraft();
                    stopSpaceCraft.endUp();
                    break;

                default:
                    incorrectOption();
                    break;
            }
        } while (menuLaunchShip > 3);
    }

    public static void launchedSpacecraft4() {
        Integer menuLaunchShip;
        do {
            System.out.println("\n" + "¿Qué hará la nave?");
            System.out.println("1. Girar" + "\n" + "2. Aterrizar" + "\n" + "3. Frenar");

            menuLaunchShip = Scan();
            switch (menuLaunchShip) {
                case 1:
                    atvSpacecraft rotateSpaceCraft = new atvSpacecraft();
                    rotateSpaceCraft.rotateSpaceCraft();
                    break;

                case 2:
                    landInEarth();
                    break;

                case 3:
                    atvSpacecraft stopSpaceCraft = new atvSpacecraft();
                    stopSpaceCraft.endUp();
                    break;

                default:
                    incorrectOption();
                    break;
            }
        } while (menuLaunchShip > 3);
    }
}
