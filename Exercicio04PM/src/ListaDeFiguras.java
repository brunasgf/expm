import java.awt.*;

class ListaDeFiguras {
	private Figura vet[];
	private int tmax;
	private int cont;

	public ListaDeFiguras(int t) {
		vet = new Figura[t];
		tmax = t;
		cont = 0;
	}
	

	public boolean listaCheia() throws ExcecaoListaCheia{
		if(tmax == cont){
			throw new ExcecaoListaCheia(); 
		}
		else 
			return false; 
	}
	
	
	
	public int getCont() {
		return cont;
	}


	public void insere(Figura f) throws ExcecaoListaCheia {
		if (!listaCheia()){
		vet[cont] = f;
		cont++;
		}
	}
	
	public void remove() {
		if (cont == 0)
			return;
		cont--;
		vet[cont] = null;
	}


	public void desenha(Graphics g) {
		for (int i = 0; i < cont; i++)
			vet[i].desenha(g);
	}
}