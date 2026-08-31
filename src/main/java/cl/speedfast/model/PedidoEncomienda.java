package cl.speedfast.model;

public class PedidoEncomienda extends Pedido implements Rastreable {

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }



    @Override
    public void verHistorial() {
        System.out.println("Mostrando historial de encomienda.");
    }


    @Override
    public void asignarRepartidor() {
        System.out.println("Validando peso y embalaje...");
    }


    @Override
    public int calcularTiempoEntrega() {
        return (int) Math.round(20 + (1.5 * distanciaKm));
    }

}