package cl.speedfast.model;

public class PedidoComida extends Pedido implements Despachable {




    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }



    @Override
    public void despachar() {
        System.out.println("Pedido de comida despachado.");
    }


    @Override
    public void asignarRepartidor() {
        System.out.println("Verificando mochila térmica...");
    }

    @Override
    public int calcularTiempoEntrega() {
        return 15 + (int) (2 * distanciaKm);
    }






}
