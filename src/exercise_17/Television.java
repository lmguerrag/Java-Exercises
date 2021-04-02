package exercise_17;

public class Television extends Electrodomestico{
    private float resolucion;
    private boolean sintonizadorTDT;
    private int precioFinal = 0;
    private static final float RESOLUCION_DEF = 20;
    private static final boolean SINTONIZADOR_DEF = false;
    private static final String COLOR_DEF = "blanco";
    private static final char CONSUMO_DEF = 'F';
    private static final int PRECIO_DEF = 100;
    private static final float PESO_DEF = 5;

    public Television(){
        this(PRECIO_DEF, COLOR_DEF, CONSUMO_DEF, PESO_DEF, RESOLUCION_DEF, SINTONIZADOR_DEF);
    }

    public Television(int precioBase, float peso){
        this(precioBase, COLOR_DEF, CONSUMO_DEF, peso, RESOLUCION_DEF, SINTONIZADOR_DEF);
    }

    public Television(int precioBase, String color, char consumoElectrico, float peso,
                      float resolucion, boolean sintonizadorTDT){
        super(precioBase, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public float getResolucion() {
        return resolucion;
    }

    public int getPrecioFinal(){
        return precioFinal;
    }

    public String getSintonizadorTDT() {
        if(sintonizadorTDT){
            return " | TDT: SI ";
        }
        else{
            return " | TDT: NO ";
        }
    }

    @Override
    public int precioFinal(){
        precioFinal = super.precioFinal();
        if(resolucion>40){
            precioFinal += super.precioFinal()*0.5;
        }
        if(sintonizadorTDT){
            precioFinal += 50;
        }
        return precioFinal;
    }

    @Override
    public String caracteristicas() {
        return super.caracteristicas() + " | Resolucion:" + resolucion + getSintonizadorTDT();
    }
}
