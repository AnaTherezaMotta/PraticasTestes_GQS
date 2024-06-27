package entidades;

public class ChamaServico {
	ICalculadora c;
	
	public int adicionarDoisNumeros(int x, int y) {
		return c.adicionar(x, y);
	}

	public ICalculadora getCalc() {
		return c;
	}

	public void setCalc(ICalculadora c) {
		this.c = c;
	}
}
