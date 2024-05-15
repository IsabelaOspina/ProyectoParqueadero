package co.edu.uniquindio.poo;

public class Puesto {
    private int i;
    private int j;
    private Vehiculo vehiculo;

    public Puesto(int i, int j) {
        this.i = i;
        this.j = j;
        this.vehiculo = null;
    }

    public boolean estaDisponible() {
        return this.vehiculo == null;
    }

    public boolean ocupar(Vehiculo vehiculo) {
        if (this.estaDisponible()) {
            this.vehiculo = vehiculo;
            return true;
        }
        return false;
    }

    public void desocupar() {
        this.vehiculo = null;
    }

    public int getI() {
        return i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo=vehiculo;
    }
        
}


