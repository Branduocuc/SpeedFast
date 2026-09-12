# SpeedFast - Semana 5

Proyecto desarrollado en Java para la actividad de Programación Orientada a Objetos II.

## Descripción

SpeedFast simula un sistema de reparto concurrente en el que varios repartidores acceden a una zona de carga compartida para retirar y entregar pedidos.

El objetivo de esta versión es aplicar concurrencia y sincronización, evitando que un mismo pedido sea retirado por más de un repartidor.

## Funcionalidades

- Registro de pedidos.
- Estados de pedido:
  - PENDIENTE
  - EN_REPARTO
  - ENTREGADO
- Zona de carga compartida.
- Retiro sincronizado de pedidos.
- Ejecución concurrente de 3 repartidores.
- Uso de `Runnable`.
- Uso de `ExecutorService`.
- Simulación del tiempo de entrega mediante `Thread.sleep()`.
- Espera de finalización de todos los repartidores.

## Estructura principal

### Pedido

Representa un pedido del sistema.

Contiene:

- ID del pedido.
- Dirección de entrega.
- Estado del pedido.

Todos los pedidos comienzan con estado `PENDIENTE`.

### EstadoPedido

Enum utilizado para representar los estados disponibles:

- `PENDIENTE`
- `EN_REPARTO`
- `ENTREGADO`

### ZonaDeCarga

Representa el recurso compartido por los repartidores.

Permite:

- Agregar pedidos.
- Retirar pedidos.

Los métodos de acceso están sincronizados para evitar que dos repartidores retiren el mismo pedido.

### Repartidor

Implementa la interfaz `Runnable`.

Cada repartidor:

1. Retira un pedido de la zona de carga.
2. Cambia su estado a `EN_REPARTO`.
3. Simula el proceso de entrega.
4. Cambia el estado a `ENTREGADO`.
5. Continúa retirando pedidos mientras existan pedidos disponibles.

### Main

La clase `Main`:

- Crea una zona de carga compartida.
- Agrega 5 pedidos.
- Crea 3 repartidores.
- Utiliza `ExecutorService` con 3 hilos.
- Espera la finalización de las tareas.
- Muestra un mensaje cuando todos los pedidos han sido entregados.

