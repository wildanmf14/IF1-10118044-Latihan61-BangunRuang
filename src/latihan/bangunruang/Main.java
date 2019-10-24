package latihan.bangunruang;

public class Main {

	public static void main(String[] args) {
		Bola bola = new Bola(7);
		Tabung tabung = new Tabung(10,21);
		Kerucut kerucut = new Kerucut(14,9);

		System.out.printf("Volume Bola = %.1f ", bola.Volume());
		System.out.printf("\nVolume Tabung = %.0f ", tabung.Volume());
		System.out.printf("\nVolume Kerucut = %.0f ", kerucut.Volume(), "\n");
	}

}
