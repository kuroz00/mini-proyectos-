PROJECT TITLE:
Simulacion electrodomesticos.

PURPOSE OF PROJECT:
Simular el funcionamiento de distintos electrodomesticos al interior de una casa.

VERSION or DATE:
Jueves, 4 Julio 2024.

AUTHORS:
Manuel Bahamondez Paredes.

USER INSTRUCTIONS:
El presente programa simulacion el funcionamiento de un interruptor general y sus electrodomesticos.
Para empezar correctamente la simulacion, es importante tener a mano las instancias del interruptor general y electrodomesticos.

.-Interruptor general:
Se abre cuando esta en False y cierra cuando lo pasamos a True.
A su vez lleva la cuenta de electrodomesticos conectados y el consumo electrico.

.-.-Electrodomesticos.-.-
Cada electrodomestico tiene su interruptor propio, a la vez de que se puede conectar y desconectar facilmente. cerrado -> True // abierto -> False
Todos tienes su consumo electrico instanciables en el momento, menos el refrigerador que tiene un consumo fijo de 500.
Para que un electrodomestico se encienta, es necesario tienes ambos interruptores cerrados y que este este conectado.

Hervidor.-
El hervidor tiene su funcion implementada para rellenar de agua automaticamente, con un tope de 2000 ml.
Cuenta con una funcion para hervir el agua.
Al momento de querer servirse agua, es importante seleccionar una taza, en este paso el usuario debera escribir el nombre DE SU TAZA en el input que aparecera por pantalla.
Una vez hecho esto, se servira agua en la taza en base a la cantidad faltante para que esta se llene (las tazas aguantan hasta 200 ml).

Tostadora.-
Es importante insertar el pan primero (el usuario lo seleciona a mano).
Una vez hecho esto, el mismo usuario mediante el menu de la tostadora tuesta el pan. (toma un rato).
El consumo electrico no se ve reflejado por pantalla, debido al interfaz desde donde se ejecuta (BlueJ).

Lampara.-
Cambia de color en base a lo que desee el usuario, tiene verde y rojo.

Refrigerador.-
Puede guardar comida pero con tope de 20 elementos.
Sirve para guardar comida a su interior, a su vez se puede interactuar con la comida.
Cabe recalcar que tiene un tope de 20 alimentos en su interior. (y se enciende apenas se conecta al interruptor general, estando cerrado).