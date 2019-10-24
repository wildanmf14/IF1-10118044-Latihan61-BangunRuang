package latihan.bangunruang;

public class Kerucut extends BangunRuang{
	private double t;
	public Kerucut(double r, double t) {
		super(r);
		this.t = t;
	}
	@Override
	public double Volume() {
		return (0.33333333333 * (Math.PI * r * r) * t);
	}

		
	

}
