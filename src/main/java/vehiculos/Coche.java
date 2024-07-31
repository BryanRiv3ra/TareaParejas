package vehiculos;

public class Coche extends Vehiculo {
    private int numeropuertas;
    public Coche(String marca, String modelo, int año,  int numeropuertas) {
        super(marca, modelo, año);
        this.numeropuertas = numeropuertas;
    }
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(" El Numero de puertas del coche es: " + numeropuertas);
    }
}
