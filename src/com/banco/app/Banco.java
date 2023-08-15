package com.banco.app;
import com.banco.dominio.CuentaBancaria;

public class Banco {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria();
       String saldo1 = miCuenta.Consultarsaldo();
        System.out.println("tu saldo es: " + saldo1);

        miCuenta.consignar(100000);
        String saldo2 = miCuenta.Consultarsaldo();
        System.out.println("tu saldo era: " + saldo1 + ", tu nuevo saldo con la consignación realizada es: " + saldo2);

        miCuenta.retirar(30000);
        String saldoRetirado = miCuenta.Consultarsaldo();
        System.out.println("tu saldo era: " + saldo2 + ", tu nuevo saldo con el retiro realizado es: " + saldoRetirado);

        miCuenta.transferir(70000);
        String valorATransferir = miCuenta.Consultarsaldo();
        System.out.println("tu saldo era: " + saldoRetirado + ", tu nuevo saldo con la transferencia realizada es: " + valorATransferir);

    }
}
