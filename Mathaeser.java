package gebaeudeverwaltung;

public class Mathaeser  extends Kino {

	KinoRaum alleKinoRaeume[] = new KinoRaum[4];

	KinoRaum Kino1 = new KinoRaum("Kino 1","Premieren",212.7,0,375,"DCI 5.1","2K","15,8 x 6,6 m");
	KinoRaum Kino2 = new KinoRaum("Kino 2","3D Film",180.8,0,335,"DCI 5.1","2K","15,6 x 6,5 m");
	KinoRaum Kino3 = new KinoRaum("Kino 3","3D Film",153.0,0,236,"DCI 5.1","2K","11,5 x 6,2 m");
	KinoRaum Kino4 = new KinoRaum("Kino 4","3D Film",174.5,0,162,"DCI 5.1","2K","10,6 x 5,7 m");

	public Mathaeser() {
		super("Mathäser-Filmpalast","Benedikt","Bayerstraße","3-5",80336);
		kinoSaele = 14;
		alleKinoRaeume[0] = Kino1;
		alleKinoRaeume[1] = Kino2;
		alleKinoRaeume[2] = Kino3;
		alleKinoRaeume[3] = Kino4;
	}

	int getAnzahlSitzplaetze() {
		int total = 0;
		for (int i=0;i<alleKinoRaeume.length;i++) {
			total += alleKinoRaeume[i].plaetze;
		}
		return total;
	}

	int getAnzahlVerschmSitzplaetze() {
		int anzahl = 0;
		for (int i=0;i<alleKinoRaeume.length;i++) {
			anzahl += alleKinoRaeume[i].anzahlVerschmutzterSitze();
		}
		return anzahl;
	}

	int getAnzahlBeschaedSitzplaetze() {
		int anzahl = 0;
		for (int i=0;i<alleKinoRaeume.length;i++) {
			anzahl += alleKinoRaeume[i].anzahlBeschaedigterSitze();
		}
		return anzahl;
	}

	double getReinigungskosten() {
		double kosten = 0;
		kosten = getAnzahlVerschmSitzplaetze()*1.5 + getAnzahlBeschaedSitzplaetze()*5.4;
		return kosten;
	}

	int getGesammtFläche() {
		int total = 0;
		for (int i=0;i<alleKinoRaeume.length;i++) {
			total += alleKinoRaeume[i].grundFlaeche;
		}
		return total;
	}

	String getKinosaeleInfo() {
		return "\nKinosäle: \t\t"+kinoSaele;
	}

	String getBesonderheiten() {
		return "\n──────────────────────────────────────────────\nDer Mathäser-Filmpalast besitzt 14 Kinosäle";
	}

	public String toString() {
		return "Besonderheiten: "+getBesonderheiten()+super.toString()+getKinosaeleInfo()+Kino1+Kino2+Kino3+Kino4
				+"\n──────────────────────────────────────────────\nSumme aller Sitzplätze: \t\t"+getAnzahlSitzplaetze()
				+"\nSumme aller Verschmutzten Sitzplätze: \t"+getAnzahlVerschmSitzplaetze()+"\nSumme aller Beschädigten Sitzplätze: \t"+getAnzahlBeschaedSitzplaetze()
				+"\nGesammte Reinigungskosten: \t\t"+getReinigungskosten()+" €"+"\nGesammt Fläche: \t\t\t"+getGesammtFläche();
	}

}
