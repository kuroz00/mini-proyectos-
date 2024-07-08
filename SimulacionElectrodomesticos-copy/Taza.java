public class Taza{
    //
    private int cantidadLiquido = 0; //ml
    private int cantidadMaxLiquido = 200; //ml
   
    //
    public int getCantidadLiquido(){
        return this.cantidadLiquido;
    }    
    public int setCantidadLiquido(int liquido){
        return this.cantidadLiquido = liquido;
    }

    public int getCantidadMaxLiquido(){
        return this.cantidadMaxLiquido;
    }
    public int setCantidadMaxLiquido(int liquido){
        return this.cantidadMaxLiquido = liquido;
    }

   
    public int a_beber(){
        switch (cantidadLiquido){
            case 200:
                cantidadLiquido = 175;
                break;
            case 175:
                cantidadLiquido = 150;
                break;
            case 150:
                cantidadLiquido = 125;
                break;
            case 125:
                cantidadLiquido = 100;
                break;
            case 100:
                cantidadLiquido = 75;
                break;
            case 75:
                cantidadLiquido = 50;
                break;
            case 50:
                cantidadLiquido = 25;
                break;
            case 25:
                cantidadLiquido = 0;
                break;
            case 0:
                System.out.println("VACIO!");
                break;
        }
        return cantidadLiquido;
    }
}
