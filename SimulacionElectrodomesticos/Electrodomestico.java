/**
 * La clase abstracta Electrodomestico define las propiedades y comportamientos comunes de todos los electrodomesticos.
 * Incluye metodos para conectar, desconectar y cambiar el estado del interruptor de los electrodomesticos.
 */
public abstract class Electrodomestico { 
    //Instancia y atributos
    protected String nombre;
    protected boolean conexion;   
    protected int consumoElectrico;
    protected boolean estadoInterruptor;
    protected boolean estadoElectrodomestico;
    
    
    /**
     * Constructor de la clase Electrodomestico.
     * Inicializa la instancia del singleton InterruptorGeneral.
     */
    private InterruptorGeneral obj;
    public Electrodomestico() {       
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();
    }
    
    
    //GET --> ACCEDER al valor de un atributo
    public boolean getConexion(){
        return conexion;
    }
    public int getConsumoElectrico(){
        return consumoElectrico;
    }
    public boolean getEstadoInterruptor(){
        return estadoInterruptor;
    }
    public boolean getEstadoElectrodomestico(){
        return estadoElectrodomestico;
    }
    //SET --> MODIFICAR el valor de un atributo
    public boolean setEstadoConexion(boolean conexion){
        return this.conexion = conexion;
    }
    public int setConsumoElectrico(int consumoElectrico){
    return this.consumoElectrico = consumoElectrico;
    }
    public boolean setEstadoInterruptor(boolean estadoInterruptor){
        return this.estadoInterruptor = estadoInterruptor;
    }
    public boolean setEstadoElectrodomestico(boolean estadoElectrodomestico){
        return this.estadoElectrodomestico = estadoElectrodomestico;
    }
    
    
    /**
     * Conecta el electrodomestico al interruptor general.
     * Si el interruptor general está cerrado, el electrodomestico se enciende y su consumo eléctrico se suma al total.
     */
    public void conectar() {                                                                        
        if (conexion == false){                                                                    
            obj.registrar(this);                                                                    
            conexion = true;                                                                        
            if((obj.getEstadoInterruptorGeneral() == true) && (this.nombre == "refrigerador")){
                obj.setConsumoElectrico(obj.getConsumoElectrico() + this.consumoElectrico);
                setEstadoElectrodomestico(true);
            } else if ((obj.getEstadoInterruptorGeneral() == true) && (getEstadoInterruptor() == true) && (this.nombre != "refrigerador")){
                obj.setConsumoElectrico(obj.getConsumoElectrico() + this.consumoElectrico);
                setEstadoElectrodomestico(true);
            }

        }                                                                                          
    }            
    /**
     * Desconecta el electrodoméstico del interruptor general.
     * Si el interruptor general está abierto, el consumo electrico del electrodomestico se resta del total y el electrodomestico se apaga.
     */
    public void desconectar() {                       
        if (conexion == true){     
            obj.remover(this);
            conexion = false;
        if((obj.getEstadoInterruptorGeneral() == true) && ((this.nombre == "refrigerador"))){
                obj.setConsumoElectrico(obj.getConsumoElectrico() - this.consumoElectrico);
                setEstadoElectrodomestico(false);        
            } else if ((obj.getEstadoInterruptorGeneral() == true) && (getEstadoInterruptor() == true) && (this.nombre != "refrigerador")){
                obj.setConsumoElectrico(obj.getConsumoElectrico() - this.consumoElectrico);
                setEstadoElectrodomestico(false);
            }
        }
    }     
    
    
    /**
     * Cambia el estado del interruptor del electrodomestico.
     * Si el electrodoméstico está conectado y el interruptor general está cerrado, el consumo eléctrico se actualiza en base a la condicional correspondiente.
     * 
     * @return El nuevo estado del interruptor del electrodoméstico.
     */
    public boolean a_interruptorElectrodomestico(){
         if (conexion == true){                                 
            if (getEstadoInterruptor() == true){                
                setEstadoInterruptor(false);
                if (obj.getEstadoInterruptorGeneral() == true ){
                    obj.setConsumoElectrico(obj.getConsumoElectrico() - consumoElectrico);
                }
                return setEstadoElectrodomestico(false);                
            } else {                                            
                setEstadoInterruptor(true);                    
                if (obj.getEstadoInterruptorGeneral() == true){ 
                    obj.setConsumoElectrico(obj.getConsumoElectrico() + consumoElectrico);
                    return setEstadoElectrodomestico(true);             
                }                                               
                return getEstadoInterruptor();                     
            }                                                         
        } else {                                              
            if (getEstadoInterruptor() == true){               
                setEstadoInterruptor(false);                  
                return setEstadoElectrodomestico(false);                
            } else {                                           
                setEstadoInterruptor(true);                   
                if (obj.getEstadoInterruptorGeneral() == true){ 
                    return setEstadoElectrodomestico(false);            
                }                                                               
                return getEstadoInterruptor();                     
            }                                                   
        }
    }
        
}      
                                                  
                                                              
    
    
    

