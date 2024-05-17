package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParqueaderoTest {
    @Test
    public void testRegistrarVehiculo() {
        Parqueadero parqueadero = new Parqueadero(10);
        Propietario propietario = new Propietario("1", "Juan Perez");
        Vehiculo vehiculo = new Vehiculo("ABC123", "2022", propietario);
        Puesto puesto = new Puesto(0, 0);

        assertTrue(parqueadero.registrarVehiculo(vehiculo, puesto));
        assertFalse(parqueadero.registrarVehiculo(vehiculo, puesto));
    }

    @Test
    public void testCalcularCosto() {
        Parqueadero parqueadero = new Parqueadero(10);
        parqueadero.configurarTarifa("Carro", 10.0);

        Propietario propietario = new Propietario("1", "Juan Perez");
        Vehiculo vehiculo = new Vehiculo("ABC123", "2022", propietario);

        assertEquals(50.0, parqueadero.calcularCosto(vehiculo, 5.0));
        System.out.println("probando");
    }

    @Test
    public void testConfigurarTarifa() {
        Parqueadero parqueadero = new Parqueadero(10);
        parqueadero.configurarTarifa("Carro", 10.0);

        Propietario propietario = new Propietario("1", "Juan Perez");
        Vehiculo vehiculo = new Vehiculo("ABC123", "2022", propietario);

        assertEquals(10.0, parqueadero.calcularCosto(vehiculo, 1.0));
    }


}
