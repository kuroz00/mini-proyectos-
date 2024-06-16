import java.util.ArrayList;
public class InterruptorGeneral {
    // instancias y atributos
    private static InterruptorGeneral IG = new InterruptorGeneral();
    private static ArrayList<Lampara> lamparasConectadas = new ArrayList<>();
    private static ArrayList<Lampara> lamparasEncendidas = new ArrayList<>();
    //
    private static boolean estadoInterruptorGeneral = false;
    private static int Contador_lamparas = lamparasConectadas.size();

    
    
    //Se construye el Singleton devolviendo su propia referencia
    public InterruptorGeneral getSingleton() {
        return IG;
    }


    
    //metodos del interruptor general
    //GET --> Acceder al valor de un atributo
    public static int getContador() {
        return Contador_lamparas;
    }
    public static boolean getEstadoInterruptorGeneral() {   
        return InterruptorGeneral.estadoInterruptorGeneral;
    }

    //SET --> Modificar el valor de un atributo
    public static void setContador_lamparas(int contador) { 
        InterruptorGeneral.Contador_lamparas = contador;
    }
    public boolean setEstadoInterruptorGeneral(boolean estadoInterruptorGeneral) {  
        this.estadoInterruptorGeneral = estadoInterruptorGeneral;
        return estadoInterruptorGeneral;
    }
    
    
    
    //Array lamparas -->
    public static void removeLampara(Lampara lampara){//Desconexion  //Metodo para remover lamparas conectadas al interruptor general/Metodo para eliminar elementos del arreglo
            lamparasConectadas.remove(lampara);                      //Remover lampara pasada como parametro al metodo                            
            Contador_lamparas = lamparasConectadas.size();           //Actualizar contador de lamparas conectadas, "size" retornara la cantidad de objetos dentro del arreglo, y sera asignado al atributo que lleva la cuenta                           
            /*if(lampara.getEstadoLampara() == true){
                Lamparas_encendidas--;
            }*/
        }                                                                //                           
    public static void registrar(Lampara lampara) {//Conexion        //Metodo para registrar lamparas en el interruptor general/Metodo para incorporar elementos en un arreglo                           
            lamparasConectadas.add(lampara);                         //Incorporar lampara pasada como parametro al metodo               
            Contador_lamparas = lamparasConectadas.size();           //Denuevo se actualiza mediante "size".                       
            /*if(lampara.getEstadoLampara() == true){
                Lamparas_encendidas++;
            }*/
        }                                                                //   
    //Declaro denuevo el valor de "contador_lamparas" constantemente porque de lo contrario el valor queda fijo en el declarado al inicio del codigo, evitando asi su correcto funcionamiento.
    
    
    //Interruptor que enciendo o apaga el IG -->
    public boolean interruptorIG() {                                                                //
        if (getEstadoInterruptorGeneral() == true) {                                                //SI el interruptor general esta cerrado
            setEstadoInterruptorGeneral(false);                                                     //Apagarlo.
        } else {                                                                                    //SI NO...
            setEstadoInterruptorGeneral(true);                                                      //Encenderlo.
        }                                                                                           //
        for(Lampara lampara : lamparasConectadas){                                                  //Se recorre el arreglo de lamparas conectadas
            if((getEstadoInterruptorGeneral() == true) && (lampara.getEstadoInterruptor() == true)){//Si el interruptor general y el interruptor de la lampara en el ciclo actual del bucle se encuentran cerrados...
                lampara.setEstadoLampara(true);                                                     //Encender la lampara.
                Contador_lamparas = lamparasConectadas.size();                                      //Actualizar valor del contador de lamparas conectadas.
                    lamparasEncendidas.add(lampara);
            } else {                                                                                //SI NO ...
                lampara.setEstadoLampara(false);                                                    //Apagarla, debido a que ambos interruptores deben estar cerrados para que esto ocurra.
                Contador_lamparas = lamparasConectadas.size();                                      //Actualizar valor del contador de lamparas conectadas.
                lamparasEncendidas.remove(lampara);
            }                                                                                       //
        }                                                                                           //
        return estadoInterruptorGeneral;                                                            //Para finalizar retornar el estado del interruptor general.
    }                                                                                               //

}