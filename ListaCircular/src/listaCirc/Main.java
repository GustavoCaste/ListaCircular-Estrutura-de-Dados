package listaCirc;

public class Main {

	public static void main(String[] args) {

		// Lista circular l1
		
		ListaCirc l1 = new ListaCirc();
		l1.inserirFinal(3);
		l1.inserirFinal(2);
		l1.inserirFinal(1);
		l1.inserirFinal(5);
		l1.inserirFinal(4);
		l1.inserirFinal(8);

		// Lista circular l2
		
		ListaCirc l2 = new ListaCirc();
		l2.inserirFinal(13);
		l2.inserirFinal(12);
		l2.inserirFinal(11);
		l2.inserirFinal(15);
		l2.inserirFinal(14);
		l2.inserirFinal(18);

		
//		Para criar a lista l3 com as listas l1 e l2 intercaladas
		
//		ListaCirc l3 = intercalarListas(l1, l2);
	
		
//      Para concatenar os elementos de duas listas dentro da lista l3	
		
//		ListaCirc l3 = new ListaCirc();
//		l3.concatenarListas(l1, l2);
		

//		Para contar os elementos de uma lista
		
//	    l3.contarElementos(l3);

	    
	    
//	    Para criar a lista l4 e copiar o que está na lista l1 pra dentro dela 
	    
		ListaCirc l4 = copiarLista(l1);   
		l4.contarElementos(l4);
}

// Intercalar listas ----------------------------------------
	private static ListaCirc intercalarListas(ListaCirc l1, ListaCirc l2) {
		ListaCirc l3 = new ListaCirc();

		for (int i = 0; i < l1.getTamanho(); i++) {
			l3.inserirFinal(l1.get(i).getValor());
			l3.inserirFinal(l2.get(i).getValor());

		}
		return l3;

	}

	

	// Copiar lista ---------------------------------------------
	private static ListaCirc copiarLista(ListaCirc l1) {
		ListaCirc l3 = new ListaCirc();

		for (int i = 0; i < l1.getTamanho(); i++) {
			l3.inserirFinal(l1.get(i).getValor());
		}
		return l3;

	}
}
