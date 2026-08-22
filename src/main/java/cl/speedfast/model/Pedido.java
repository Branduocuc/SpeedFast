package cl.speedfast.model;

public abstract class Pedido {


protected int idPedido;
protected String direccionEntrega;
protected double distanciaKm;


public Pedido (int idPedido, String direccionEntrega , double distanciaKm)

    {
    this.idPedido = idPedido;
    this.direccionEntrega = direccionEntrega;
    this.distanciaKm = distanciaKm;

    }

    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
    }



    public abstract int calcularTiempoEntrega();



}

