import java.util.ArrayList;
import java.util.*;
public class InterruptorGeneral {
    // instancias y atributos
    private static InterruptorGeneral IG = new InterruptorGeneral();
    private static ArrayList<Electrodomestico> electrodomesticosConectados = new ArrayList<>();
    
    private static boolean estadoInterruptorGeneral = false;
    private static int contador_electrodomesticos = electrodomesticosConectados.size();
    private static int consumo_electrico;
    
    
    //Se construye el Singleton devolviendo su propia referencia
    public InterruptorGeneral getSingleton() {
        return IG;
    }

    
    
    //metodos del interruptor general
    //GET --> Acceder al valor de un atributo
    public static int getContador() {
        return contador_electrodomesticos;
    }
    public static boolean getEstadoInterruptorGeneral() {   
        return InterruptorGeneral.estadoInterruptorGeneral;
    }
    public static int getConsumoElectrico(){
        return consumo_electrico;
    }
    
    //SET --> Modificar el valor de un atributo
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
    
    
    
    //Array electrodomesticos -->                                                                                       
    public static void registrar(Electrodomestico electrodomestico) {   
        /*if(electrodomestico.nombre != "lampara"){
            consumo_electrico += electrodomestico.consumoElectrico;
        }*/
        electrodomesticosConectados.add(electrodomestico);                                     
        contador_electrodomesticos = electrodomesticosConectados.size();                             
    }      
    public static void remover(Electrodomestico electrodomestico){
        /*if(electrodomestico.nombre != "lampara"){
            consumo_electrico -= electrodomestico.consumoElectrico;
        }*/            
        electrodomesticosConectados.remove(electrodomestico);                                                 
        contador_electrodomesticos = electrodomesticosConectados.size();                                      
    }  
    public static ArrayList obtenerArreglo(){
        return electrodomesticosConectados;
    }   
    
    
    //Interruptor que enciendo o apaga el IG -->
    public boolean interruptorIG() {                                                                
        if (getEstadoInterruptorGeneral() == true) {                                             
            setEstadoInterruptorGeneral(false);                                            
        } else {                                                                                
            setEstadoInterruptorGeneral(true);                                                    
        }                                                                                         
        for(Electrodomestico electrodomestico : electrodomesticosConectados){ 
            if (electrodomestico.conexion == true){
                if((getEstadoInterruptorGeneral() == true) && (electrodomestico.getEstadoInterruptor() == true) && (electrodomestico.nombre == "lampara")){
                    electrodomestico.setEstadoElectrodomestico(true);
                    consumo_electrico += electrodomestico.consumoElectrico;
                } 
                else if ((getEstadoInterruptorGeneral() == true) && (electrodomestico.nombre != "lampara")){
                    electrodomestico.setEstadoElectrodomestico(true);
                    consumo_electrico += electrodomestico.consumoElectrico;
                } else if (getEstadoInterruptorGeneral() == false){
                    consumo_electrico = 0;
                }
                
            } 
            /*else if (electrodomestico.conexion == false){
                if((getEstadoInterruptorGeneral() == true) && (electrodomestico.getEstadoInterruptor() == true) && (electrodomestico.nombre == "lampara")){
                    electrodomestico.setEstadoElectrodomestico(false);
                } 
                else if ((getEstadoInterruptorGeneral() == true) && (electrodomestico.nombre != "lampara")){
                    electrodomestico.setEstadoElectrodomestico(true);
                }else {                                                                              
                    electrodomestico.setEstadoElectrodomestico(false);
                    consumo_electrico -= electrodomestico.consumoElectrico;
                }
            }*/
        }
        return estadoInterruptorGeneral;                                                           
    }                                                                                               

}
