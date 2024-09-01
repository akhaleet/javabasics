
public class Student extends Osoba {

	
	String indeks;
	int godinaUpisa;
	static int brojacZaIndeks = 0;
	
	
	
	
	public Student(int godinaUpisa, String indeks, String ime, String prezime) {
		super(ime, prezime);
		this.godinaUpisa = godinaUpisa;
		brojacZaIndeks++;
		this.indeks = String.format("%04d", brojacZaIndeks);
	}

	String getIndeks() {
		return indeks;
	}

	int getGodinaUpisa() {
		return godinaUpisa;
	}


	
	@Override
	public String toString() {
		
		return "S: " + godinaUpisa + "/" + indeks + " - " + ime + " " + prezime;
	}
	
	
}
