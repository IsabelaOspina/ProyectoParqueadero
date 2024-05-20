package co.edu.uniquindio.poo;

public class Carro extends Vehiculo {
    public Carro(String placa, String modelo, Propietario propietario,Puesto puesto) {
        super(placa, modelo, propietario,puesto);
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public String getPlaca() {
        return super.getPlaca();
    }

    @Override
    public Propietario getPropietario() {
        return super.getPropietario();
    }

    @Override
    public Puesto getPuesto() {
        return super.getPuesto();
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public void setPlaca(String placa) {
        super.setPlaca(placa);
    }

    @Override
    public void setPropietario(Propietario propietario) {
        super.setPropietario(propietario);
    }

    @Override
    public void setPuesto(Puesto puesto) {
        super.setPuesto(puesto);
    }
    
}
