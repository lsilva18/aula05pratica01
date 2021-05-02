package com.magalu;

public class Main {

    public static void main(String[] args) {
        boolean podeSacar;
        double valorSaque;

        //criando clientes
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        //criando coontas
        Conta conta1  =  new Conta();
        Conta conta2  =  new Conta();
        Conta conta3  =  new Conta();



        //----------------------------CLIENTE 1 -------------------------------------------------
        // Setando valores do cliente
        p1.setNome("Nome_p1");
        p1.setEndereco("Rua 1, Cidade 1, Estado 1");
        p1.setCpf("111.111.111.-11");
        p1.adicionarConta(conta1);

        // Setando valores da conta do cliente
        p1.getConta().setNumero(1);
        p1.getConta().setDono(p1.getNome());
        p1.getConta().setSaldo(100);

        //realizando um saque
        valorSaque = 150;
        podeSacar = p1.getConta().sacar(valorSaque);
        if(podeSacar){
            System.out.println(">>>>>>> Saque de "  + valorSaque + " realizado com sucesso");
        }else{
            System.out.println(">>>>>>> Você não pode realizar este saque de R$ " + valorSaque);
        }

        //imprimindo informacoes
        p1.verInformacoes();
        p1.getConta().verInformacoes();


        //----------------------------CLIENTE 2 -------------------------------------------------
        // Setando valores do cliente
        p2.setNome("Nome_p2");
        p2.setEndereco("Rua 2, Cidade 2, Estado 2");
        p2.setCpf("222.222.222.-22");
        p2.adicionarConta(conta2);

        // Setando valores da conta do cliente
        p2.getConta().setNumero(2);
        p2.getConta().setDono(p2.getNome());
        p2.getConta().setSaldo(0);

        //realizando um saque
        valorSaque = 50;
        podeSacar = p2.getConta().sacar(valorSaque);
        if(podeSacar){
            System.out.println(">>>>>>> Saque de "  + valorSaque + " realizado com sucesso");
        }else{
            System.out.println(">>>>>>> Você não pode realizar este saque de R$ " + valorSaque);
        }

        //imprimindo informacoes
        p2.verInformacoes();
        p2.getConta().verInformacoes();


        //----------------------------CLIENTE 3 -------------------------------------------------
        // Setando valores do cliente
        p3.setNome("Nome_p3");
        p3.setEndereco("Rua 3, Cidade 3, Estado 3");
        p3.setCpf("333.333.333.-33");
        p3.adicionarConta(conta3);

        // Setando valores da conta do cliente
        p3.getConta().setNumero(3);
        p3.getConta().setDono(p3.getNome());
        p3.getConta().setSaldo(100);

        //realizando um saque
        valorSaque = 30;
        podeSacar = p3.getConta().sacar(valorSaque);
        if(podeSacar){
            System.out.println(">>>>>>> Saque de "  + valorSaque + " realizado com sucesso");
            p1.getConta().transferir(valorSaque);
        }else{
            System.out.println(">>>>>>> Você não pode realizar este saque de R$ " + valorSaque);
        }

        //imprimindo informacoes
        p3.verInformacoes();
        p3.getConta().verInformacoes();

        System.out.println("##################################################");
        System.out.println("##########SITUACAO FINAL DAS TRÊS CONTAS##########");
        System.out.println("##################################################");
        //imprimindo informacoes
        p1.verInformacoes();
        p1.getConta().verInformacoes();
        p2.verInformacoes();
        p2.getConta().verInformacoes();
        p3.verInformacoes();
        p3.getConta().verInformacoes();

    }
}
