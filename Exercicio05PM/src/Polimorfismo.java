import java.applet.Applet;
import java.awt.*;

public class Polimorfismo extends Applet {
	ListaDeFiguras lf;

	public void init() {
		lf = new ListaDeFiguras(5);
		lf.insere(new Quadrado(0, 0, 30, Color.CYAN));
		lf.insere(new Quadrado(100, 100, 80, new Color(255,30,120)));
		lf.insere(new Circulo(20, 40, 34, Color.GREEN));
		
	}

	public void paint(Graphics g) {
		if (lf.getCont() == 5) {
			lf.remove();
			lf.remove();
			lf.remove();
		}
		Circulo c = new Circulo(
				(int) Math.round((Math.random()*150)),
				(int) Math.round((Math.random()*150)), 20,
				new Color((int) Math.round((Math.random()*254)),(int) Math.round((Math.random()*254)),(int) Math.round((Math.random()*254)))
		);
		lf.insere(c);
		lf.desenha(g);
	}
}
