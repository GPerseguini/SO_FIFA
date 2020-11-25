package view;

import java.io.IOException;


import controller.FifaController;
import controller.IFifaController;

public class Principal {

	public static void main(String[] args) {
		IFifaController fifa = new FifaController();
		String caminho = "/Users/gabrielperseguini/Desktop/Temp";
		String nome = "data.csv";
		try {
			fifa.desempilhaBonsBrasileiros(fifa.empilhaBrasileiros(caminho,nome));
			fifa.buscaListaBonsJovens(fifa.listaRevelacoes(caminho, nome));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
