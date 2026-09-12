package cl.speedfast.model;

public class Repartidor implements Runnable {

    private String nombre;
    private ZonaDeCarga zonaDeCarga;

    public  Repartidor(String nombre, ZonaDeCarga zonaDeCarga) {


        this.nombre = nombre;
        this.zonaDeCarga = zonaDeCarga;
    }


    @Override
    public void run() {

        while (true) {

            Pedido pedido = zonaDeCarga.retirarPedido();

            if(pedido == null) {
                return;

            }

            pedido.setEstado(EstadoPedido.EN_REPARTO);




            System.out.println(
                    "[Repartidor: " + nombre + "] Pedido #"
                            + pedido.getIdPedido()
                            + " | Estado: "
                            + pedido.getEstado()
            );


            try {
                Thread.sleep(1500);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                return;
            }

            pedido.setEstado(EstadoPedido.ENTREGADO);

            System.out.println(
                    "[Repartidor: " + nombre + "] Pedido #"
                            + pedido.getIdPedido()
                            + " | Estado: "
                            + pedido.getEstado()
            );



            }



        }


    }


