/*
 * Nombre:Sanabria Ojeda Eduardo Adrian
 * Matricula:1190241
 * Practica #2
 */
import java.time.Year;
public class Pelicula {
private String titulo;
private String director;
private int añoEstreno;
private String genero;
private int duracion;

public Pelicula(String titulo,String director,int añoEstreno,String genero,int duracion){
    this.titulo=titulo;
    this.director=director;
    this.añoEstreno=añoEstreno;
    this.genero=genero;
    this.duracion=duracion;
}

public String toString(){
    return "Titulo:"+titulo+" Director:"+director+" Año de estreno:"+añoEstreno+" Genero:"+genero+" Duracion:"+duracion;
}

public String getInformacion(){
    return "Titulo:"+titulo+" Director:"+director+" Año de estreno:"+añoEstreno+" Genero:"+genero+" Duracion:"+duracion;
}

public boolean esClasica(){
    int añoActual = Year.now().getValue();
    return (añoActual - añoEstreno) > 25 ;
}
//seters
public String getTitulo(){
    return titulo;
}
public String getDirector(){
    return director;
}
public int getAñoDeEstreno(){
    return añoEstreno;
}
public String getGenero(){
    return genero;
}
public int getDuracion(){
    return duracion;
}
//geters
public void setTitulo(String titulo){
this.titulo = titulo;
}
public void setDirector(String director){
this.director = director;
}
public void setAñoEstreno(int añoEstreno){
this.añoEstreno = añoEstreno;
}
public void setGenero(String genero){
this.genero = genero;
}
public void setDuracion(int duracion){
this.duracion = duracion;
}


}
