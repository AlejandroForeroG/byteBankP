package Cuentas;

import Funcionarios.Cliente;

public  abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;

    private Cliente titular;
    private static int total;


    //Constructor
    public Cuenta(int agencia,int numero){
        if(agencia <=0 && numero <= 0){
            System.out.println("No se permite valores de 0");
            this.agencia=1;
            this.numero=1;
        }else{
            this.agencia=agencia;
            this.numero=numero;
        }
        total++;
        System.out.println("Cuenta Creada numero:" + total);
    }

//metodos
    public abstract void depositar(double saldo);

    public boolean retirar(double saldo){
        if (saldo<=this.saldo){
            this.saldo-=saldo;
            return false;
        }
        return false;
    }

    public boolean transferir(double valor, Cuenta cuenta){
        if(this.saldo >=valor) {
            this.retirar(valor);
            cuenta.depositar(valor);
        }
        return true;
    }


    //getters and settesrs
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia>0){
            this.agencia = agencia;
        }
        System.out.println("No se pueden poner Negativos");

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Cuenta.total = total;
    }

    public Cliente getTitular(){return this.titular;}

    public void  seTitular(Cliente titular){this.titular = titular; }
}
