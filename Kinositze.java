package gebaeudeverwaltung;

public class Kinositze extends Moebel {

	boolean beschaedigt;
	boolean verschmutzt;

	Kinositze(int gewicht, int laenge, int breite, int hoehe) {
		super(gewicht, laenge, breite, hoehe);
	}

	public void setBeschaedigt() {
		int temp = (int)(Math.random()*1.1);
		if (temp == 1) {
			beschaedigt = true;
		}
		else {
			beschaedigt = false;
		}
	}

	public void setVerschmutzt() {
		int temp = (int)(Math.random()*2);
		if (temp == 1) {
			verschmutzt = true;
		}
		else {
			verschmutzt = false;
		}
	}

}
