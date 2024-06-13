package PeluqueriaCanina.Persistencia;
// ESta controladora es para la capa de persistecia.
//Debemos crearla nosotros 
import PeluqueriaCanina.Logica.Duenio;
import PeluqueriaCanina.Logica.Mascota;
import PeluqueriaCanina.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//Creamos los objetos de cada controlador de jpa uno por clase de controlador 
public class ControladoraPersistencia {
    DuenioJpaController dueñojpa= new DuenioJpaController();
    MascotaJpaController mascotajpa = new MascotaJpaController();
    //Estos objetos creados contienen metodos para comunicarse con la base de datos y son por ejemplo create, destroy, edit.. 
    
    //en este caso como vamos a dar un alta de mascota y dueño le pasamos a cada controlados los datos que deben incorporar en la tabla.
    //Es  importante poner primero dueño puesto que si no exite, mascota nos arrojaria un error al no tener el id del dueño asignado. 
    public void guardar(Duenio duenioo, Mascota masco) {
        dueñojpa.create(duenioo);
        mascotajpa.create(masco);
    }
        //A traves del metodo findMascotaEntities se permite crear una lista con todos los datos que contengan la tabla. 
    public List<Mascota> traerMascotas() {
        return mascotajpa.findMascotaEntities();
    }
        //para borrar y es necesario contenerlo en un try-catch
    public void borrarMascota(int num_cliente) {
        try {
            mascotajpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        //nos permite conseguir los datos de la mascota conociendo su id
    public Mascota traerMascota(int num_cliente) {
        return mascotajpa.findMascota(num_cliente);
    }
        //nos permite conseguir los datos de la dueño conociendo su id

    public Duenio traerDuenio(int duenio) {
        return dueñojpa.findDuenio(duenio);
    }
        //Nos permite modificar los datos del dueño con los contenidos pero no su id
    public void modificarDuenio(Duenio dueno) {
        try {
            dueñojpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        //Permite modificar la mascota pero no su id
    public void modificarMascota(Mascota masco) {
        try {
            mascotajpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
