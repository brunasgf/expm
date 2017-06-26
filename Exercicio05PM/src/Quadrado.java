import java.awt.*;

public class Quadrado extends Figura {

	public Quadrado(int px, int py, int l, Color c) {
		super(px,py,l,c);
	}

	public void desenha(Graphics g) {
		Color velhaCor = g.getColor();
		g.setColor(cor);
		g.drawRect(x, y, lado, lado);
		g.setColor(velhaCor);
	}
}