package main;

import controle.AgendaPessoaFisica;
import controle.AgendaPessoaJuridica;
import visao.Agenda;
import visao.UI;

public class Main {

	public static void main(String[] args) {
		int op = 0;
		Agenda agendaPF = new AgendaPessoaFisica();
		Agenda agendaPJ = new AgendaPessoaJuridica();

		do {
			op = UI.opcoes();
			switch(op) {
			  case 1:
				  agendaPF.iniciar();
				  break;
			  case 2:
				  agendaPJ.iniciar();
				  break;
			  case 3:
				  break;
			default:
				System.out.println("Digite um numero valido");
				break;
			}
		}while(op != 3);
	}
}
