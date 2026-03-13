package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;
import java.util.Scanner;

public class MainJOpttionPane {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        double slb, INSS, vps;
        int nd;
        String auxiliar;
        try {
            //Leitura da informações
            JOptionPane.showMessageDialog(null,"Sistema para calcular seu salário liquido");
            auxiliar = JOptionPane.showInputDialog("Digite o seu salário bruto: ");
            slb = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o desconto do INSS: ");
            INSS = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Insirá o valor do plano de saúde: ");
            vps = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Informe o seu número de dependentes: ");
            nd = Integer.parseInt(auxiliar);

            //Armazenando valores das variáveis nos respectivos atributos
            folha.salarioBruto = slb;
            folha.desontoINSS = INSS;
            folha.valorPlanoDeSaude = vps;
            folha.numeroDeDependentes = nd;

            //Exibindo informações e resultado
            String msg = String.format("Salário Bruto: R$ %.2f\nDependentes: %d\nINSS: %.1f\nPlano de saúde: %.2f\nSalário liquido: R$ %.2f", folha.salarioBruto, folha.numeroDeDependentes, folha.desontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
            JOptionPane.showMessageDialog(null, msg);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Informações inválidas");
        }
    }
}
 