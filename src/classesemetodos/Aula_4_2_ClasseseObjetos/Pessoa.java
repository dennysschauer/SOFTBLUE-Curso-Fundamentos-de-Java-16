package classesemetodos.Aula_4_2_ClasseseObjetos;

public class Pessoa {
	String nome;
	int numFigurinha;
	
	void receber (int numFigurinha) {
		this.numFigurinha += numFigurinha;
	}
	
	void dar (int numFigurinha, Pessoa p) {
		this.numFigurinha -= numFigurinha;
		p.receber(numFigurinha);
	}
}
