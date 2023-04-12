package Examples;

import Funcionarios.Contador;
import Funcionarios.ControlBonificacion;
import Funcionarios.Funcionario;
import Funcionarios.Gerente;

public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        Gerente gerente = new Gerente();
        Contador contador  = new Contador();


        funcionario.setSalario(2000);
        gerente.setSalario(10000);
        contador.setSalario(10000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();

        //control de bonificaciones
        controlBonificacion.registrarBonificacion(funcionario);
        controlBonificacion.registrarBonificacion(gerente);
        controlBonificacion.registrarBonificacion(contador);

    }
}
