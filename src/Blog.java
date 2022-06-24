package blog;

public class Blog {
	
	protected Articolo[] articoli;

	//costruttore
	public Blog(Articolo[] articoli) {
		this.articoli = articoli;
	}

	//getters e setters
	public Articolo[] getArticoli() {
		return articoli;
	}
	
	public void stampaArticoloPerId(int id) {
	//forEach che cicla finchè non trova l'id giusto
		for ( Articolo articolo : articoli ) {
			if (articolo.getId() == id ) {
				System.out.println(articolo.toString());
			}
		}
	}
	
	public void stampaArticoli() {
		for ( Articolo articolo : articoli ) {
			System.out.println(articolo.toString());
		}
	}
	
}
