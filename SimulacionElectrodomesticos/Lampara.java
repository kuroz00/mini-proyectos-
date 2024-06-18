public class Lampara extends Electrodomestico { 
    //Instancia y atributos
 
    
    //Instancia del singleton
    private InterruptorGeneral obj;
    public Lampara(int consumoElectrico) {
        super(); //ESTUDIAR FUNCIONAMIENTO Y LOGICA. <-- 
        this.consumoElectrico = consumoElectrico;
        this.nombre = "lampara";
        
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();
    }
    
    
    
    //Metodos de la lampara
    //GET --> 
    public boolean getEstadoLampara() {
        return estadoElectrodomestico;
    }
    public boolean getEstadoInterruptor() {
        return estadoInterruptor;
    }
    //SET --> 
    public boolean setEstadoLampara(boolean estadoLampara) {
        return this.estadoElectrodomestico = estadoLampara;
    }
    public boolean setEstadoInterruptor(boolean estadoInterruptor) {
        return this.estadoInterruptor = estadoInterruptor;
    }
    
    //Atributos propios de la clase
    
    
     //Interruptor de la lampara                                
    public boolean interruptorLampara() {                       
        if (conexion == true){                                 
            if (getEstadoInterruptor() == true){               
                setEstadoInterruptor(false);
                if (obj.getEstadoInterruptorGeneral() == true ){
                    obj.setConsumoElectrico(obj.getConsumoElectrico() - consumoElectrico);
                }
                return setEstadoLampara(false);                         
            } else {                                                
                setEstadoInterruptor(true);                               
                if (obj.getEstadoInterruptorGeneral() == true){     
                    obj.setConsumoElectrico(obj.getConsumoElectrico() + consumoElectrico);
                    return setEstadoLampara(true);                        
                }                                                               
                return getEstadoInterruptor();                             
            }                                                           
        } else {                                              
            if (getEstadoInterruptor() == true){                
                setEstadoInterruptor(false);                    
                return setEstadoLampara(false);                 
            } else {                                          
                setEstadoInterruptor(true);                     
                if (obj.getEstadoInterruptorGeneral() == true){ 
                    return setEstadoLampara(false);            
                }                                               
                return getEstadoInterruptor();                     
            }                                                   
        }                                                       
    }                                                           
    
}