package exercise_16;

import java.util.Locale;
import java.util.Scanner;

public class AdminPersona {

    public static void main(String args[]){
        String informacion;
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = entrada.nextInt();

        System.out.print("Ingrese sexo: ");
        String sexoStr = entrada.next();
        char sexoCh = sexoStr.charAt(0);

        System.out.print("Ingrese peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Ingrese altura: ");
        double altura = entrada.nextDouble();

        Persona persona1 = new Persona(nombre, sexoCh, edad, peso, altura);
        Persona persona2 = new Persona(nombre, sexoCh, edad);
        Persona persona3 = new Persona();

        persona3.setNombre("Luis");
        persona3.setEdad(26);
        persona3.setSexo('M');
        persona3.setPeso(70);
        persona3.setAltura(1.83);

        persona1.mostrarEstadoDePeso();
        persona2.mostrarEstadoDePeso();
        persona3.mostrarEstadoDePeso();

        persona1.mostrarEdad();
        persona2.mostrarEdad();
        persona3.mostrarEdad();

        informacion = persona1.toString();
        System.out.println(informacion);

        informacion = persona2.toString();
        System.out.println(informacion);

        informacion = persona3.toString();
        System.out.println(informacion);
    }

}
