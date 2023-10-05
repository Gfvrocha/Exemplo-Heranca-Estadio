package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Jogador extends Pessoas {

    Scanner scanner = new Scanner(System.in);

    String posicao;
    int numeroCamisa;

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public void cadastrarJogador(){
        System.out.println("=0=0= ---- Cadastro --- =0=0=");
        System.out.println("Informe o nome: ");
        super.nome = scanner.nextLine();
        System.out.println("Informe a idade: ");
        super.idade = scanner.nextInt();
        System.out.println("Informe o CPF: ");
        super.cpf = scanner.nextLong();
        System.out.println("Informe o RG: ");
        super.rg = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Informe a posição: ");
        posicao = scanner.nextLine();
        System.out.println("Informe o número da camisa: ");
        numeroCamisa = scanner.nextInt();
        scanner.nextLine();



    }





}
