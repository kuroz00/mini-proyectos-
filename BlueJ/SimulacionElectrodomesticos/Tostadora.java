import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
public class Tostadora extends Electrodomestico{
    //Atributos e instancia del singleton
    private Pan pan; //
    private static final int tiempoTostadoSegundos = 5; // Definir el tiempo de tostado en segundos
    
    /**
     * @param Instancia del singleton en el constructor de la tostadora
     * 
     */
    private InterruptorGeneral obj;
    /**
     * Constructor de la clase Tostadora.
     * Inicializa el consumo electrico y el nombre de la tostadora.
     * 
     * @param consumoElectrico El consumo electrico de la tostadora.
     */
    public Tostadora(int consumoElectrico) { //consume 950 app
        super(); 
        this.consumoElectrico = consumoElectrico;
        this.nombre = "tostadora";
        
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();
    }
    
    /**
     * Inserta un pan en la tostadora.
     * 
     * @param pan El pan a ser insertado en la tostadora.
     */
    public void insertarPan(Pan pan){//
        this.pan = pan;
    }
    
    /**
     * Tosta el pan si la tostadora esta conectada, el interruptor general esta activado, y hay pan no tostado en la tostadora.
     * 
     * @return true si el pan ha sido tostado, false en caso contrario.
     */
    public boolean tostar(){
        if (conexion == true && obj.getEstadoInterruptorGeneral() == true && pan != null && pan.getTostado() == false){
            LocalTime horaInicio = LocalTime.now(); // Obtener la hora de inicio
            System.out.println("Tostado iniciado a las: " + horaInicio);
            
            try {
                TimeUnit.SECONDS.sleep(tiempoTostadoSegundos); // Simular el tiempo de tostado
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pan.setTostado(true);
            LocalTime horaFin = LocalTime.now(); // Obtener la hora de fin
            System.out.println("Tostado terminado a las: " + horaFin);
        }
        return pan.getTostado();
    }  
}
