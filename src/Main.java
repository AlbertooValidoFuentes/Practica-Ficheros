import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean salir = false;

        Plane f18 = new Plane(0, "", "");

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
                case "3":
                    if (f18.getInitialized()) {
                        f18.toggleLandingGear();
                        System.out.println(f18);
                    } else {
                        System.out.println("F18 no inicializado");
                    }
                case "4":
                    if (f18.getInitialized()) {
                        f18.ejectionSystem();
                        System.out.println(f18);
                    } else {
                        System.out.println("F18 no inicializado");
                    }
                case "5":
                    break;
                case "Q":
                    break;
            }

        }

    }


}