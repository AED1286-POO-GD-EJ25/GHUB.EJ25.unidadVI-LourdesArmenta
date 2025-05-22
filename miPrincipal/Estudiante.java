package miPrincipal;
import java.io.Serializable;

public class Estudiante implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String nombre;
    private int edad;
    private String correoElectronico;
    private transient String contrasena; // Este campo no será serializado

    public Estudiante(int id, String nombre, int edad, String correoElectronico, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    // Getters y setters
    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}




    
}
