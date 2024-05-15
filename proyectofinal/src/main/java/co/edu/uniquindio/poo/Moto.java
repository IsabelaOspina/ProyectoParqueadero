package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private double velocidadMaxima;
    private TipoMoto tipo;

    public Moto(String placa, String modelo, Propietario propietario, double velocidadMaxima, TipoMoto tipo) {
        super(placa, modelo, propietario);
        this.velocidadMaxima = velocidadMaxima;
        this.tipo=tipo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public TipoMoto getTipo() {
        return tipo;
    }

    public void setTipo(TipoMoto tipo) {
        this.tipo=tipo;
    }
   
}
