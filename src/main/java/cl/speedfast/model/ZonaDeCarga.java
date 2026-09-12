package cl.speedfast.model;
import java.util.ArrayList;

public class ZonaDeCarga {

    private ArrayList<Pedido>  pedidos;

public ZonaDeCarga(){

    pedidos = new ArrayList<>();
}


    public synchronized void agregarPedido(Pedido pedido){
    pedidos.add(pedido);
    }



    public synchronized Pedido retirarPedido(){

    if(pedidos.isEmpty()){
        return null;
    }

    return pedidos.remove(0);


    }




}
