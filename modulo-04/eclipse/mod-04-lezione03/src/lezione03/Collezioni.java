package lezione03;

import java.util.ArrayList;

public class Collezioni {
	// Java Collections Framework: insieme di class che contengono
	// strutture e metodi per semplificare l'uso delle collezioni di
	// valori rispetto all'uso degli array
	public static void main(String[] args) {
		// ArrayList
		ArrayList<Integer> numeri = new ArrayList<>();
		// ArrayList<Integer>: si legge ArrayList di Integer
		// < e > si chiamano parentesi angolari
		// la caratteristica sintattica di poter usare le parentesi angolari
		// in OOP si chiama GENERICS e serve per attribuire ad una classe
		// la capacità di esprimere un concetto generale applicabile a più
		// classi, ma specializzabile nell'uso pratico
		// Es: ArrayList rappresenta il generico concetto di collezione di elementi
		//     => ArrayList<Integer> è una collezione specializzata di INTEGER
		// In GENERICS non possono essere usati i tipi primitivi, ma solo classi,
		// quindi per avere una ArrayList di int devo utilizzare una rappresentazione
		// di un tipo nativo int come reference type (quindi una classe)
		// => per ognuno dei tipi primitivi in java.lang esiste una classe che lo
		//    rappresenta come un oggetto; queste classi sono dette classi wrapper
		
		numeri.add(1); // l'arraylist si ingrandisce di 1 e nella prima posizione (indice 0) ci va il valore 1
		numeri.add(15); // in seconda posizione (indice 1) ci va il valore 15
		
		int somma = 0;
		for(Integer i : numeri) { // ciclo for each
			somma += i;
		}
		System.out.println("la somma dei " + numeri.size() + " numeri è : " + somma);
		
	}

}
