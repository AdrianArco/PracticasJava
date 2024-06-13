
package PeluqueriaCanina.Logica;
//Esta clase es la encargada de controlar la logica y unirla con la persistencia.
import PeluqueriaCanina.Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    //Primero debemos crear un objeto de la clase controladora de persistencia. 
    ControladoraPersistencia control= new ControladoraPersistencia();
    //El metodo guardar de la clase grafica cargar datos. 
    public void guardar(String nombreMas, String raza, String color, String observaciones, String nombreDue, String movil, String alergico, String atencion) {
        //Como pretendemos separar la clase mascota y dueño es necesario crear objetos de ambas clases. 
        
        // hemos creado un obejto de tipo dueño 
        Duenio duenioo= new Duenio();
        //y se setea con los valores que le llegan a este metodo desde la interfaz grafica. 
        duenioo.setNombre(nombreDue);
        duenioo.setMovilDuenio(movil);
        //Ocurre lo mismo con la mascota
        Mascota masco= new Mascota();
        masco.setNombre(nombreMas);
        masco.setAlegico(alergico);
        masco.setAtencion_especial(atencion);
        masco.setColor(color);
        masco.setRaza(raza);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenioo);
        //Esto es lo importante . Cojemos el dueño creado y la mascota creada que ambas contienen 
        //un id creado automaticamente y se envian a la controladora de persistencia.
        control.guardar(duenioo,masco);
    }
        //Solicita a la controladora de persistencia las mascotas en una lista. 
    public List<Mascota> traerMascotas(){
        return control.traerMascotas();
    }
    
        //Solicita a la capa de persistencia que se borre una mascota seleccionada. 
    public void borrarMascota(int num_cliente) {
        control.borrarMascota(num_cliente);
    }
        //Se solicita que nos devuelva ala capa de persistencia que se traiga una mascota.
    public Mascota traerMascota(int num_cliente) {
        return control.traerMascota(num_cliente);
    }
        //Este metodo pertenece a modificarMascota METODO ALGO LIOSO
    public void modificarMasco(Mascota masco, String nombreMas, String raza, String color, String observaciones, String nombreDue, String movil, String alergico, String atencion) {
            //Primero seteo los valores pertenecientes a la mascota solo. 
        masco.setNombre(nombreMas);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlegico(alergico);
        masco.setAtencion_especial(atencion);
        //llamo al metodo modificar mascota de la controladora de persistentecia 
        //Para que edite estos valores haciendo uso de la ID de mascota contenida en este objeto masco.
        
        control.modificarMascota(masco);
        // Creamos un objeto dueno de la clase duenio y hacemos uso del metodo buscar dueño creado mas abajo para traernos los datos del dueño de la mascota a editar.
        // getDuenio()trae el entero de la id del mismo. 
        Duenio dueno= this.buscarDuenio(masco.getUnDuenio().getDuenio());
        //seteamos con los datos del metodo modificarMasco
        dueno.setNombre(nombreDue);
        dueno.setMovilDuenio(movil);
        //llamamos a la controladora de persistencia con el metodo modificar duenio para que modifique los datos del dueño en la tabla dueño. 
        control.modificarDuenio(dueno);
        
    }
        //Realizamos la peticion  a la controladora de persistencia para que nos duelva al dueño de la mascota pasandole
    //por parametro la id del dueño obtenida desde la mascota 
    private Duenio buscarDuenio(int duenio) {
        return control.traerDuenio(duenio);
    }

}
