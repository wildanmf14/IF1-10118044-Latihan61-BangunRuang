package latihan.bangunruang;

public class Tabung extends BangunRuang {
	private double t;
	
	public Tabung(double r, double t) {
		super(r);
		this.t = t;
	}

	@Override
	public double Volume() {
		return Math.PI * r * r * t;
	}

}
