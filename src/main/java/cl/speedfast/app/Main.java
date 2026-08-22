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
                4
        );

        Pedido encomienda = new PedidoEncomienda(
                2,
                "Direccion 2",
                6
        );

        Pedido express = new PedidoExpress(
                3,
                "Direccion 3",
                7
        );

        System.out.println("=== PEDIDO COMIDA ===");
        comida.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + comida.calcularTiempoEntrega() + " minutos");


        System.out.println();

        System.out.println("=== PEDIDO ENCOMIENDA ===");
        encomienda.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + encomienda.calcularTiempoEntrega() + " minutos");

        System.out.println();

        System.out.println("=== PEDIDO EXPRESS ===");
        express.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + express.calcularTiempoEntrega() + " minutos");

         }

             }