package Examples;

import Funcionarios.Administrador;
import Funcionarios.Gerente;
import SistemAutenticable.SistemaInterno;

public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente = new Gerente();
        Administrador admin = new Administrador();

        gerente.setClave("AluraCursos");
        sistema.autentica(gerente);
        sistema.autentica(admin);
    }
}
