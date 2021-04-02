package exercise_18;

public class Main {

    public static void main(String args[]){

        int seriesEntregadas = 0;
        int videojuegosEntregados = 0;

        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        Serie serie1 = new Serie();
        Serie serie2 = new Serie("The 100", 5, "Ciencia ficcion", "Jason Rothenberg");
        Serie serie3 = new Serie("One Piece", 1, "Fantasia", "Eiichiro Oda");
        Serie serie4 = new Serie("Shingeki no Kyojin", 4, "Ciencia ficcion", "Hajime Isayama");
        Serie serie5 = new Serie("Game of Thrones", 8, "Fantasia", "Daniel Brett");

        Videojuego videojuego1 = new Videojuego();
        Videojuego videojuego2 = new Videojuego("Super Metroid 3", 15, "Accion-Aventura", "Nintendo");
        Videojuego videojuego3 = new Videojuego("Zelda Majora's Mask", 30, "Accion-Aventura", "Nintendo");
        Videojuego videojuego4 = new Videojuego("CTR", 24, "Carreras", " Naughty Dog");
        Videojuego videojuego5 = new Videojuego("Donkey kong Country", 20, "Aventura", " Nintendo");

        series[0] = serie1;
        series[1] = serie2;
        series[2] = serie3;
        series[3] = serie4;
        series[4] = serie5;

        videojuegos[0] = videojuego1;
        videojuegos[1] = videojuego2;
        videojuegos[2] = videojuego3;
        videojuegos[3] = videojuego4;
        videojuegos[4] = videojuego5;

        series[3].entregar();
        series[1].entregar();
        videojuegos[4].entregar();
        videojuegos[2].entregar();
        videojuegos[3].entregar();

        for(int i = 0; i<series.length; i++){
            if(series[i].isEntregado()){
                seriesEntregadas++;
            }
        }

        for(int i = 0; i<videojuegos.length; i++){
            if(videojuegos[i].isEntregado()){
                videojuegosEntregados++;
            }
        }

        System.out.println("SERIES ENTREGADAS: " + seriesEntregadas +
                            "\nVIDEOJUEGOS ENTREGADOS: " + videojuegosEntregados);


        System.out.println("VIDEOJUEGO CON MAYOR NUMERO DE HORAS: " + videojuego1.compareTo(videojuegos).toString());
        System.out.println("SERIE CON MAS TEMPORADAS: " + serie1.compareTo(series).toString());

    }

}
