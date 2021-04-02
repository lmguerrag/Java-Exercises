package exercise_18;

public class Serie implements Entregable{

    private String titulo;
    private int numeroDeTemporadas;
    private boolean prestado;
    private String genero;
    private String creador;

    private static final int TEMPORADAS_DEF = 3;
    private static final boolean PRESTADO_DEF = false;
    private static final String TITULO_DEF = "Titulo por defecto";
    private static final String GENERO_DEF = "Ciencia ficcion";
    private static final String CREADOR_DEF = "Luis";

    public Serie(){
        this(TITULO_DEF, TEMPORADAS_DEF, GENERO_DEF, CREADOR_DEF);
    }

    public Serie(String titulo, String creador){
        this(titulo, TEMPORADAS_DEF, GENERO_DEF, creador);
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador){
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "{" + "Titulo: " + titulo +
                ", Numero de temporadas: " + numeroDeTemporadas +
                ", Genero: " + genero +
                ", Creador: " + creador + '}';
    }

    @Override
    public void entregar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = true;
    }

    @Override
    public boolean isEntregado() {
        return prestado;
    }

    @Override
    public Object compareTo(Object[] objeto) {
        Object serieConMasTemporadas = new Serie();
        serieConMasTemporadas = objeto[0];
        for(int i = 1; i<objeto.length; i++){
            if(objeto[i] instanceof Serie){
                if(((Serie) objeto[i]).numeroDeTemporadas > ((Serie) serieConMasTemporadas).numeroDeTemporadas){
                    serieConMasTemporadas = objeto[i];
                }
            }
        }
        return serieConMasTemporadas;
    }
}
