package exercise_17;

public class AdminElectrodomestico {

    public static void main(String args[]){

        int totalPrecios = 0;
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        Electrodomestico television = new Television(120, "verde", 'b', 20, 50, true);
        Electrodomestico television1 = new Television(300, "azul", 'A', 10, 23, false);
        Electrodomestico television2 = new Television(220, "blanco", 'c', 35, 30, false);
        Electrodomestico television3 = new Television(150, "negro", 'F', 50, 60, true);
        Electrodomestico electrodomestico = new Electrodomestico(330, "gris", 'A', 80);
        Electrodomestico lavadora = new Lavadora(720, "amarillo", 'b', 20, 48);
        Electrodomestico lavadora1 = new Lavadora(500, "rosa", 'h', 60, 42);
        Electrodomestico lavadora2 = new Lavadora(610, "ocre", 'D', 70, 55);
        Electrodomestico lavadora3 = new Lavadora(360, "negro", 'a', 55, 60);
        Electrodomestico electrodomestico1 = new Electrodomestico(180, "azul", 'e', 67);

        electrodomesticos[0] = television;
        electrodomesticos[1] = lavadora;
        electrodomesticos[2] = television1;
        electrodomesticos[3] = television2;
        electrodomesticos[4] = lavadora1;
        electrodomesticos[5] = lavadora2;
        electrodomesticos[6] = television3;
        electrodomesticos[7] = lavadora3;
        electrodomesticos[8] = electrodomestico;
        electrodomesticos[9] = electrodomestico1;

        for(int i = 0; i<electrodomesticos.length; i++){
            electrodomesticos[i].precioFinal();
        }

        System.out.println("\n*********************************************LISTA DE TELEVISORES**************************************");
        for(int i = 0; i<electrodomesticos.length; i++){
            if(electrodomesticos[i] instanceof Television){
                System.out.println(electrodomesticos[i].caracteristicas() +
                        " | Precio Final: " + electrodomesticos[i].getPrecioFinal());
            }
        }

        System.out.println("\n***************************************LISTA DE LAVADORAS************************************");
        for(int i = 0; i<electrodomesticos.length; i++){
            if(electrodomesticos[i] instanceof Lavadora){
                System.out.println(electrodomesticos[i].caracteristicas() +
                        " | Precio Final: " + electrodomesticos[i].getPrecioFinal());
            }
        }

        for(int i = 0; i<electrodomesticos.length; i++){
            totalPrecios += electrodomesticos[i].getPrecioFinal();
        }

        System.out.print("\nSUMA DE PRECIOS: " + totalPrecios);
    }
}
