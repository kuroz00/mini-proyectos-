/**
 * La clase Hervidor extiende de Electrodomestico y define las propiedades y comportamientos especificos de un hervidor de agua.
 * Incluye metodos para llenar, hervir y servir agua.
 */
public class Hervidor extends Electrodomestico{
    //Atributos
    private int capacidadMaximaML = 2000; //Implementar funciones con esto mas tarde.
    private int cantidadAguaML = 0;
    private boolean caliente = false;
    private Taza taza;

    //Instancia del singleton
    private InterruptorGeneral obj;
    
    /**
     * Constructor de la clase Hervidor.
     * Inicializa el consumo electrico y el nombre del hervidor.
     * 
     * @param consumoElectrico El consumo electrico del hervidor en vatios.
     */
    public Hervidor(int consumoElectrico) {
        super(); 
        this.consumoElectrico = consumoElectrico;
        this.nombre = "hervidor";
        
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();
    }
    
    /**
     * Asocia una taza al hervidor.
     * 
     * @param taza La taza a asociar.
     */
    public void a_usarTaza(Taza taza){
        this.taza = taza;
    }
    
    
    /**
     * Llena el hervidor hasta su capacidad maxima.
     */
    public void a_rellenarHervidor(){
        cantidadAguaML = 2000;
    }
    
    
    /**
     * Hierve el agua del hervidor si esta conectado, el interruptor general esta cerrado y hay suficiente agua.
     * 
     * @return true si el agua esta caliente, false en caso contrario.
     */
    public boolean a_hervir(){//
        if(conexion == true && obj.getEstadoInterruptorGeneral() == true && cantidadAguaML > 200){
            caliente = true;
        }
        return caliente;
    }
    
    /**
     * Sirve agua caliente en la taza asociada si hay suficiente agua en el hervidor.
     * Imprime un mensaje si no hay una taza seleccionada o si el agua se desborda.
     */
    public void a_servirAgua(){
        if(taza != null){
            if((cantidadAguaML >= 200) && (taza.getCantidadLiquido() <= taza.getCantidadMaxLiquido())){
                switch(taza.getCantidadLiquido()){
                    case 0:
                        taza.setCantidadLiquido(200);
                        cantidadAguaML -= 200;
                        break;
                    case 50:
                        taza.setCantidadLiquido(200);
                        cantidadAguaML -= 150;
                        break;
                    case 100:
                        taza.setCantidadLiquido(200);
                        cantidadAguaML -= 100;
                        break;
                    case 150:
                        taza.setCantidadLiquido(200);
                        cantidadAguaML -= 50;
                        break;
                    case 200:
                        taza.setCantidadLiquido(0);
                        System.out.println("se ha desbordado el agua en la taza... ESTABA LLENA! ME QUEMOOOOOO");
                        break;
                        
                    default:
                        setCantidadAgua(cantidadAguaML -(taza.getCantidadMaxLiquido() - taza.getCantidadLiquido()));
                        taza.setCantidadLiquido(200);
                        break;
                    }
            }
        } else {
            System.out.println("Seleccione una taza!");
        }
    }
    
    public float getCapacidadMaximaLts(){
        return capacidadMaximaML;
    }
    public float getCantidadAgua(){
        return cantidadAguaML;
    }
    //Atributos propios de la clase
    public float setCapacidadMaximaLts(){
        return this.capacidadMaximaML = capacidadMaximaML;
    }
    public float setCantidadAgua(int agua){
        return this.cantidadAguaML = agua;
    }

}
