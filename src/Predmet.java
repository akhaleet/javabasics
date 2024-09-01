import java.util.*;

public class Predmet {

	String nazivPredmeta;
	String sifraPredmeta;
	Osoba[] osobe;
	int brojOsoba;
	

	public Predmet(String nazivPredmeta, String sifraPredmeta, int kapacitet) {
		this.nazivPredmeta=nazivPredmeta;
		this.sifraPredmeta=sifraPredmeta;
		this.osobe = new Osoba[kapacitet];
		this.brojOsoba=0;
	}
	
	String getNazivPredmeta() {
		return nazivPredmeta;
	}

	String getSifraPredmeta() {
		return sifraPredmeta;
	}

	
	public void dodajOsobu(Osoba osoba) {
		if (brojOsoba >= osobe.length) {
			throw new GViseNastavnika("Nema više prostora za dodavanje osoba.");
		}
		if (osoba instanceof Nastavnik) {
			for (int i=0; i < brojOsoba; i++) {
				if (osobe[i] instanceof Nastavnik) {
					throw new GViseNastavnika("Nastavnik već postoji na predmetu.");
				}
			}
		}
		osobe[brojOsoba++] = osoba;
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nazivPredmeta).append(" (").append(sifraPredmeta).append(")\n");
		for (int i=0; i < brojOsoba; i++) {
			sb.append(osobe[i]).append("\n");
		}
		return sb.toString();
	}
	
	
}
