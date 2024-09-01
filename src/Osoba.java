
public class Osoba {
	
	
	String ime;
	String prezime;
	
	
	public Osoba(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	
	String getIme() {
		return ime;
	}
	String getPrezime() {
		return prezime;
	}
	String getPrvoSlovo() {
		return ime.substring(0,1);
	}
	
	@Override
	public String toString() {

		return ime + " " + prezime;
	}
	
	
}
