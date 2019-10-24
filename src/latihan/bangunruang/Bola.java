package latihan.bangunruang;

public class Bola extends BangunRuang {
	
	public Bola(double r) {
		super(r);
	}
	
	@Override
	public double Volume() {
		return ( 1.33333 * 3.142857 * (Math.pow(r, 3)) ) ;

	}

}
