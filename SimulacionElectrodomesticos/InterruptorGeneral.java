import java.util.ArrayList;
import java.util.*;
/**
 * La clase InterruptorGeneral controla el estado general de los electrodomésticos conectados.
 * Implementa el patrón Singleton para asegurar que solo haya una instancia del interruptor general.
 */
public class InterruptorGeneral {
    //Atributos e instancias.
    private static InterruptorGeneral IG = new InterruptorGeneral();
    private static ArrayList<Electrodomestico> electrodomesticosConectados = new ArrayList<>();
    
    private static boolean estadoInterruptorGeneral = false;
    private static int contador_electrodomesticos = electrodomesticosConectados.size();
    private static int consumo_electrico;
    
    
    /**
     * Devuelve la instancia única del interruptor general (Singleton).
     * 
     * @return La instancia única de InterruptorGeneral.
     */
    public InterruptorGeneral getSingleton() {
        return IG;
    }

    

    
    public static int getContador() {
        return contador_electrodomesticos;
    }
    public static boolean getEstadoInterruptorGeneral() {   
        return InterruptorGeneral.estadoInterruptorGeneral;
    }
    public static int getConsumoElectrico(){
        return consumo_electrico;
    }
    //SET --> 
    public static void setContador_electrodomesticos(int contador) { 
        InterruptorGeneral.contador_electrodomesticos = contador;
    }
    public boolean setEstadoInterruptorGeneral(boolean estadoInterruptorGeneral) {  
        this.estadoInterruptorGeneral = estadoInterruptorGeneral;
        return estadoInterruptorGeneral;
    }
    public static int setConsumoElectrico(int consumoElectrico){
        return consumo_electrico = consumoElectrico;
    }
    
    
    
    //Metodos para modificar el Array-->  
    /**
     * Registra un nuevo electrodoméstico en la lista de electrodomésticos conectados.
     * 
     * @param electrodomestico El electrodoméstico que se va a registrar.
     */
    public static void registrar(Electrodomestico electrodomestico) {   
        electrodomesticosConectados.add(electrodomestico);                                     
        contador_electrodomesticos = electrodomesticosConectados.size();                             
    }      
    
    /**
     * Remueve un electrodoméstico de la lista de electrodomésticos conectados.
     * 
     * @param electrodomestico El electrodoméstico que se va a remover.
     */
    public static void remover(Electrodomestico electrodomestico){           
        electrodomesticosConectados.remove(electrodomestico);                                                 
        contador_electrodomesticos = electrodomesticosConectados.size();                                      
    }  

    
    /**
     * Cambia el estado del interruptor general y actualiza el estado de todos los electrodomésticos conectados.
     * 
     * @return true si el interruptor general está cerrado después del cambio, false si está abierto.
     */
    //Interruptor que enciendo o apaga el IG -->
    public boolean interruptorIG() {                                                                
        if (getEstadoInterruptorGeneral() == true) {                                             
            setEstadoInterruptorGeneral(false);                                            
        } else {                                                                                
            setEstadoInterruptorGeneral(true);                                                    
        }                                                                                         
        for(Electrodomestico electrodomestico : electrodomesticosConectados){ 
            if (electrodomestico.conexion == true){
                if((getEstadoInterruptorGeneral() == true) && (electrodomestico.getEstadoInterruptor() == true) /*&& (electrodomestico.nombre == "lampara") || (electrodomestico.nombre == "hervidor")*/){
                    electrodomestico.setEstadoElectrodomestico(true);
                    consumo_electrico += electrodomestico.consumoElectrico;
                }else if ((getEstadoInterruptorGeneral() == true) && (electrodomestico.nombre == "refrigerador")){
                    electrodomestico.setEstadoElectrodomestico(true);
                    consumo_electrico += electrodomestico.consumoElectrico;
                }else if (getEstadoInterruptorGeneral() == false){
                    consumo_electrico = 0;
                    electrodomestico.setEstadoElectrodomestico(false);
                }
            } 
        }
        return estadoInterruptorGeneral;                                                           
    }                                                                                               

}
