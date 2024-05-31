public class Lampara { 
    //Instancia y atributos
    private boolean estadoInterruptor = false;
    private boolean estadoLampara = false;
    private static Lampara lampara = new Lampara();
    private boolean conexion = false;
    
    
    //Instancia del singleton
    private InterruptorGeneral obj;
    public Lampara() {
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();
    }
    
    
    
    //Metodos de la lampara
    //GET --> ACCEDER al valor de un atributo
    public boolean getEstadoLampara() {
        return estadoLampara;
    }
    public boolean getEstadoInterruptor() {
        return estadoInterruptor;
    }
    public boolean getConexion(){
        return conexion;
    }
    //SET --> MODIFICAR el valor de un atributo
    public boolean setEstadoLampara(boolean estadoLampara) {
        return this.estadoLampara = estadoLampara;
    }
    public boolean setEstadoInterruptor(boolean estadoInterruptor) {
        return this.estadoInterruptor = estadoInterruptor;
    }
    public boolean setEstadoConexion(boolean conexion){
        return this.conexion = conexion;
    }


     //Interruptor de la lampara                                 //
    public boolean interruptorLampara() {                       //
        if (conexion == true){                                  // <--SI la lampara esta conectada...
            if (getEstadoInterruptor() == true){                //      SI el interruptor de la lampara esta encendido...
                setEstadoInterruptor(false);                    //          apagarlo.
                obj.setLamparas_encendidas(obj.getLamparas_encendidas() -1);
                return setEstadoLampara(false);                 //          y retornar el valor apagado.
            } else {                                            //      SI NO ...
                setEstadoInterruptor(true);                     //          encenderlo.
                if (obj.getEstadoInterruptorGeneral() == true){ //          SI el interruptor general esta encendido tambien,
                    obj.setLamparas_encendidas(obj.getLamparas_encendidas() +1);
                    return setEstadoLampara(true);              //              Encender la lampara.
                }                                               //                  ...
                return getEstadoLampara();                      //          retornar estado de la lampara.
            }                                                   //          .
        } else {                                                // <-- SI la lampara NO esta conectada...
            if (getEstadoInterruptor() == true){                //       SI el interruptor de la lampara esta encendido... 
                setEstadoInterruptor(false);                    //          apagarlo...
                return setEstadoLampara(false);                 //          y retornar el valor apagado.
            } else {                                            //      SI NO ...
                setEstadoInterruptor(true);                     //          encenderlo
                if (obj.getEstadoInterruptorGeneral() == true){ //          SI el interruptor general esta encendido tambien,
                    return setEstadoLampara(false);             //              Apagar la lampara.
                }                                               //                  ...
                return getEstadoLampara();                      //          retornar estado de la lampara.
            }                                                   //
        }                                                       //
    }                                                           //
    
    
    
    public void conectar() {                                                                        //
        if (conexion == false){                                                                     // <--SI la lampara NO esta conectada
            obj.registrar(this);                                                                    //       registrarla en el interruptor general
            conexion = true;                                                                        //       y actualizar el atributo para dejar constancia de que ya existe su conexion
                if((getEstadoInterruptor() == true) && (obj.getEstadoInterruptorGeneral() == true)){//          Y SI ambos interruptores estan encendidos
                setEstadoLampara(true);                                                             //          encender la lampara
                obj.setLamparas_encendidas(obj.getLamparas_encendidas());
            }                                                                                       //
        }                                                                                           //
    }                                                                 //X//
    public void desconectar() {     //                    
        if (conexion == true){      //  <--SI la lampara SI esta conectada
            obj.removeLampara(this);//        Removerla del arreglo con lamparas registradas en el interruptor general
            conexion = false;       //        actualizar atributo para dejar constancia de su desconexion
            if(estadoLampara == true){
                obj.setLamparas_encendidas(obj.getLamparas_encendidas());
            }
            setEstadoLampara(false);//        y apagar la lampara
        }                           //
        }                           //
}