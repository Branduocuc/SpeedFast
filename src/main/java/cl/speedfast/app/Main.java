package cl.speedfast.app;


import cl.speedfast.model.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;




public class Main {

    public static void main(String[] args) {



    ZonaDeCarga zonaDeCarga = new ZonaDeCarga();


        PedidoComida comida1 = new PedidoComida(1, "Direccion 1");
        PedidoEncomienda encomienda1 = new PedidoEncomienda(2, "Direccion 2");
        PedidoExpress express1 = new PedidoExpress(3, "Direccion 3");
        PedidoComida comida2 = new PedidoComida(4, "Direccion 4");
        PedidoExpress express2 = new PedidoExpress(5, "Direccion 5");




        zonaDeCarga.agregarPedido(comida1);
        zonaDeCarga.agregarPedido(encomienda1);
        zonaDeCarga.agregarPedido(express1);
        zonaDeCarga.agregarPedido(comida2);
        zonaDeCarga.agregarPedido(express2);




        Repartidor repartidor1 = new Repartidor("Repartidor 1", zonaDeCarga);
        Repartidor repartidor2 = new Repartidor("Repartidor 2", zonaDeCarga);
        Repartidor repartidor3 = new Repartidor("Repartidor 3", zonaDeCarga);


        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(repartidor1);
        executor.execute(repartidor2);
        executor.execute(repartidor3);

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }




        System.out.println("Todos los pedidos han sido entregados correctamente");




    }


    }