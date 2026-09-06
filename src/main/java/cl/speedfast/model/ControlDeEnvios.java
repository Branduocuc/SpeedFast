package cl.speedfast.model;

public class ControlDeEnvios {

    public void despacharPedido(Despachable pedido) {
        pedido.despachar();
    }

    public void cancelarPedido(Cancelable pedido) {
        pedido.cancelar();
    }

    public void verHistorialPedido(Rastreable pedido) {
        pedido.verHistorial();
    }

    public void reservarPedido(Pedido pedido) {
        pedido.reservar();
    }
}