package com.magalu;

public class Conta {
    private int numero;
    private String dono;
    private double saldo;

    public Conta() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -=  valor;
            return true;
        }
        return false;
    }

    public void transferir(double valor){
        this.saldo +=  valor;
    }

    public void verInformacoes(){
        System.out.println("              INFORMAÇÕES DA CONTA              ");
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("--------------------------------------------------");
    }
}
