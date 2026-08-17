package cl.speedfast.model;

public class PedidoComida extends Pedido{




    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Verificando mochila térmica...");
    }







}
