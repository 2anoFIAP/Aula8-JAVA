package br.com.fiap.main;

import java.util.Scanner;
import br.com.fiap.bean.FolhaPag;

public class MainScanner {
    public static void main(String[] args) {
        Scanner leitor;
        FolhaPag fp = new FolhaPag();
        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;
        try{
            leitor = new Scanner(System.in)

            System.out.print("Digite o salario bruto: ");
            fp.salarioBruto = leitor.nextDouble();

            System.out.print("Numero de dependentes: ");
            fp.numeroDeDependentes = leitor.nextInt();

            System.out.println("Digite desconto INSS");
            fp.descontoINSS = leitor.nextDouble();

            Syste.out.println("Digte o valor do plano de saude: ")
            fp.valorPlanoDeSaude = leitor.nextDouble();

            FolhaPag.salarioBruto = salarioBruto;
            FolhaPag.numeroDeDependentes = numeroDeDependentes;
            FolhaPag.descontoINSS = descontoINSS;
            FolhaPag.valorPlanoDeSaude = valorPlanoDeSaude;

            double liquido = fp.calcularSalarioLiquido();
            System.out.printf("Salario Liquido: R$ %.2f %n", liquido);

        } catch (Exception Exception) {
            System.out.println("Formato incorreto!")
        }

        

        

        

        leitor.close();
    }
}
