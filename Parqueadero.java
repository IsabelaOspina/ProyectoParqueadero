package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Parqueadero {
    private ArrayList<Puesto> puestos;
    private ArrayList<Vehiculo> registroVehiculos;
    private Tarifa tarifas;

    public Parqueadero(int n) {
        this.puestos = new ArrayList<Puesto>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.puestos.add(new Puesto(i, j));
            }
        }
        this.registroVehiculos = new ArrayList<Vehiculo>();
        this.tarifas = new Tarifa();
    }

    public boolean registrarVehiculo(Vehiculo vehiculo, Puesto puesto) {
        if (puesto.ocupar(vehiculo)) {
            this.registroVehiculos.add(vehiculo);
            return true;
        }
        return false;
    }

    public double calcularCosto(Vehiculo vehiculo, double tiempo) {
        String tipoVehiculo = vehiculo instanceof Moto ? "Moto" : "Carro";
        double tarifa = this.tarifas.obtenerTarifa(tipoVehiculo);
        return tarifa * tiempo;
    }

    public void configurarTarifa(String tipoVehiculo, double tarifa) {
        this.tarifas.configurarTarifa(tipoVehiculo, tarifa);
    }
}

