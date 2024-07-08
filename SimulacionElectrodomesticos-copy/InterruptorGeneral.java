import java.util.ArrayList;
import java.util.*;

/**
 * La clase InterruptorGeneral controla el estado general de los electrodomésticos conectados.
 * Implementa el patrón Singleton para asegurar que solo haya una instancia del interruptor general.
 */
public class InterruptorGeneral {
    /**
     * Instancia única del interruptor general (Singleton).
     */
    private static InterruptorGeneral IG = new InterruptorGeneral();
    
    /**
     * Lista de electrodomésticos conectados al interruptor general.
     */
    private static ArrayList<Electrodomestico> electrodomesticosConectados = new ArrayList<>();
    
    /**
     * Estado del interruptor general, false para apagado, true para encendido.
     */
    private static boolean estadoInterruptorGeneral = false;
    
    /**
     * Contador de electrodomésticos conectados.
     */
    private static int contador_electrodomesticos = electrodomesticosConectados.size();
    
    /**
     * Consumo eléctrico total de los electrodomésticos conectados.
     */
    private static int consumo_electrico;

    /**
     * Constructor privado para evitar la creación de instancias adicionales.
     */
    private InterruptorGeneral() {}
    
    /**
     * Devuelve la instancia única del interruptor general (Singleton).
     * 
     * @return La instancia única de InterruptorGeneral.
     */
    public InterruptorGeneral getSingleton() {
        return IG;
    }

    /**
     * Obtiene el número de electrodomésticos conectados.
     * 
     * @return El número de electrodomésticos conectados.
     */
    public static int getContador() {
        return contador_electrodomesticos;
    }

    /**
     * Obtiene el estado del interruptor general.
     * 
     * @return true si el interruptor general está encendido, false si está apagado.
     */
    public static boolean getEstadoInterruptorGeneral() {   
        return InterruptorGeneral.estadoInterruptorGeneral;
    }

    /**
     * Obtiene el consumo eléctrico total de los electrodomésticos conectados.
     * 
     * @return El consumo eléctrico total en vatios.
     */
    public static int getConsumoElectrico() {
        return consumo_electrico;
    }

    /**
     * Establece el número de electrodomésticos conectados.
     * 
     * @param contador El nuevo valor del contador de electrodomésticos.
     */
    public static void setContador_electrodomesticos(int contador) { 
        InterruptorGeneral.contador_electrodomesticos = contador;
    }

    /**
     * Establece el estado del interruptor general.
     * 
     * @param estadoInterruptorGeneral El nuevo estado del interruptor general.
     * @return El estado establecido.
     */
    public boolean setEstadoInterruptorGeneral(boolean estadoInterruptorGeneral) {  
        this.estadoInterruptorGeneral = estadoInterruptorGeneral;
        return estadoInterruptorGeneral;
    }

    /**
     * Establece el consumo eléctrico total de los electrodomésticos conectados.
     * 
     * @param consumoElectrico El nuevo valor del consumo eléctrico en vatios.
     * @return El consumo eléctrico establecido.
     */
    public static int setConsumoElectrico(int consumoElectrico) {
        return consumo_electrico = consumoElectrico;
    }

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
    public static void remover(Electrodomestico electrodomestico) {           
        electrodomesticosConectados.remove(electrodomestico);                                                 
        contador_electrodomesticos = electrodomesticosConectados.size();                                      
    }  

    /**
     * Cambia el estado del interruptor general y actualiza el estado de todos los electrodomésticos conectados.
     * 
     * @return true si el interruptor general está encendido después del cambio, false si está apagado.
     */
    public boolean interruptorIG() {                                                                
        if (getEstadoInterruptorGeneral() == true) {                                             
            setEstadoInterruptorGeneral(false);                                            
        } else {                                                                                
            setEstadoInterruptorGeneral(true);                                                    
        }                                                                                         
        for (Electrodomestico electrodomestico : electrodomesticosConectados) { 
            if (electrodomestico.conexion == true) {
                if ((getEstadoInterruptorGeneral() == true) && (electrodomestico.getEstadoInterruptor() == true)) {
                    electrodomestico.setEstadoElectrodomestico(true);
                    consumo_electrico += electrodomestico.consumoElectrico;
                } else if ((getEstadoInterruptorGeneral() == true) && (electrodomestico.nombre == "refrigerador")) {
                    electrodomestico.setEstadoElectrodomestico(true);
                    consumo_electrico += electrodomestico.consumoElectrico;
                } else if (getEstadoInterruptorGeneral() == false) {
                    consumo_electrico = 0;
                    electrodomestico.setEstadoElectrodomestico(false);
                }
            } 
        }
        return estadoInterruptorGeneral;                                                           
    }                                                                                               
}