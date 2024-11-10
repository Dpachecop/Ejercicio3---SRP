public class Autenticacion {



public boolean Autenticar(Usuario usuario){

 if ("Daniel" == usuario.getNombre() && "12345" == usuario.getContraseña() && 345 == usuario.getID() ) {
    return true;
} else return false;

}

}
