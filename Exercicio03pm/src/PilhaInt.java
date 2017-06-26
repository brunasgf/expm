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
			// Não pode acontecer.Nós damos suporte
			// a clone e arrays também.
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
	 * O método clone se mostrou necessário pois proporcinou clonar o array de
	 * buffer, o que não era possível anteriormente. Houve diferença porque o
	 * método clone estava impondo os valores de um objeto sobre o outro,
	 * fazendo uma inversão de valores.
	 * 
	 */

}