package listaCirc;

public class ListaCirc {

	private No primeiro;
	private No ultimo;
	private int tamanho;

	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

	public No getUltimo() {
		return ultimo;
	}

	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

// inserir no final ----------------------------------------
	public void inserirFinal(int valor) {
		No novoNo = new No(valor);
		if (this.primeiro == null && this.ultimo == null) {
			this.setPrimeiro(novoNo);
			this.setUltimo(novoNo);
			this.ultimo.setProximo(this.primeiro);
			this.primeiro.setAnterior(this.ultimo);
		} else {
			this.ultimo.setProximo(novoNo);
			this.primeiro.setAnterior(novoNo);
			this.setUltimo(novoNo);
		}
		this.tamanho++;

	}

	// Contar a quantidade de elementos da lista circular -----------------------
	public void contarElementos(ListaCirc l1) {
		int cont = 0;
		No atual = this.getPrimeiro();
		if (this.primeiro == null && this.ultimo == null) {
			System.out.println("Tamanho da lista: " + cont);
			
		} else {
			while (atual.getProximo() != atual) {
				System.out.println("elemento " + cont + ":  " + atual.getValor());
				atual = atual.getProximo();
				cont++;
			}
			System.out.println("elemento " + cont + ":  " + atual.getValor());
			System.out.println("Tamanho da lista: " + cont);

		}
	}

	// Inserir na Esquerda
	public void inserirEsquerda(int v1) {
		No novoNo = new No(v1);
		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = novoNo;
			this.ultimo = novoNo;
			this.primeiro.setAnterior(this.ultimo);
			this.ultimo.setProximo(this.primeiro);

		} else {
			novoNo.setProximo(this.primeiro);
			this.setUltimo(novoNo.getProximo());
			this.primeiro = novoNo;
			this.primeiro.setAnterior(this.ultimo);
		}
		this.tamanho++;
	}

	// Método pra buscar o valor da posição desejada
	public No get(int posicao) {
		No atual = this.primeiro;
		for (int i = 0; i < posicao; i++) {
			if (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual;
	}

	// Concatenar listas
	public void concatenarListas(ListaCirc l1, ListaCirc l2) {

		for (int i = 0; i < l1.getTamanho(); i++) {
			this.inserirFinal(l1.get(i).getValor());
		}
		l1.getUltimo().setProximo(l2.getPrimeiro());
		for (int i = 0; i < l1.getTamanho(); i++) {
			this.inserirFinal(l2.get(i).getValor());
		}
		l2.getUltimo().setProximo(l1.getPrimeiro());

	}

}
