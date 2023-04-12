package Funcionarios;

import SistemAutenticable.Autenticable;
import SistemAutenticable.AutenticacionUtil;

public class Cliente implements Autenticable{

    private String nombre;
    private String documento;
    private String telefono;
    private AutenticacionUtil autenticacionUtil;

    //constructor
    public Cliente(){
        this.autenticacionUtil=new AutenticacionUtil();
    }
    @Override
    public boolean iniciarSesion(String clave) {
        return this.autenticacionUtil.inicarSesion(clave);
    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);
    }

//getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
