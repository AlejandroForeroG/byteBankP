package Cuentas;

public class CuentaDeAhorros extends  Cuenta{
    public CuentaDeAhorros(int agencia, int numero){
        super(agencia,numero);
    }

    @Override
    public void depositar(double saldo) {
       this.saldo=+saldo;
    }


}
