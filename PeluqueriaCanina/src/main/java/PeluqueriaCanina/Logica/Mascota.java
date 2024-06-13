package PeluqueriaCanina.Logica;
//Esta clase pertenece a las mascotas y podemos ver para que sirve cada anotacion en la clase de duenio. 
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int numCliente;
    
    private String nombre;
    private String raza;
    private String color;
    private String alegico;
    private String atencion_especial;
    private String observaciones;
    @OneToOne
    private Duenio unDuenio;

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlegico() {
        return alegico;
    }

    public void setAlegico(String alegico) {
        this.alegico = alegico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }

    public Mascota(int numCliente, String nombre, String raza, String color, String alegico, String atencion_especial, String observaciones, Duenio unDuenio) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alegico = alegico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public Mascota() {
    }
}
