package exercises;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Metodos {

    Scanner entrada = new Scanner(System.in);
    final double PI = 3.14;
    final double IVA = 0.21;

    //Exercise 1 y 2
    public void biggerNumber(){
        System.out.print("Ingrese primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese segundo numero: ");
        int num2 = entrada.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        }
        else if(num1 == num2){
            System.out.println(num1 + " es igual a " + num2);
        }
        else{
            System.out.println(num2 + " es mayor que " + num1);
        }
    }

    //Exercise 3
    public void circleArea(){
        double area = 0;
        System.out.print("Ingrese el radio del circulo: ");
        double radio = entrada.nextDouble();

        area = PI*Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }

    //Exercise 4
    public void priceWithIVAIncluded(){
        System.out.print("Ingrese el precio del producto: ");
        double precio = entrada.nextDouble();

        precio += precio*IVA;
        System.out.println("El valor del producto con IVA incluido es de: " + precio);
    }

    //Exercise 5
    public void oddAndEvenNumbersWhile(){
        int i = 1;
        while(i <= 100){
            if(i%2 == 0){
                System.out.println(i + " es un numero par");
                i++;
            }
            else{
                System.out.println(i + " es un numero impar");
                i++;
            }
        }
    }

    //Exercise 6
    public void oddAndEvenNumbersFor(){
        for(int i = 1; i<=100; i++){
            if(i%2 == 0){
                System.out.println(i + " es un numero par");
            }
            else{
                System.out.println(i + " es un numero impar");
            }
        }
    }

    //Exercise 7
    public void numberGreaterThanOrEqualToZero(){
        double num = 0;
        System.out.print("Ingrese numero mayor o igual a cero: ");
        do {
            num = entrada.nextDouble();
            if(num < 0){
                System.out.print("El numero ingresado es incorrecto, ingrese nuevamente: ");
            }
        }while(num<0);
    }

    //Exercise 8
    public void dayOfTheWeek(){

        System.out.print("Ingrese que dia de la semana es " +
                "(tenga en cuenta que la semana inicia el domingo, siendo este el dia 1): ");
        int day = entrada.nextInt();
        switch (day){
            case 1: System.out.println("Domingo: Dia libre"); break;
            case 2: System.out.println("Lunes: Dia laboral"); break;
            case 3: System.out.println("Martes: Dia laboral"); break;
            case 4: System.out.println("Miercoles: Dia laboral"); break;
            case 5: System.out.println("Jueves: Dia laboral"); break;
            case 6: System.out.println("Viernes: Dia laboral"); break;
            case 7: System.out.println("Sabado: Dia libre"); break;
            default: System.out.println("El numero ingresado es incorrecto"); break;
        }
    }

    //Exercise 9
    public void editPhrase(){
        String phrase = "La sonrisa sera la mejor arma contra la tristeza.";

        phrase = phrase.replace('a', 'e');

        System.out.print("Ingrese la frase que desea incluir: ");
        String newPhrase = entrada.nextLine();

        phrase += " " + newPhrase;
        System.out.print("La frase resultante es: " + phrase);
    }

    //Exercise 10
    public void removeSpaces(){
        System.out.print("Ingrese una frase: ");
        String phrase = entrada.nextLine();

        phrase = phrase.replace(" ", "");
        System.out.println("La frase ingresada removiendo los espacios es: " + phrase);
    }

    //Exercise 11
    public void countVowels(){
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        System.out.println("Ingrese una frase: ");
        String phrase = entrada.nextLine();

        for (int j = 0; j<phrase.length(); j++){
            if(phrase.charAt(j) == 'a'){
                a++;
            }
            else if(phrase.charAt(j) == 'e'){
                e++;
            }
            else if(phrase.charAt(j) == 'i'){
                i++;
            }
            else if(phrase.charAt(j) == 'o'){
                o++;
            }
            else if(phrase.charAt(j) == 'u'){
                u++;
            }
        }
        System.out.println("Numero de vocales 'a': " + a
                        +"\nNumero de vocales 'e': " + e
                        +"\nNumero de vocales 'i': " + i
                        +"\nNumero de vocales 'o': " + o
                        +"\nNumero de vocales 'u': " + u);
    }

    /*Exercise 12: Se establece la diferencia teniendo en cuenta la misma posicion en cada palabra,
    si las letras son diferentes en la misma posicion, se anotara la letra diferente de la segunda palabra
    respecto a la primera.
    * */
    public void compareWords(){
        String difference = "";
        System.out.print("Ingresa la primera palabra: ");
        String firstWord = entrada.nextLine();

        System.out.print("Ingresa la segunda palabra: ");
        String secondWord = entrada.nextLine();

        if(firstWord.equalsIgnoreCase(secondWord)){
            System.out.println("Las palabras son iguales");
        }
        else{
           difference = differences(firstWord, secondWord);
        }
        System.out.println("La diferencia es: " + difference);
    }

    public String differences(String firstWord, String secondWord){
        String difference = "";
        for(int i = 0; i < firstWord.length() || i < secondWord.length(); i++){
            if(i < firstWord.length() && i < secondWord.length()){
                if(firstWord.charAt(i) != secondWord.charAt(i)){
                    difference += secondWord.charAt(i);
                }
            }
            else if(i < firstWord.length()){
                break;
            }
            else{
                while(i < secondWord.length()){
                    difference += secondWord.charAt(i);
                    i++;
                }
            }
        }
        return difference;
    }

    //Exercise 13
    public void checkDateAndHour(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date));
    }

    //Exercise 14
    public void countToOneThousand(){
        int num = 0;
        System.out.println("Ingrese un numero menor a 999: ");
        do {
            num = entrada.nextInt();
            if(num<0 && num>999){
                System.out.print("El numero ingresado es incorrecto, ingrese nuevamente: ");
            }
        }while(num<0 && num>999);

        while (num < 999){
            System.out.println(num += 2);
        }
    }

    //Exercise 15
    public void cinematographyMenu(){
        int opcionMenu = 0;



        do {
            System.out.println("*********** GESTION CINEMATOGRÁFICA ***********\n"
                                +"1-NUEVO ACTOR\n"
                                +"2-BUSCAR ACTOR\n"
                                +"3-ELIMINAR ACTOR\n"
                                +"4-MODIFICAR ACTOR\n"
                                +"5-VER TODOS LOS ACTORES\n"
                                +"6-VER PELICULAS DE LOS ACTORES\n"
                                +"7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n"
                                +"8-SALIR\n");

            opcionMenu = entrada.nextInt();

            if(opcionMenu<1 || opcionMenu>8){
                System.err.println("OPCION INCORRECTA");
            }

        }while(opcionMenu!=8);
    }

}
