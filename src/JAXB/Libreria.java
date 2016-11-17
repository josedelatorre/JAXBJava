package JAXB;
 
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
 
//Esto significa que la clases "Libreria.java" es el elemento raiz
@XmlRootElement(namespace = "prueba.xml")
public class Libreria {
 
    //Wrapper
    @XmlElementWrapper(name = "ListaLibro")
    @XmlElement(name = "Libro")
    private ArrayList<Libro> ListaLibro;
    private String nombre;
    private String lugar;
 
    public ArrayList<Libro> getListaLibro() {
        return ListaLibro;
    }
 
    public void setListaLibro(ArrayList<Libro> ListaLibro) {
        this.ListaLibro = ListaLibro;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public String getLugar() {
        return lugar;
    }
     
     
 
}