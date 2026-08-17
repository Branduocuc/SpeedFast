package cl.speedfast.app;

import cl.speedfast.model.Pedido;
import cl.speedfast.model.PedidoComida;
import cl.speedfast.model.PedidoEncomienda;
import cl.speedfast.model.PedidoExpress;

public class Main {

    public static void main(String[] args) {

        Pedido comida = new PedidoComida(
                1,
                "Direccion 1",
                "Comida"
        );

        Pedido encomienda = new PedidoEncomienda(
                2,
                "Direccion 2",
                "Encomienda"
        );

        Pedido express = new PedidoExpress(
                3,
                "Direccion 3",
                "Express"
        );

        System.out.println("=== PEDIDO COMIDA ===");
        comida.asignarRepartidor();
        comida.asignarRepartidor("Repartidor 1");

        System.out.println();

        System.out.println("=== PEDIDO ENCOMIENDA ===");
        encomienda.asignarRepartidor();
        encomienda.asignarRepartidor("Repartidor 2");

        System.out.println();

        System.out.println("=== PEDIDO EXPRESS ===");
        express.asignarRepartidor();
        express.asignarRepartidor("Repartidor 3");
    }
}