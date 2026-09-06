package cl.speedfast.app;

import cl.speedfast.model.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        PedidoComida comida1 = new PedidoComida(
                1,
                "Direccion 1",
                4
        );

        PedidoEncomienda encomienda1 = new PedidoEncomienda(
                2,
                "Direccion 2",
                6
        );

        PedidoExpress express1 = new PedidoExpress(
                3,
                "Direccion 3",
                7
        );

        PedidoComida comida2 = new PedidoComida(
                4,
                "Direccion 4",
                5
        );

        PedidoEncomienda encomienda2 = new PedidoEncomienda(
                5,
                "Direccion 5",
                8
        );

        PedidoExpress express2 = new PedidoExpress(
                6,
                "Direccion 6",
                3
        );

        PedidoExpress expressCancelado = new PedidoExpress(
                7,
                "Direccion 7",
                2
        );

        ControlDeEnvios control = new ControlDeEnvios();

        control.reservarPedido(comida1);
        control.despacharPedido(comida1);
        control.cancelarPedido(expressCancelado);
        control.verHistorialPedido(encomienda1);

        System.out.println();

        Repartidor repartidor1 = new Repartidor("Repartidor 1");
        Repartidor repartidor2 = new Repartidor("Repartidor 2");
        Repartidor repartidor3 = new Repartidor("Repartidor 3");

        repartidor1.agregarPedido(comida1);
        repartidor1.agregarPedido(express1);

        repartidor2.agregarPedido(encomienda1);
        repartidor2.agregarPedido(comida2);

        repartidor3.agregarPedido(encomienda2);
        repartidor3.agregarPedido(express2);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(repartidor1);
        executor.execute(repartidor2);
        executor.execute(repartidor3);

        executor.shutdown();

        try {
            executor.awaitTermination(
                    1,
                    TimeUnit.MINUTES
            );

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

            System.out.println(
                    "La ejecución fue interrumpida."
            );
        }

        System.out.println(
                "Todos los repartidores terminaron sus entregas."
        );
    }
}