package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class Registro {
    private ArrayList<HashMap<String, Object>> entradas;
    private ArrayList<HashMap<String, Object>> salidas;

    public Registro() {
        this.entradas = new ArrayList<HashMap<String, Object>>();
        this.salidas = new ArrayList<HashMap<String, Object>>();
    }

    public void registrarEntrada(Vehiculo vehiculo, Puesto puesto, String tiempoEntrada) {
        HashMap<String, Object> entrada = new HashMap<String, Object>();
        entrada.put("vehiculo", vehiculo);
        entrada.put("puesto", puesto);
        entrada.put("tiempoEntrada", tiempoEntrada);
        this.entradas.add(entrada);
    }

    public void registrarSalida(Vehiculo vehiculo, String tiempoSalida) {
        HashMap<String, Object> salida = new HashMap<String, Object>();
        salida.put("vehiculo", vehiculo);
        salida.put("tiempoSalida", tiempoSalida);
        this.salidas.add(salida);
    }

    public String obtenerTiempoEntrada(Vehiculo vehiculo) {
        for (HashMap<String, Object> entrada : this.entradas) {
            if (entrada.get("vehiculo") == vehiculo) {
                return (String) entrada.get("tiempoEntrada");
            }
        }
        return null;
    }

    /**
     * @param vehiculo
     * @return
     */
    public String obtenerTiempoSalida(Vehiculo vehiculo) {
        for (HashMap<String, Object> salida : this.salidas) {
            if (salida.get("vehiculo") == vehiculo) {
                return (String) salida.get("tiempoSalida");
            }
        }
        return null;
    }
}


