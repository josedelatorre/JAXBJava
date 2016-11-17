package JAXB;
 
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
 
@XmlRootElement(name = "Libro")
//Si quieres definir el orden en que seran escritas las etiquetas
// Opcional
@XmlType(propOrder = {"autor", "nombre", "editorial", "isbn"}) 
public class Libro {
 
    private String nombre;
    private String autor;
    private String editorial;
    private String isbn;
 
    public String getNombre() {
        return nombre;
    }
 
    public String getAutor() {
        return autor;
    }
 
    public String getEditorial() {
        return editorial;
    }
 
    public String getIsbn() {
        return isbn;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void setAutor(String autor) {
        this.autor = autor;
    }
 
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
 
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
     
     
 
}