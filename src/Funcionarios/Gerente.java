package Funcionarios;

import SistemAutenticable.Autenticable;

public class Gerente extends Funcionario implements Autenticable {

    private String clave;
    public boolean iniciarSesion(String clave){
        return clave=="AluraCursos";
    }
    public void setClave(String clave){
        this.clave = clave;
    }
    @Override
    public double getBonificacion(){
        return (super.getSalario() + this.getSalario()*0.5);
    }
}



