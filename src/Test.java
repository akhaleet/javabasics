
public class Test {

	public static void main(String[] args) {
		Osoba o = new Osoba ("Bojan", "Tomovic");
		Osoba o2 = new Osoba ("Nikola", "Petric");
		System.out.println(o);
		System.out.println(o2);
		
		Nastavnik n = new Nastavnik ("Tutnjo", "Tutnjovic", "doc");
		System.out.println(n);
		
		Student s = new Student (2024, "", "Bojan", "Tomovic");
		Student s2 = new Student (2024, "", "Nikola", "Petric");
		System.out.println(s);
		System.out.println(s2);
		
		System.out.println("----------------------------------");
		
		
		Predmet predmet = new Predmet ("Matematika", "MATEM13", 5);
		predmet.dodajOsobu(s);
		predmet.dodajOsobu(s2);
		
		try {
            predmet.dodajOsobu(n);
        } catch (GViseNastavnika e) {
            System.out.println(e.getMessage());
        }
		
		try {
			Osoba n2 = new Nastavnik("Tigran", "Tigranovic", "prof");
			predmet.dodajOsobu(n2);
		} catch (GViseNastavnika e) {
            System.out.println(e.getMessage());
        }
		
		System.out.println(predmet);
		
		
		

	}

}
