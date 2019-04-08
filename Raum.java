package gebaeudeverwaltung;


public class Raum {

	String 	raumName;
	String 	nutzungsZweck;

	double grundFlaeche;
	int anzahlFenster;

	public Raum(String _raumName) {
		this.raumName = _raumName;
	}

	public Raum(String _raumName, String _nutzungsZweck) {
		this(_raumName);
		this.nutzungsZweck = _nutzungsZweck;
	}

	public Raum(String _raumName, String _nutzungsZweck, double _grundFlaeche, int _anzahlFenster) {

		this(_raumName,_nutzungsZweck);
		this.grundFlaeche = _grundFlaeche;
		this.anzahlFenster = _anzahlFenster;
	}

	public String toString() {
		return "\n──────────────────────────────────────────────"+"\nRaum: \t\t\t"+raumName+"\nZweck: \t\t\t"
				+nutzungsZweck+"\nFläche \t\t\t"+grundFlaeche+"\nFenster: \t\t"+anzahlFenster;
	}
}
