package vehiculos;

public class Moto extends Vehiculo {
    private boolean Sidecar;

    public Moto (String marca, String modelo, int año, boolean Sidecar) {
        super(marca, modelo, año);
        this.Sidecar = Sidecar;
    }
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(" La moto tiene sidecar? " + (Sidecar ? "Si" : "No"));
    }
}
