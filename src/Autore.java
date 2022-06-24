package blog;

public class Autore implements Scrittore{
	
	protected int id;
	protected String nome;
	protected String cognome;
	
	//	costruttore
	public Autore(int id, String nome, String cognome) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}

	//	getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	@Override
	public Articolo scriviArticolo(Articolo articolo) {
		//imposto l'autore dell'articolo che mi è stato passato
		articolo.setAutore(this);
		return articolo;
	}

	//toString()
	@Override
	public String toString() {
		return "Autore [id=" + id + ", nome=" + nome + ", cognome=" + cognome + "]";
	}

	

}
