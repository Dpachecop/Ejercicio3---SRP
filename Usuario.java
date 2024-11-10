public class Usuario   {

    private int ID;
    private String nombre;
    private String contraseña;

public Usuario(String nombre, int ID, String contraseña){

    this.nombre = nombre;
    this.ID = ID;
    this.contraseña = contraseña;

}
public String getNombre() {
    return nombre;
}

public int getID() {
    return ID;
}

public String getContraseña() {
    return contraseña;
}

}