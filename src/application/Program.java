package application;

import boardGame.Posicao;

public class Program {
	
	public static void main(String[] args) {
		
		Posicao pos = new Posicao(5, 3);
		System.out.println(pos);
		pos.setValores(3, 5);
		System.out.println(pos);
	}

}
