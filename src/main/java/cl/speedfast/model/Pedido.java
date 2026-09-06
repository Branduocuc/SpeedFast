package cl.speedfast.model;

public abstract class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private double distanciaKm;
    private boolean reservado;

    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
        this.reservado = false;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void reservar() {
        reservado = true;
        System.out.println("Pedido #" + idPedido + " reservado.");
    }

    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
    }

    public void asignarRepartidor() {
        System.out.println("Asignando repartidor...");
    }

    public void asignarRepartidor(String nombre) {
        System.out.println("Pedido asignado a " + nombre);
    }

    public abstract int calcularTiempoEntrega();
}