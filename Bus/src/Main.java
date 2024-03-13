import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        System.out.println("\nIngrese los datos del bus: ");

        System.out.println("\n¿Cuál es la placa del bus?: ");
        String placa = entrada.next();

        System.out.println("¿Cuál es la capacidad máxima de pasajeros?: ");
        int cantPasajeros = entrada.nextInt();

        System.out.println("¿Cuál es el precio del pasaje?");
        double valorPasaje = entrada.nextDouble();

        Bus bus1 = new Bus(placa, cantPasajeros, valorPasaje);

        do{
            System.out.println("\nMenú");
            System.out.println("1. Ver datos del bus");
            System.out.println("2. Subir pasajeros");
            System.out.println("3. Bajar pasajeros");
            System.out.println("4. Pasajeros totales");
            System.out.println("5. Dinero acumulado");
            System.out.println("6. Salir");

            System.out.println("\nElija una opción: ");
            opcion = entrada.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("\nLa información del bus es la siguiente: ");
                    System.out.println("Placa: " + bus1.getPlaca());
                    System.out.println("Capacidad de pasajeros: " + bus1.getCapacidadPasajeros());
                    System.out.println("Precio del pasaje: " + "$" + bus1.getPrecioPasaje());
                    break;
                case 2:
                    bus1.subirPasajeros(bus1.getPasajerosActuales());
                    System.out.println("La cantidad de pasajeros actuales es de: " + bus1.getPasajerosActuales());
                    break;
                case 3:
                    bus1.bajarPasajeros(bus1.getPasajerosActuales());
                    System.out.println("La cantidad de pasajeros actuales es de: " + bus1.getPasajerosActuales());
                    break;
                case 4:
                    System.out.println("\nLa cantidad total de pasajeros que subieron al bus es de: " + bus1.getTotalPasajeros());
                    break;
                case 5:
                    bus1.dineroGanado(bus1.getDineroAcumulado());
                    System.out.println("\nLa cantidad total de dinero acumulado es de: " + bus1.getDineroAcumulado());
                    break;
                case 6:
                    System.out.println("Gracias por utilizar nuestro servivio.");
                    break;
                default:
                    System.out.println("\nDebe elegir una opción entre 1 a 6");
                    break;
            }

        }while(!(opcion == 6));



    }
}