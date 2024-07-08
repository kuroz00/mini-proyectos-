public class Hervidor extends Electrodomestico{
    //Atributos
    private int capacidadMaximaML = 2000; //Implementar funciones con esto mas tarde.
    private int cantidadAguaML = 0;
    private boolean caliente = false;
    private Taza taza;

    //Instancia del singleton
    private InterruptorGeneral obj;
    public Hervidor(int consumoElectrico) {
        super(); //ESTUDIAR FUNCIONAMIENTO Y LOGICA. <--
        this.consumoElectrico = consumoElectrico;
        this.nombre = "hervidor";
        
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();
    }
    
    public void a_usarTaza(Taza taza){
        this.taza = taza;
    }
    public void a_rellenarHervidor(){
        cantidadAguaML = 2000;
    }
    
    public boolean a_hervir(){//
        if(conexion == true && obj.getEstadoInterruptorGeneral() == true && cantidadAguaML > 200){
            caliente = true;
        }
        return caliente;
    }
    
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
