package SistemAutenticable;

public class SistemaInterno {
    boolean puedeIniciarSesion;
    private String clave = "AluraCursos";

    public boolean autentica(Autenticable Autenticar){
        puedeIniciarSesion = Autenticar.iniciarSesion(clave);
        if(puedeIniciarSesion){
            System.out.println("Ingreso exitoso");
            return true;
        }else{
            System.out.println("Error login");
            return false;
        }

    }
}
