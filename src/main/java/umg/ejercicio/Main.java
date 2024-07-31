package umg.ejercicio;
import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Vehiculo;
import conductores.Conductor;
import conductores.ConductorDeCoche;
import conductores.ConductorDeMoto;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo ("Volkswagen", "Volkswagen Golf", 2017);
        Moto moto = new Moto("Honda", "Honda CBR600RR",2020, true);
        Coche coche = new Coche("Volkswagen", "Volkswagen Golf", 2017, 2);
        Conductor conductor = new Conductor("Blanky", "C5448544");

        System.out.println("\nInformacion del vehiculo:");
        vehiculo.mostrarDetalles();
        System.out.println("\nInformacion del conductor de la moto");
        moto.mostrarDetalles();
        System.out.println("\nInformacion completa del coche:");
        coche.mostrarDetalles();
        System.out.println("\nInformacion del Conductor:");
        conductor.mostrarINFO();
    }
}