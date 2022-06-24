package blog;

import java.util.Arrays;

public class Tag {
	
	protected String[] tagArticolo;

	public Tag(String[] tagArticolo) {
		super();
		this.tagArticolo = tagArticolo;
	}

	//getters e setters
	public String[] getTagArticolo() {
		return tagArticolo;
	}

	public void setTagArticolo(String[] tagArticolo) {
		this.tagArticolo = tagArticolo;
	}

	//toString()
	@Override
	public String toString() {
		return "Tag [tagArticolo=" + Arrays.toString(tagArticolo) + "]";
	}

	
	
}
