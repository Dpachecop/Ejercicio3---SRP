public class Validacion {
    
    Autenticacion autenticacion;
    Usuario usuario;

    public Validacion(Autenticacion autenticacion, Usuario usuario){

        this.autenticacion = autenticacion;
        this.usuario = usuario;

    }


    public void validar(){

        if (autenticacion.Autenticar(usuario) == true) {
            System.out.println("Su autenticacion ha sido exitosa, enhorabuena " + usuario.getNombre() + "!");
        } else  System.out.println("Su autenticacion ha fallado, verfique bien su usuari, contraseña o ID e intentelo de nuevo!");


    }
}
