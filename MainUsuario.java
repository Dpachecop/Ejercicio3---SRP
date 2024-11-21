public class MainUsuario {
    public static void main(String[] args) {
        

        // EJEMPLO CON DATOS CORRECTOS
        Usuario usuario = new Usuario("Daniel", 345, "12345");
        Autenticacion autenticacion = new Autenticacion();
        autenticacion.Autenticar(usuario);
        Validacion validacion = new Validacion(autenticacion, usuario);
        validacion.validar();

        System.out.println("  ");
        
        //EJEMPLO CON DATOS INCORRECTOS
         usuario = new Usuario("Gabriela", 256, "12345");
         autenticacion = new Autenticacion();
        autenticacion.Autenticar(usuario);
         validacion = new Validacion(autenticacion, usuario);
        validacion.validar();
    
    }
}
