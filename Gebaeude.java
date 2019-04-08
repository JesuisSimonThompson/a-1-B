package gebaeudeverwaltung;

public class Gebaeude {

	String 	gebaeudeName; 						// Holiday Inn
	String 	verantwortlicherProgrammierer; 		// Frau Samsara

	String	strasse;							// Stahlgruberring
	String	hausnummer;							// 12
	int		plz;								// 80963

	int		anzahlRaeume;						// 2
	int 	anzahlStockwerke;					// 2
	int 	anzahlEingaenge;					// 2

	String 	telNummer;							// +49-89-3453575-243
	String 	kontakt;							// Herr M�ller

	/* Der Construktor dient dazu, ein Objekt zu erzeugen */

	//public Gebaeude() {}
	public Gebaeude(String _gebaeudeName, String _verantwortlicherProgrammierer, String _strasse, String _hausnummer, int _plz) {

		gebaeudeName = _gebaeudeName;
		verantwortlicherProgrammierer = _verantwortlicherProgrammierer;
		strasse = _strasse;
		hausnummer = _hausnummer;
		plz = _plz;

	}

	public String toString() {
		return "\n──────────────────────────────────────────────\nGebäude: \t\t"+gebaeudeName+"\nVerantwortlicher: \t"+verantwortlicherProgrammierer
				+"\nStraße: \t\t"+strasse+" "+hausnummer+"\nPLZ: \t\t\t"+plz+"\nKontakt: \t\t"+kontakt+"\nTel: \t\t\t"+telNummer;
	}

}
