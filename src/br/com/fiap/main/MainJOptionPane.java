package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.bean.FolhaPag;

public class MainJOptionPane {
    public static void main(String[] args) {
        FolhaPag fp = new FolhaPag();

        fp.salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o Bruto: "));
        fp.numeroDeDependentes = Integer.parseInt(JOptionPane.showInputDialog("Dependentes: "));

        double liquido = fp.calcularSalarioLiquido();

        String resultado = String.format("O salario liquido vai ser: R$ %.2f", liquido);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
