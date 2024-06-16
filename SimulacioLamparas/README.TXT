------------------------------------------------------------------------
En el presente README se detalla a leve profundidad todo detalle que el 
usuario deba conocer al momento de trabajar con el programa. Desde su
objetivo principal (respecto a la simulacion) hasta detalles tecnicos
relacionados a su programacion.
------------------------------------------------------------------------

PROJECT TITLE: SimulacionLamparas

PURPOSE OF PROJECT: Simular el funcionamiento de las lamparas al interior de una casa

VERSION or DATE: 30-05-2024

AUTHORS: 
Manuel Bahamondez

USER INSTRUCTIONS:
Comentario personal:
Para simular el correcto funcionamiento de las lamparas al interior de una casa conectadas a un interruptor general, estas solo se deben encender cuando
ambos interruptores esten cerrados, y evidentemente exista una conexion hacia el interruptor general, por lo que al perderse una de estas tres condiciones
la lampara se apagara obligatoriamente. 
Por otra parte al momento de simular el funcionamiento anteriormente mencionado en el programa, se pueden hacer
los tres pasos de la forma que el usuario desee e independiente de que orden tome para encender la lampara esta se encendera de todas formas.


Explicacion leve del codigo:

Interruptor General
Instancia: Es un singleton, lo que significa que solo puede haber una instancia en todo el programa.


Atributos

lamparasConectadas: ArrayList que mantiene todas las lámparas conectadas a este interruptor.
lamparasEncendidas: ArrayList que mantiene las lámparas actualmente encendidas.
estadoInterruptorGeneral: Indica si el interruptor general está encendido (true) o apagado (false).
Contador_lamparas: Contador que lleva la cuenta de las lámparas conectadas.

Métodos:

registrar(Lampara lampara): Registra una lámpara en el interruptor general, agregándola a lamparasConectadas y actualizando el contador.
removeLampara(Lampara lampara): Remueve una lámpara del interruptor general, eliminándola de lamparasConectadas y actualizando el contador.
interruptorIG(): Permite encender o apagar el interruptor general. Si se enciende, verifica cada lámpara conectada y, si corresponde, las enciende o apaga según el estado de los interruptores.




Lámpara
Instancia y atributos:

estadoInterruptor: Estado del interruptor de la lámpara (true = cerrado/ false = abierto).
estadoLampara: Estado de la lámpara (true = encendida/false = apagada).
conexion: Estado de conexión de la lámpara al interruptor general.
obj: Instancia del singleton InterruptorGeneral.

Métodos:

conectar(): Conecta la lámpara al interruptor general. Si ambos interruptores están cerrados, enciende la lámpara.
desconectar(): Desconecta la lámpara del interruptor general y la apaga si está encendida.
interruptorLampara(): Permite encender o apagar la lámpara. Verifica la conexión y los estados de los interruptores para determinar si la lámpara puede encenderse.
Métodos get y set para los estados de la lámpara e interruptor, permitiendo acceder y modificar estos estados.

Funcionamiento básico
Lámpara Encendida:
La lámpara está encendida cuando tanto su interruptor (estadoInterruptor) como el interruptor general (estadoInterruptorGeneral) están cerrados, y la lámpara está conectada al interruptor general.

Lámpara Apagada:
La lámpara está apagada si no está conectada al interruptor general, su interruptor o el interruptor general están apagados.

Objetivo del Programa:
Simular el funcionamiento de lámparas conectadas a un interruptor general dentro de una casa. Esto incluye manejar la conexión y desconexión de lámparas, así como el encendido y apagado controlado por los interruptores.

*Se comento un poco mas a detalle algunas lineas de codigo en los metodos mas importantes para evitar confusiones futuras.*