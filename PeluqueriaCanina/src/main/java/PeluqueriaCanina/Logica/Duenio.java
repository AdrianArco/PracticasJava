package PeluqueriaCanina.Logica;
//Clase para los dueños de las mascotas 
//Explico como se realiza la anotacion para la capa de persistencia. 
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//Siempre a las clases que queramos convertir en tablas se deben denominar entity
@Entity
public class Duenio implements Serializable {
    //clave primaria se le pone ID
    @Id
    //Esto nos permite crear automaticamente el ID hay mas formas ademas de sequence
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int duenio;
    private String nombre;
    private String movilDuenio;
    
    
        //por lo demas creamos los constructores inclusive el vacio, getter y setters.
    public Duenio(int duenio, String nombre, String celDuenio) {
        this.duenio = duenio;
        this.nombre = nombre;
        this.movilDuenio = celDuenio;
    }

    public int getDuenio() {
        return duenio;
    }

    public void setDuenio(int duenio) {
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMovilDuenio() {
        return movilDuenio;
    }

    public void setMovilDuenio(String movilDuenio) {
        this.movilDuenio = movilDuenio;
    }

    public Duenio() {
    }
}
