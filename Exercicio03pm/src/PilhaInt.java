public class PilhaInt implements Cloneable {
	private int[] buffer;
	private int topo;

	public PilhaInt(int contMax) {
		buffer = new int[contMax];
		topo = -1;
	}

	public void push(int val) {
		buffer[++topo] = val;
	}

	public int pop() {
		return buffer[topo--];

	}

	public Object clone() {
		try {
			PilhaInt nObj = (PilhaInt) super.clone();
			nObj.buffer = (int[]) buffer.clone();
			return nObj;
		} catch (CloneNotSupportedException e) {
			// N�o pode acontecer.N�s damos suporte
			// a clone e arrays tamb�m.
			throw new InternalError(e.toString());
		}
	}

	public static void main(String[] args) {
		PilhaInt prim = new PilhaInt(10);
		prim.push(2);
		prim.push(9);
		PilhaInt seg = (PilhaInt) prim;
		seg.push(10);
		System.out.println("Top de prim : " + prim.pop());
		System.out.println("Top de seg : " + seg.pop());
	}
	/**
	 * O m�todo clone se mostrou necess�rio pois proporcinou clonar o array de
	 * buffer, o que n�o era poss�vel anteriormente. Houve diferen�a porque o
	 * m�todo clone estava impondo os valores de um objeto sobre o outro,
	 * fazendo uma invers�o de valores.
	 * 
	 */

}