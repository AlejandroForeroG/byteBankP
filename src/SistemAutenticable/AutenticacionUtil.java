package SistemAutenticable;

public class AutenticacionUtil {
    String clave;

    public boolean inicarSesion(String clave){
        return this.clave == clave;
    }

    public void setClave(String clave){
        this.clave = clave;
    }
}
