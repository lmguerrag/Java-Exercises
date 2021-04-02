package exercise_16;

import org.w3c.dom.ls.LSOutput;

public class Persona {

    private String nombre;
    private String DNI;
    private char sexo;
    private int edad;
    private double peso;
    private double altura;
    private static final char SEXO_DEF = 'H';
    private final int PESO_BAJO = -1;
    private final int PESO_IDEAL = 0;
    private final int SOBREPESO = 1;

    public Persona(){
        this("Luis", SEXO_DEF, 20, 60, 70);
        generarDNI();
    }

    public Persona(String nombre, char sexo, int edad){
        this(nombre, sexo, edad, 60, 70);
        generarDNI();
    }

    public Persona(String nombre, char sexo, int edad, double peso, double altura){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDNI();
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        double IMC = 0;
        IMC = peso/(Math.pow(altura, 2));

        if(IMC<20){
            return PESO_BAJO;
        }
        else if(IMC<=25){
            return PESO_IDEAL;
        }
        else{
            return SOBREPESO;
        }
    }

    public void mostrarEstadoDePeso(){
        if(calcularIMC() == -1){
            System.out.println(nombre + ": Se encuentra bajo de peso");
        }
        else if(calcularIMC() == 0){
            System.out.println(nombre + ": Se encuentra en su peso ideal");
        }
        else{
            System.out.println(nombre + ": Tiene sobrepeso");
        }
    }

    public void mostrarEdad(){
        if(esMayorDeEdad()){
            System.out.println(nombre + " es mayor de edad");
        }
        else{
            System.out.println(nombre + " no es mayor de edad");
        }
    }

    public boolean esMayorDeEdad(){
        return(edad>=18);
    }

    public void comprobarSexo(){
        if(sexo != 'H' || sexo !='M'){
            sexo = SEXO_DEF;
        }
    }

    //
    public void generarDNI(){
        DNI = "";
        int numeroAtoZ = 0;
        char cifraDNI;
        for(int i = 0; i<4; i++){
            numeroAtoZ = (int)((Math.random() * (89 - 65)) + 65 );
            cifraDNI = (char)numeroAtoZ;
            DNI += cifraDNI;
        }
    }

    public String toString() {
        return  "\n****PERSONA****" +
                "\nNombre:" + nombre +
                "\nDNI: " + DNI +
                "\nSexo: " + sexo +
                "\nEdad: " + edad +
                "\nPeso: " + peso +
                "\nAltura: " + altura;
    }

}
