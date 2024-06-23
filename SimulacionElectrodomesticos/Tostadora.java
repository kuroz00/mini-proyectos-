public class Tostadora extends Electrodomestico{
    //Atributos e instancia del singleton
    
    private InterruptorGeneral obj;
    public Tostadora(int consumoElectrico) { //consume 950 app
        super(); 
        this.consumoElectrico = consumoElectrico;
        this.nombre = "tostadora";
        
        InterruptorGeneral x = new InterruptorGeneral();
        obj = x.getSingleton();
    }
    //Metodos
}
