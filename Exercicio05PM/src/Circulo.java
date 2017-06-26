import java.awt.*;

public class Circulo extends Figura {

	public Circulo(int px, int py, int l, Color c) {
		super(px,py,l,c);
	}

	public void desenha(Graphics g) {
		Color velhaCor = g.getColor();
		g.setColor(cor);
		g.drawOval(x, y, lado, lado);
		g.setColor(velhaCor);
	}
}