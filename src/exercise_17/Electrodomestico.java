package exercise_17;

import java.util.HashMap;
import java.util.Map;

public class Electrodomestico {

    private int precioBase;
    private String color;
    private char consumoElectrico;
    private float peso;
    private int precioFinal = 0;
    private static final String COLOR_DEF = "blanco";
    private static final char CONSUMO_DEF = 'F';
    private static final int PRECIO_DEF = 100;
    private static final float PESO_DEF = 5;
    private Map<Character, Integer> aumentoPorConsumo = new HashMap<>();

    public Electrodomestico(){
        this(PRECIO_DEF, COLOR_DEF, CONSUMO_DEF, PESO_DEF);
    }

    public Electrodomestico(int precioBase, float peso){
        this(precioBase, COLOR_DEF, CONSUMO_DEF, peso);
    }

    public Electrodomestico(int precioBase, String color, char consumoElectrico, float peso){
        comprobarConsumoEnergetico(consumoElectrico);
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoElectrico = comprobarConsumoEnergetico(consumoElectrico);
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char consumoElectrico){
        String consumo[] = {"A", "B", "C", "D", "E", "F"};
        String consumoIngresado = String.valueOf(consumoElectrico);
        if(buscador(consumo, consumoIngresado)){
            return CONSUMO_DEF;
        }
        return Character.toUpperCase(consumoElectrico);
    }

    public String comprobarColor(String color){
        String colores[] = {"blanco", "negro","rojo", "azul", "gris"};
        if(buscador(colores, color)){
            return COLOR_DEF;
        }
        return color;
    }

    public boolean buscador(String[] valores, String valor){
        for (int i = 0; i < valores.length; i++){
            if(valor.equalsIgnoreCase(valores[i])){
                return false;
            }
        }
        return true;
    }

    public String caracteristicas(){
        return " | Precio base: "  + precioBase + " | Color: " + color + " | Consumo: " +
                consumoElectrico + " | Peso: " + peso;
    }

    public int precioFinal(){

        aumentoPorConsumo.put('A', 100);
        aumentoPorConsumo.put('B', 80);
        aumentoPorConsumo.put('C', 60);
        aumentoPorConsumo.put('D', 50);
        aumentoPorConsumo.put('E', 30);
        aumentoPorConsumo.put('F', 10);

        precioFinal += aumentoPorConsumo.get(consumoElectrico);

        if(peso<=19){
            precioFinal += precioBase + 10;
        }
        else if(peso<=49){
            precioFinal += precioBase + 50;
        }
        else if(peso<=79){
            precioFinal += precioBase + 80;
        }
        else{
            precioFinal += precioBase + 100;
        }
        return precioFinal;
    }

    public int getPrecioFinal(){
        return precioFinal;
    }
}
