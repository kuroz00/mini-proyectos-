------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: SimulacionLamparas

PURPOSE OF PROJECT: Simular el funcionamiento de las lamparas al interior de una casa

VERSION or DATE: 30-05-2024

AUTHORS: 
Manuel Bahamondez

USER INSTRUCTIONS:

Interruptor General
Instancia: Es un singleton, lo que significa que solo puede haber una instancia en todo el programa.


Atributos

lamparasConectadas: ArrayList que mantiene todas las lámparas conectadas a este interruptor.
lamparasEncendidas: ArrayList que mantiene las lámparas actualmente encendidas.
estadoInterruptorGeneral: Indica si el interruptor general está encendido (true) o apagado (false).
Contador_lamparas: Contador que lleva la cuenta de las lámparas conectadas.
LampEncendidas: Contador que lleva la cuenta de las lámparas que están encendidas en un momento dado.
Métodos:

registrar(Lampara lampara): Registra una lámpara en el interruptor general, agregándola a lamparasConectadas y actualizando el contador.
removeLampara(Lampara lampara): Remueve una lámpara del interruptor general, eliminándola de lamparasConectadas y actualizando el contador.
interruptorIG(): Permite encender o apagar el interruptor general. Si se enciende, verifica cada lámpara conectada y, si corresponde, las enciende o apaga según el estado de los interruptores.

Lámpara
Instancia y atributos:

estadoInterruptor: Estado del interruptor de la lámpara (encendido/apagado).
estadoLampara: Estado de la lámpara (encendida/apagada).
conexion: Estado de conexión de la lámpara al interruptor general.
obj: Instancia del singleton InterruptorGeneral.
Métodos:

conectar(): Conecta la lámpara al interruptor general. Si ambos interruptores están encendidos, enciende la lámpara.
desconectar(): Desconecta la lámpara del interruptor general y la apaga si está encendida.
interruptorLampara(): Permite encender o apagar la lámpara. Verifica la conexión y los estados de los interruptores para determinar si la lámpara puede encenderse.
Métodos get y set para los estados de la lámpara e interruptor, permitiendo acceder y modificar estos estados.

Funcionamiento básico
Lámpara Encendida:

La lámpara está encendida cuando tanto su interruptor (estadoInterruptor) como el interruptor general (estadoInterruptorGeneral) están encendidos, y la lámpara está conectada al interruptor general.
Lámpara Apagada:

La lámpara está apagada si no está conectada al interruptor general, su interruptor o el interruptor general están apagados.
Objetivo del Programa:

Simular el funcionamiento de lámparas conectadas a un interruptor general dentro de una casa. Esto incluye manejar la conexión y desconexión de lámparas, así como el encendido y apagado controlado por los interruptores.
