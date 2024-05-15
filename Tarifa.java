package co.edu.uniquindio.poo;

import java.util.HashMap;

public class Tarifa {
    private HashMap<String, Double> tarifas;

    public Tarifa() {
        this.tarifas = new HashMap<String, Double>();
        this.tarifas.put("Moto", 0.0);
        this.tarifas.put("Carro", 0.0);
        this.tarifas.put("Moto Híbrida", 0.0);
    }

    public void configurarTarifa(String tipoVehiculo, double tarifa) {
        this.tarifas.put(tipoVehiculo, tarifa);
    }

    public double obtenerTarifa(String tipoVehiculo) {
        return this.tarifas.getOrDefault(tipoVehiculo,0.0);
    }
}
