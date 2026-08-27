package cl.speedfast.model;

import java.util.ArrayList;

public class ControlDeEnvios implements Despachable, Cancelable, Rastreable {





    @Override
    public void cancelar() {
        System.out.println("Pedido cancelado exitosamente.");
        historial.add("Pedido cancelado");
    }


    @Override
    public void verHistorial() {
        System.out.println("Historial:");

        for (String registro : historial) {
            System.out.println("- " + registro);
        }
    }

    @Override
    public void despachar() {
        System.out.println("Pedido despachado correctamente.");
        historial.add("Pedido despachado");
    }


    private ArrayList<String> historial = new ArrayList<>();





}