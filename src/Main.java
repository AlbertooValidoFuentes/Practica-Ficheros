import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "Q":
                    break;
            }

        }

    }


}