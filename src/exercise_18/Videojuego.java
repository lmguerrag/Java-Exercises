package exercise_18;

public class Videojuego implements Entregable{

    private String titulo;
    private int horasEstimadas;
    private boolean prestado;
    private String genero;
    private String compania;

    private static final int HORAS_DEF = 10;
    private static final boolean PRESTADO_DEF = false;
    private static final String TITULO_DEF = "Chrono Trigger";
    private static final String GENERO_DEF = "RPG";
    private static final String COMPANIA_DEF = "Square Enix";

    public Videojuego(){
        this(TITULO_DEF, HORAS_DEF, GENERO_DEF, COMPANIA_DEF);
    }

    public Videojuego(String titulo, int horasEstimadas){
        this(titulo, horasEstimadas, GENERO_DEF, COMPANIA_DEF);
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "{" + "Titulo: " + titulo +
                ", Horas estimadas: " + horasEstimadas +
                ", Genero: " + genero +
                ", Compañia: " + compania + '}';
    }

    @Override
    public void entregar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean isEntregado() {
        return prestado;
    }

    @Override
    public Object compareTo(Object[] objeto){
        Object mayor = new Videojuego();
        mayor = objeto[0];
        for(int i = 1; i<objeto.length; i++){
            if(objeto[i] instanceof Videojuego){
                if(((Videojuego) objeto[i]).horasEstimadas > ((Videojuego) mayor).horasEstimadas){
                    mayor = objeto[i];
                }
            }
        }
        return mayor;
    }
}
