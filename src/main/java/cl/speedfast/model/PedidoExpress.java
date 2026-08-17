package cl.speedfast.model;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Buscando repartidor más cercano con disponibilidad inmediata...");
    }
}