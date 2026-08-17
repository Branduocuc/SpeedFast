package cl.speedfast.model;

public class Pedido {


private int idPedido;
private String dirrecionEntrega;
private String tipoPedido;


public Pedido (int idPedido, String direcionEntrega , String tipoPedido)

    {
    this.idPedido = idPedido;
    this.dirrecionEntrega = direcionEntrega;
    this.tipoPedido = tipoPedido;

    }


    public int getIdPedido() {
        return idPedido;
    }

    public String getDirrecionEntrega() {
        return dirrecionEntrega;
    }
    public String getTipoPedido() {
    return tipoPedido;
    }

    public void asignarRepartidor() {
        System.out.println("Asignando repartidor...");
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }

}

