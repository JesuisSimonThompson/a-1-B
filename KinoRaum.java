package gebaeudeverwaltung;

public class KinoRaum extends Raum{

	int 	plaetze;
	String 	tonsystem;
	String	dlpProjektion;
	String	leinwandmasse;
	Kinositze alleKinositze[];

	public KinoRaum(String _raumName, String _nutzungsZweck, double _grundFlaeche, int _anzahlFenster, int _plaetze, String _tonsystem,String _dlpProjektion,String _leinwandmasse) {
		super(_raumName,_nutzungsZweck,_grundFlaeche,_anzahlFenster);
		plaetze = _plaetze;
		tonsystem = _tonsystem;
		dlpProjektion = _dlpProjektion;
		leinwandmasse = _leinwandmasse;
		alleKinositze = new Kinositze[plaetze];
		for (int i=0;i<plaetze;i++) {
			alleKinositze[i]=new Kinositze(0,0,0,0);
			alleKinositze[i].setBeschaedigt();
			alleKinositze[i].setVerschmutzt();
		}
	}

	public String toString() {
		return super.toString()+"\nPlätze: \t\t"+plaetze+"\nTonsystem: \t\t"+tonsystem+"\nDLP-Projektion: \t"+dlpProjektion+"\nLeinwandmaße: \t\t"+leinwandmasse;
	}

	public int anzahlBeschaedigterSitze() {
		int counter=0;
		for (int i=0;i<alleKinositze.length;i++) {
			if (alleKinositze[i].beschaedigt == true) {
				counter++;
			}
		}
		return counter;
	}
	public int anzahlVerschmutzterSitze() {
		int counter=0;
		for (int i=0;i<alleKinositze.length;i++) {
			if (alleKinositze[i].verschmutzt == true) {
				counter++;
			}
		}
		return counter;
	}


}
