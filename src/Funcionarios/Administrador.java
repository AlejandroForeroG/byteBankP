package Funcionarios;

import SistemAutenticable.Autenticable;
import SistemAutenticable.AutenticacionUtil;

public class Administrador extends Funcionario implements Autenticable {

    private AutenticacionUtil autenticacionUtil;

    public Administrador(){
        this.autenticacionUtil= new AutenticacionUtil();
    }

    @Override
    public double getBonificacion(){return this.getSalario();}

    @Override
    public boolean iniciarSesion(String clave){
        return this.autenticacionUtil.inicarSesion(clave);
    }

    @Override
    public void setClave(String clave) {
        this.autenticacionUtil.setClave(clave);
    }
}
