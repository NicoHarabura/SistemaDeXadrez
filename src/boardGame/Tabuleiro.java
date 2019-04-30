package boardgame;

public class Tabuleiro {

	private int linhas;
	private int colunas;

	protected Peca[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];

		// Vetor chamado pecas do tipo Peca, e na construção recebe um novo
		// vetor com o tamanho informado nas linhas e colunas
	}

}
