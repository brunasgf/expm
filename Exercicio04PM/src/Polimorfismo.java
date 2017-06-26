import java.applet.Applet;
import java.awt.*;

public class Polimorfismo extends Applet {
	ListaDeFiguras lf;

	public void init() {
		lf = new ListaDeFiguras(5);
		try {
			lf.insere(new Quadrado(0, 0, 30, Color.CYAN));
		} catch (ExcecaoListaCheia e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExcecaoPosicaoInvalida e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lf.insere(new Quadrado(100, 100, 80, new Color(255,30,120)));
		} catch (ExcecaoListaCheia e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExcecaoPosicaoInvalida e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lf.insere(new Circulo(20, 40, 34, Color.GREEN));
		} catch (ExcecaoListaCheia e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExcecaoPosicaoInvalida e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void paint(Graphics g){
		if (lf.getCont() == 5) {
			lf.remove();
			lf.remove();
			lf.remove();
		}
		
		try {
			Circulo c;
			c = new Circulo(
					(int) Math.round((Math.random()*150)),
					(int) Math.round((Math.random()*150)), 20,
					new Color((int) Math.round((Math.random()*254)),(int) Math.round((Math.random()*254)),(int) Math.round((Math.random()*254)))
			);
			lf.insere(c);
		} catch (ExcecaoPosicaoInvalida | ExcecaoListaCheia e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lf.desenha(g);
	}
}
