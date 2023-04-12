package SistemAutenticable;

public interface Autenticable {

    public boolean iniciarSesion(String clave);
    public void setClave(String clave);

}
