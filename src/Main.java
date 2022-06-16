import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{

        final String PATH = "data/plane.dat";

        FileInputStream inputStream;
        BufferedInputStream bufferedInput;
        ObjectInputStream objectInput;

        Plane f18 = new Plane(0, "", "");

        try {

            inputStream = new FileInputStream(PATH);
            bufferedInput = new BufferedInputStream(inputStream);
            objectInput = new ObjectInputStream(bufferedInput);

            try {

                f18 = (Plane) objectInput.readObject();

                System.out.println("SUCCESS: Se ha cargado el archivo guardado correctamente.");

            } catch (IOException e) {
                System.out.println("ERROR: Se ha producido un error en la E/S");
            } catch (ClassNotFoundException e) {
                System.out.println("ERROR: Se ha producido un error intentando leer la información");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("WARNING: No se ha encontrado un archivo con datos " +
                    "guardados, se creará uno al cerrar por voluntad la sesion");
        } catch (IOException e) {
            System.out.println("ERROR: Se ha producido un error en la E/S");
        }


        FileOutputStream outputFile = null;
        BufferedOutputStream bufferedOutput = null;
        ObjectOutputStream objectOutput = null;


        Scanner scan = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {

            System.out.println("1. Inicializar F18. ");
            System.out.println("2. Alternar estado de los flaps. ");
            System.out.println("3. Alternar estado del tren de aterrizaje. ");
            System.out.println("4. Armar sistema de eyeccion. ");
            System.out.println("5. Eyectar piloto. ");
            System.out.println("Q. Salir");

            System.out.println("Ingrese una opcion: ");
            String opcion = scan.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el nivel de combustible: ");
                    int nivelCombustible = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Ingrese el apodo del piloto");
                    String apodoPiloto = scan.nextLine();

                    System.out.println("Ingrese el numero de escuadron: ");
                    String numeroEscuadron = scan.nextLine();

                    f18 = new Plane(nivelCombustible, apodoPiloto, numeroEscuadron);

                    f18.setInitialized(true);

                    System.out.println(f18);
                    break;
                case "2":
                    if (f18.getInitialized()) {
                        f18.toggleFlaps();
                        System.out.println(f18);
                    } else {
                        System.out.println("F18 no inicializado");
                    }
                    break;
                case "3":
                    if (f18.getInitialized()) {
                        f18.toggleLandingGear();
                        System.out.println(f18);
                    } else {
                        System.out.println("F18 no inicializado");
                    }
                    break;
                case "4":
                    if (f18.getInitialized()) {
                        f18.ejectionSystem();
                        System.out.println(f18);
                    } else {
                        System.out.println("F18 no inicializado");
                    }
                    break;
                case "5":
                    if (f18.getEjectionSystem()) {
                        f18.setSeatOccupation(false);
                        System.out.println(f18);
                    } else {
                        System.out.println("Sistema de eyeccion no armando");
                    }
                    break;
                case "Q":
                case "q":

                    try {

                        outputFile = new FileOutputStream(PATH);
                        bufferedOutput = new BufferedOutputStream(outputFile);
                        objectOutput = new ObjectOutputStream(bufferedOutput);

                        objectOutput.writeObject(f18);

                    } catch (FileNotFoundException e) {
                        System.out.println("ERROR: La ruta marcada no existe");
                    } catch (IOException e) {
                        System.out.println("ERROR: Se ha producido un error en la E/S");
                    } finally {
                        try  {
                            if (objectOutput != null) objectOutput.close();
                            if (bufferedOutput != null) objectOutput.close();
                            if (outputFile != null) objectOutput.close();
                        } catch (IOException e) {
                            System.out.println("ERROR: No se ha podido cerrar el archivo");
                        }
                    }

                    System.out.println("Saliendo...");
                    salir = true;
                    break;
            }
        }
    }
}