public class Usuario {
    //Declaracion de atributos
    private String nombre;
    private int edad;
    private String email;

    //Constructor
    public Usuario(String nombre, int edad, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }
    
    //GETTERS y SETTERS
    //Getter y setter para atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getter y setter para atributo edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Getter y setter para atributo email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
}
