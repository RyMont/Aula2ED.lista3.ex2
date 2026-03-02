package view;

import javax.swing.JOptionPane;
import controller.RecursaoController;

public class Principal {
	public static void main(String[] args) {
		int num1, num2;
		RecursaoController rc = new RecursaoController();
		
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 10 e 999999: "));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 10: "));
		} while (num1 < 10 || num1 > 999999 || num2 < 0 || num2 > 9);
		
		int quantidade = rc.vezesNum(num1, num2);
		System.out.print("O total de vezes que o número " +num2 +" apareceu no número " +num1 +" foi: " +quantidade);
	}
}
