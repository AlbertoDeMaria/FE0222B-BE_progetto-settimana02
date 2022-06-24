package blog;

public class Articolo {
	protected int id;
	protected String titolo;
	protected String data;
	protected String categoria;
	protected String testo;
	protected Autore autore;
	protected Tag tags;
	
	//	costruttori
	public Articolo() {};
	
	public Articolo(int id, String titolo, String data, String categoria, String testo, Autore autore, Tag tags) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.data = data;
		this.categoria = categoria;
		this.testo = testo;
		this.autore = autore;
		this.tags = tags;
	}
	
	//	getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	public Tag getTags() {
		return tags;
	}

	public void setTags(Tag tags) {
		this.tags = tags;
	}

	
	//	toString()
	@Override
	public String toString() {
		return "Articolo [id=" + id + ", titolo=" + titolo + ", data=" + data + ", categoria=" + categoria + ", testo="
				+ testo + ", autore=" + autore + ", tags=" + tags + "]";
	}

}
