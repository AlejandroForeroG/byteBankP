package Funcionarios;

public class ControlBonificacion {
    private double suma;
    public double registrarBonificacion(Funcionario funcionario){
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Calculo actual: "+suma);
        return this.suma;
    }
}
