public class Hervidor extends Electrodomestico{
//Atributos
private float capacidadMaximaLts = 2; //Implementar funciones con esto mas tarde.
private float cantidadAgua;

    //Instancia del singleton
    private InterruptorGeneral obj;
    public Hervidor(int consumoElectrico) {
        super(); //ESTUDIAR FUNCIONAMIENTO Y LOGICA. <--
        this.consumoElectrico = consumoElectrico;
        this.nombre = "hervidor";
        
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();
    }
    

    //GET --> ACCEDER al valor de un atributo
    public boolean getEstadoHervidor() {
        return estadoElectrodomestico;
    }
    public boolean getEstadoInterruptor(){
        return estadoInterruptor;
    }
    
    public float getCapacidadMaximaLts(){
        return capacidadMaximaLts;
    }
    public float getCantidadAgua(){
        return cantidadAgua;
    }
    //SET --> MODIFICAR el valor de un atributo
    public boolean setEstadoHervidor(boolean estadoElectrodomestico) {
        return this.estadoElectrodomestico = estadoElectrodomestico;
    }

    
        public float setCapacidadMaximaLts(){
        return this.capacidadMaximaLts = capacidadMaximaLts;
    }
    public float setCantidadAgua(){
        return this.cantidadAgua = cantidadAgua;
    }
    
    
    
    public boolean interruptorHervidor() {                       //BUG! al apagarlo sigue encendido y consumiendo electricidad.
        if (conexion == true){                                 
            if (getEstadoInterruptor() == true){                
                setEstadoInterruptor(false);
                if (obj.getEstadoInterruptorGeneral() == true ){
                    obj.setConsumoElectrico(obj.getConsumoElectrico() - consumoElectrico);
                }
                return setEstadoHervidor(false);                
            } else {                                            
                setEstadoInterruptor(true);                    
                if (obj.getEstadoInterruptorGeneral() == true){ 
                    obj.setConsumoElectrico(obj.getConsumoElectrico() + consumoElectrico);
                    return setEstadoHervidor(true);             
                }                                               
                return getEstadoInterruptor();                     
            }                                                         
        } else {                                              
            if (getEstadoInterruptor() == true){               
                setEstadoInterruptor(false);                  
                return setEstadoHervidor(false);                
            } else {                                           
                setEstadoInterruptor(true);                   
                if (obj.getEstadoInterruptorGeneral() == true){ 
                    return setEstadoHervidor(false);            
                }                                                               
                return getEstadoInterruptor();                     
            }                                                   
        }
    }

}
