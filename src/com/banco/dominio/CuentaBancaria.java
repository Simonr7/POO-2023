package com.banco.dominio;

public class CuentaBancaria {
    public int numero;
    public long saldo1;
    public long saldo2;
    public boolean activa;
    public Banco banco;
    public Persona propietario;

    public String Consultarsaldo(){
        String mensajeSaldo = "" + saldo1;
        return mensajeSaldo;

    }
    public void consignar(long SaldoAConsignar) {
        saldo1 += SaldoAConsignar;
    }
    public void retirar(long saldoAretirar) {
        saldo1 -= saldoAretirar;
    }
    public void transferir(long valorATransferir){
        saldo1 -= valorATransferir;

    }
}
