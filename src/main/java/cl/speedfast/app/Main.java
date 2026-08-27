package cl.speedfast.app;

import cl.speedfast.model.PedidoComida;
import cl.speedfast.model.PedidoEncomienda;
import cl.speedfast.model.PedidoExpress;
import cl.speedfast.model.ControlDeEnvios;

public class Main {

    public static void main(String[] args) {

        PedidoComida comida = new PedidoComida(
                1,
                "Direccion 1",
                4
        );

        PedidoEncomienda encomienda = new PedidoEncomienda(
                2,
                "Direccion 2",
                6
        );

        PedidoExpress express = new PedidoExpress(
                3,
                "Direccion 3",
                7
        );

        comida.asignarRepartidor();
        comida.asignarRepartidor("Repartidor 1");

        encomienda.asignarRepartidor();
        encomienda.asignarRepartidor("Repartidor 2");

        express.asignarRepartidor();
        express.asignarRepartidor("Repartidor 3");

        System.out.println();

        System.out.println("=== PEDIDO COMIDA ===");
        comida.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + comida.calcularTiempoEntrega() + " minutos");
        comida.despachar();

        System.out.println();

        System.out.println("=== PEDIDO ENCOMIENDA ===");
        encomienda.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + encomienda.calcularTiempoEntrega() + " minutos");
        encomienda.verHistorial();

        System.out.println();

        System.out.println("=== PEDIDO EXPRESS ===");
        express.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + express.calcularTiempoEntrega() + " minutos");
        express.cancelar();

        System.out.println();

        ControlDeEnvios control = new ControlDeEnvios();

        control.despachar();
        control.cancelar();
        control.verHistorial();
    }
}