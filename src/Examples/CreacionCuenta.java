package Examples;

import Cuentas.CuentaCorriente;
import Cuentas.CuentaDeAhorros;
import Cuentas.Cuenta;

public class CreacionCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc= new CuentaCorriente(1,1);
        CuentaDeAhorros ca = new CuentaDeAhorros(1,1);

        cc.depositar(2000);
        cc.transferir(1000,ca);

        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
    }
}
