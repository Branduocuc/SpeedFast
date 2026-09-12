package cl.speedfast.model;

public  class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private EstadoPedido estado;

    public Pedido(int idPedido, String direccionEntrega) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;

        this.estado = EstadoPedido.PENDIENTE;
    }

    public int getIdPedido() {
        return idPedido;
    }



    public EstadoPedido getEstado() {
        return estado;
    }


    public void setEstado(EstadoPedido estado) {
        this.estado = estado;

    }




    @Override
    public String toString() {
        return "Pedido #" + idPedido
                + " | Dirección: " + direccionEntrega
                + " | Estado: " + estado;
    }


}








