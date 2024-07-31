package vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarDetalles() {
        System.out.println("La marca de su vehiculo es " + marca);
        System.out.println("El modelo de su vehiculo es " + modelo);
        System.out.println("Su vehiculo es del año " + año);
    }
}



