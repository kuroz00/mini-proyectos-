Titulo: 
Simulador de Lámparas

Proposito del proyecto: 
Simular el funcionamiento de las lámparas al interior de una casa.

Fecha: 
30-05-2024

Autor:
- Manuel Bahamondez




DESCRIPCION DEL PROGRAMA:

Interruptor General
Instancia:
Es un singleton, lo que significa que solo puede haber una instancia en todo el programa.

Atributos:
- `lamparasConectadas`: `ArrayList` que mantiene todas las lámparas conectadas a este interruptor.
- `estadoInterruptorGeneral`: Indica si el interruptor general está cerrado (true) o abierto (false).
- `Contador_lamparas`: Contador que lleva la cuenta de las lámparas conectadas.

Métodos:
- `getSingleton()`: Devuelve la instancia única del interruptor general.
- `getContador()`: Devuelve el número de lámparas conectadas.
- `getEstadoInterruptorGeneral()`: Devuelve el estado del interruptor general.
- `setContador_lamparas(int contador)`: Establece el número de lámparas conectadas.
- `setEstadoInterruptorGeneral(boolean estadoInterruptorGeneral)`: Establece el estado del interruptor general.
- `registrar(Lampara lampara)`: Conecta una lámpara al interruptor general y actualiza el contador.
- `removeLampara(Lampara lampara)`: Desconecta una lámpara del interruptor general y actualiza el contador.
- `interruptorIG()`: Abre o cierra el interruptor general. Si se cierra, verifica cada lámpara conectada y las enciende o apaga según corresponda.

Lámpara
Instancia y atributos:
- `estadoInterruptor`: Estado del interruptor de la lámpara (cerrado/abierto).
- `estadoLampara`: Estado de la lámpara (encendida/apagada).
- `conexion`: Estado de conexión de la lámpara al interruptor general.
- `obj`: Instancia del singleton `InterruptorGeneral`.

Métodos:
- `getEstadoLampara()`: Devuelve el estado de la lámpara.
- `getEstadoInterruptor()`: Devuelve el estado del interruptor de la lámpara.
- `getConexion()`: Devuelve el estado de conexión de la lámpara.
- `setEstadoLampara(boolean estadoLampara)`: Establece el estado de la lámpara.
- `setEstadoInterruptor(boolean estadoInterruptor)`: Establece el estado del interruptor de la lámpara.
- `setEstadoConexion(boolean conexion)`: Establece el estado de conexión de la lámpara.
- `interruptorLampara()`: Permite abrir o cerrar el interruptor de la lámpara. Verifica la conexión y los estados de los interruptores para determinar si la lámpara puede encenderse.
- `conectar()`: Conecta la lámpara al interruptor general. Si ambos interruptores están cerrados, enciende la lámpara.
- `desconectar()`: Desconecta la lámpara del interruptor general y la apaga si está encendida.

Funcionamiento básico:
- Lámpara Encendida:
  - La lámpara está encendida cuando tanto su interruptor (`estadoInterruptor`) como el interruptor general (`estadoInterruptorGeneral`) están cerrados, y la lámpara está conectada al interruptor general.
- Lámpara Apagada:
  - La lámpara está apagada si no está conectada al interruptor general, si su interruptor o el interruptor general están abiertos.

Objetivo del Programa:
- Simular el funcionamiento de lámparas conectadas a un interruptor general dentro de una casa. Esto incluye manejar la conexión y desconexión de lámparas, así como el encendido y apagado controlado por los interruptores.

