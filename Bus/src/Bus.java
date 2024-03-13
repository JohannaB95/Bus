import java.util.Scanner;

public class Bus {

    Scanner entrada = new Scanner(System.in);
    private String placa;
    private int capacidadPasajeros;
    private double precioPasaje;
    private int pasajerosActuales;
    private int totalPasajeros;
    private double dineroAcumulado;

    public Bus(String placa, int capacidadPasajeros, double precioPasaje) {
        this.placa = placa;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precioPasaje = precioPasaje;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public double getPrecioPasaje() {
        return precioPasaje;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public int getTotalPasajeros() {
        return totalPasajeros;
    }

    public double getDineroAcumulado() {
        return dineroAcumulado;
    }

    public void subirPasajeros(int pasajeros) {

        int noSubidos = 0;

        do {

            System.out.println("\n¿Cuántos pasajeros van a subir?:");
            pasajeros = entrada.nextInt();

        }while(pasajeros <= 0);


        if(pasajeros == this.capacidadPasajeros){
            System.out.println("No se pueden subir más pasajeros. Ya tiene el cupo completo.");

        }else if (pasajeros <= this.capacidadPasajeros) {

            this.pasajerosActuales += pasajeros;

            if(this.pasajerosActuales > this.capacidadPasajeros) {

                System.out.println("No puede subir más de 25 pasajeros, excede la capacidad máxima.");
                noSubidos = this.pasajerosActuales - this.capacidadPasajeros;
                System.out.println("No se pudieron subir: " + noSubidos + " pasajeros");
                this.pasajerosActuales -= noSubidos;
            }

            System.out.println("Los pasajeros pueden subir");

        } else {

            System.out.println("No puede subir más de 25 pasajeros, excede la capacidad máxima.");

            if (pasajeros >= this.capacidadPasajeros) {

                noSubidos = pasajeros - this.capacidadPasajeros;
                System.out.println("No se pudieron subir: " + noSubidos + " pasajeros");
                this.pasajerosActuales += pasajeros - noSubidos;

            }
        }

        this.totalPasajeros += pasajeros - noSubidos;
    }
    public double dineroGanado(double dineroAcumulado){
        this.dineroAcumulado = this.totalPasajeros * getPrecioPasaje();
        return this.dineroAcumulado;
    }

    public void bajarPasajeros(int pasajeros) {

        System.out.println("Hay actualmente: " + this.pasajerosActuales + " pasajeros");
        do {
            System.out.println("¿Cuántos pasajeros van a bajar?: ");
            pasajeros = entrada.nextInt();
        }while(pasajeros <= 0);

        if(pasajeros <= this.pasajerosActuales){
            System.out.println("Los pasajeros se han bajado");
            this.pasajerosActuales -= pasajeros;
        } else if (this.pasajerosActuales == 0) {
            System.out.println("Ya no tiene más pasajeros");
        }
    }
}
