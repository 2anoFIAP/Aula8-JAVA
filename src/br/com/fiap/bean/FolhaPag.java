package br.com.fiap.bean;

public class FolhaPag {
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;

    public double calcularSalarioLiquido(){
        descontoINSS = salarioBruto * 0.10;

        valorPlanoDeSaude = numeroDeDependentes * 100;

        double salarioLiquido = salarioBruto - descontoINSS - valorPlanoDeSaude;

        return salarioLiquido;
    }
}

