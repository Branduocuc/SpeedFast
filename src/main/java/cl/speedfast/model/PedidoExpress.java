package cl.speedfast.model;

public class PedidoExpress extends Pedido implements Cancelable {

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }


    @Override
    public void cancelar() {
        System.out.println("Pedido express cancelado.");
    }



    @Override
    public void asignarRepartidor() {
        System.out.println("Buscando repartidor más cercano...");
    }



    @Override
    public int calcularTiempoEntrega() {
        if (distanciaKm > 5) {
            return 15;
        }

        return 10;
    }
}