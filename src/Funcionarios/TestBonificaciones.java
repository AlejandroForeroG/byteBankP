package Funcionarios;

public class TestBonificaciones {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        Contador contador  = new Contador();
        Gerente gerente = new Gerente();

        funcionario.setSalario(2000);
        contador.setSalario(3000);
        gerente.setSalario(10000);

        //bonificaiones

        ControlBonificacion controlBonificacion = new ControlBonificacion();

        controlBonificacion.registrarBonificacion(funcionario);
        controlBonificacion.registrarBonificacion(contador);
        controlBonificacion.registrarBonificacion(gerente);


    }
}
