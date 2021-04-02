package exercise_17;

public class Lavadora extends Electrodomestico{

    private int carga;
    private static final int CARGA = 5;
    private static final String COLOR_DEF = "blanco";
    private static final char CONSUMO_DEF = 'F';
    private static final int PRECIO_DEF = 100;
    private static final float PESO_DEF = 5;
    private int precioFinal = 0;

    public Lavadora(){
        this(PRECIO_DEF, COLOR_DEF, CONSUMO_DEF, PESO_DEF, CARGA);
    }

    public Lavadora(int precioBase, float peso){
        this(precioBase, COLOR_DEF, CONSUMO_DEF, peso, CARGA);
    }

    public Lavadora(int precioBase, String color, char consumoElectrico, float peso, int carga){
        super(precioBase, color, consumoElectrico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public int getPrecioFinal(){
        return precioFinal;
    }

    @Override
    public int precioFinal(){
        precioFinal = super.precioFinal();
        if(carga>30){
            precioFinal += 50;
        }
        return precioFinal;
    }

    @Override
    public String caracteristicas() {
        return super.caracteristicas() + " | Carga:" + carga;
    }
}
