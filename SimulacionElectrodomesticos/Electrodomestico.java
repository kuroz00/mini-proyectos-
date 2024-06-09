public abstract class Electrodomestico { 
    //Instancia y atributos
    protected String nombre;
    protected boolean conexion;   
    protected int consumoElectrico;
    protected boolean estadoInterruptor;
    protected boolean estadoElectrodomestico;
    
    
    //Instancia del singleton
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
    
    
    public void conectar() {                                                                        
        if (conexion == false){                                                                    
            obj.registrar(this);                                                                    
            conexion = true;                                                                        
            if((obj.getEstadoInterruptorGeneral() == true) && ((this.nombre != "lampara") 
            && (this.nombre != "hervidor"))){
                obj.setConsumoElectrico(obj.getConsumoElectrico() + this.consumoElectrico);
                setEstadoElectrodomestico(true);
            } else if ((obj.getEstadoInterruptorGeneral() == true) 
            && (getEstadoInterruptor() == true)){
                obj.setConsumoElectrico(obj.getConsumoElectrico() + this.consumoElectrico);
                setEstadoElectrodomestico(true);
            }

        }                                                                                          
    }                                                                
    public void desconectar() {                       
        if (conexion == true){     
            obj.remover(this);
            conexion = false;
            
        if((obj.getEstadoInterruptorGeneral() == true) && ((this.nombre != "lampara") 
            && (this.nombre != "hervidor"))){
                obj.setConsumoElectrico(obj.getConsumoElectrico() - this.consumoElectrico);
                setEstadoElectrodomestico(false);        
            } else if ((obj.getEstadoInterruptorGeneral() == true) 
            && (getEstadoInterruptor() == true)){
                obj.setConsumoElectrico(obj.getConsumoElectrico() - this.consumoElectrico);
                setEstadoElectrodomestico(false);
            }
        }
    }     
        
}      
                                                  
                                                              
    
    
    

