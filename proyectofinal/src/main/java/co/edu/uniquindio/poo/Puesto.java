package co.edu.uniquindio.poo;

public class Puesto {

    private int numeroPuesto;
    private boolean disponible;
    private Vehiculo vehiculo;

    public Puesto(int numeroPuesto,boolean disponible, Vehiculo vehiculo) {
        this.numeroPuesto=numeroPuesto;
        this.disponible=true;
        this.vehiculo = vehiculo;

    }

    public void cambiarEstado(){
        if(this.disponible){
            this.disponible = false;
        }
        else{
            this.disponible = true;
        }
    }

    public int getNumeroPuesto() {
        return numeroPuesto;
    }

    public void setNumeroPuesto(int numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
       
    }
    
}


