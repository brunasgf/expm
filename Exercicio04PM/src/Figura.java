import java.awt.*;


public abstract class Figura {
	protected int x, y, lado;
	protected Color cor;
	
	public Figura(int px, int py, int l, Color c) throws ExcecaoPosicaoInvalida{
		
		x = px;
		y = py;
		lado = l;
		cor = c;
	}

	public void setCor(Color c) {
		cor = c;
	}
	
	public boolean isNegative (int a ) throws ExcecaoPosicaoInvalida{ 
		if (a < 0){
			throw new ExcecaoPosicaoInvalida(); 
		}
		else 
			return false;
	}
	
	public abstract void desenha(Graphics g);
	
}
