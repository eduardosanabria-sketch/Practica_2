public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        Pelicula pelicula1 = new Pelicula("Volver al futuro 2", "Robert Zemeckis", 1989, "Ciencia Ficcion", 108);
        Pelicula pelicula2 = new Pelicula("La la land", "Damien Chazelle", 2016, "Romance/Musical", 128);
        Pelicula pelicula3 = new Pelicula("Superman", "James Gunn", 2025, "Accion/Ciencia Ficcion", 129);
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);
        catalogo.agregarPelicula(pelicula3);
        catalogo.getPeliculas();
        catalogo.buscarPeliculaPorTitulo("La la land");
    }
}