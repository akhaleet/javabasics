
public class Nastavnik extends Osoba {

	
	String zvanje;
	
	public Nastavnik(String ime, String prezime, String zvanje) {
		super(ime, prezime);
		this.zvanje = zvanje;
	}

	String getZvanje() {
		return zvanje;
	}

	@Override
	public String toString() {
		
		return "N: " + zvanje + " dr. " + ime + " " + prezime;
	}
	
	
}
