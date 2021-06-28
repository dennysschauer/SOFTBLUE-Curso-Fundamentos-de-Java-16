package classes_objetos.aula_4_2_classes_e_objetos;

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
