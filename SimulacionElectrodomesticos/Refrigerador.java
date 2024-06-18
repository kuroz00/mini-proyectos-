import java.util.ArrayList; 
public class Refrigerador extends Electrodomestico{
    //Atributos
    private static int capacidadItems = 20;
    private ArrayList<Refrigerador> refrigerador = new ArrayList<>(); //Guardar items aqui, establecer el maximo y ademas una var de temperatura interna.

    //Metodos 
    //Instancia del singleton
    private InterruptorGeneral obj;
    public Refrigerador(int consumoElectrico) {
        super(); //ESTUDIAR FUNCIONAMIENTO Y LOGICA. <--  
        this.consumoElectrico = consumoElectrico;
        this.nombre = "refrigerador";
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();
    }
    
    
    //GET --> ACCEDER al valor de un atributo
    public boolean getEstadoElectrodomestico() {
        return estadoElectrodomestico;
    }
    public boolean getConexion(){
        return conexion;
    }
    public int getConsumoElectrico(){
        return consumoElectrico;
    }
    //SET --> MODIFICAR el valor de un atributo
    public boolean setEstadoElectrodomestico() {
        return estadoElectrodomestico;
    }
    public boolean setConexion(){
        return conexion;
    }
    public int setConsumoElectrico(){
        return consumoElectrico;
    }
    
     //Atributos propios de la clase
}
