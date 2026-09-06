package cl.speedfast.model;

import java.util.ArrayList;

public class Repartidor implements Runnable {

    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Repartidor(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    @Override
    public void run() {

        for (Pedido pedido : pedidos) {

            System.out.println(
                    "[Repartidor: " + nombre + "] Entregando pedido #"
                            + pedido.getIdPedido() + "..."
            );

            try {
                int pausa = 1000 + (int) (Math.random() * 2000);
                Thread.sleep(pausa);

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();

                System.out.println(
                        "[Repartidor: " + nombre + "] Interrumpido."
                );

                return;
            }

            System.out.println(
                    "[Repartidor: " + nombre + "] Pedido #"
                            + pedido.getIdPedido() + " entregado."
            );
        }
    }
}