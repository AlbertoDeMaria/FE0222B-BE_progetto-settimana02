package blog;

public class ArticoloFantasy extends Articolo{

	protected String descrizione;

	//	costruttore
	public ArticoloFantasy(int id, String titolo, String data, String categoria, String testo, Autore autore, Tag tags, String descrizione) {
		super(id, titolo, data, categoria, testo, autore, tags);
		this.descrizione = descrizione;
	}

	//getters e setters
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
	
	
	
}
