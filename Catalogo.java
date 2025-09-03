/*
 * Nombre:Sanabria Ojeda Eduardo Adrian
 * Matricula:1190241
 * Practica #2
 */
import java.util.ArrayList;
public class Catalogo {
private ArrayList<Pelicula> peliculas;

public Catalogo(){
    peliculas = new ArrayList<>();
}
public void agregarPelicula(Pelicula pelicula){
    peliculas.add(pelicula);
}
public void getPeliculas() {
    if (peliculas.isEmpty()) {
            System.out.println("El catálogo está vacío.");
    } else {
        for (Pelicula i : peliculas) {
                System.out.println(i.getInformacion());
        }
    }
}
public void buscarPeliculaPorTitulo(String titulo){
    boolean peliculaEncontrada = false;

    for(Pelicula p : peliculas){
        if (p.getTitulo().equalsIgnoreCase(titulo)){
             System.out.println("Pelicula encontrada:");
            System.out.println(p.getInformacion());
            peliculaEncontrada = true;
            break;
        }

    }
    if(!peliculaEncontrada){
        System.out.println("No se encontro la pelicula");
    }
}
@Override
    public String toString() {
        if (peliculas.isEmpty()) {
            return "El catálogo está vacío.";
        }
        StringBuilder sb = new StringBuilder("Catálogo de Películas:\n");
        for (Pelicula p : peliculas) {
            sb.append(p.getInformacion()).append("\n");
        }
        return sb.toString();
    }

}
