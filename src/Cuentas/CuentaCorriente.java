package Cuentas;

public class CuentaCorriente extends Cuenta{

    //constructor para el numero de la agencia y el nunmero de la cuenta que le pasa a la clase padre
    public  CuentaCorriente(int agencia,int numero){
        super(agencia,numero);
    }

    @Override
    public void depositar(double saldo){
        super.saldo+=saldo;
    }

    @Override
    public boolean retirar(double saldo){
        double comision = 0.2;
        return super.retirar(saldo+0.2);
    }
}
