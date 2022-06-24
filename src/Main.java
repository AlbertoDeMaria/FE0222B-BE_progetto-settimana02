package blog;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//	Tags
		String[] fantasy = {"maghi","streghe","magia","fantastico","immaginario"};
		String[] poliziesco = {"sparatorie","crimini","criminali","polizia","reati"};
		String[] comici = {"risate","divertente","simaptici","ridere","comico"};
		
		Tag listaTagFantasy = new Tag(fantasy);
		Tag listaTagPoliziesco = new Tag(poliziesco);
		Tag listaTagComici = new Tag(comici);
		
		//	Autori
		Autore a1 = new Autore(1, "Autore", "1");
		Autore a2 = new Autore(2, "Autore", "2");
		Autore a3 = new Autore(3, "Autore", "3");
	
		// Articoli
		Articolo art1 = new Articolo(1, "Articolo 1", "10 Giugno", "Fantasy", "Testo Articolo 1 Fantasy Lorem Ipsum", a1, listaTagFantasy);
		Articolo art2 = new Articolo(2, "Articolo 2", "15 Settembre", "Poliziesco", "Testo Articolo 2 Poliziesco Lorem Ipsum", a2, listaTagPoliziesco);
		Articolo art3 = new Articolo(3, "Articolo 3", "19 Agosto", "Comico", "Testo Articolo 3 Comico Lorem Ipsum", a3, listaTagComici);
		Articolo[] articoli = {art1, art2, art3};
		
		//	Creo il blog
		Blog blog = new Blog(articoli);
		
		//	Chiedo all'utente quale opzione vuole scegliere
		int scelta;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Benvenuto! Scegli un opzione per continuare:\n1) Visualizza tutti gli articoli \n2) Cerca articolo tramite iD");
			scelta = in.nextInt();
		} while (scelta < 1 || scelta > 2);
		
		switch (scelta) {
		case 1:
			blog.stampaArticoli();
			break;

		case 2:
			int idScelto;
			do {
				System.out.println("Inserisci l'iD dell'articolo che vuoi cercare (l'iD deve essere maggiore di 0 e minore di " + blog.getArticoli().length + ")");
				idScelto = in.nextInt();
			} while(idScelto <= 0 || idScelto > blog.getArticoli().length);
			blog.stampaArticoloPerId(idScelto);
			break;
		
		}
		in.close();
	}

}
