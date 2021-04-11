package numbers;

public class FloatingPointNumber {

	public static void main(String[] args) {
		
		double d = 123;
		double e = 0;
		
		if(d/e == Double.POSITIVE_INFINITY)
			System.out.println("Check for POSITIVE_INFINITIVE works");
		
		double s = Math.sqrt(-1);
		if(s == Double.NaN) {
			System.out.println("Comparision with NaN incorrectly returns true");
		}
		
		if(Double.isNaN(s))
			System.out.println("Double.isNaN() correctly returns true");
		
		heron();

	}
	
	private static void heron() {
		
		float af, bf, cf;
		float sf, areaf;
		
		double ad, bd, cd;
		double sd, aread;
		
		af = 12345679.0f;
		bf = 12345678.0f;
		cf = 1.01233995f;
		
		sf = (af + bf + cf)/2.0f;
		areaf = (float)Math.sqrt(sf * (sf - af) * (sf - bf) * (sf - cf));
		System.out.println("Single precision: " + areaf);
		
		ad = 12345679.0;
		bd = 12345678.0;
		cd = 1.01233995;
		
		sd = (ad + bd + cd)/2.0d;
		aread = Math.sqrt(sd * (sd - ad) + (sd - bd) * (sd - cd));
		System.out.println("Double precision: " + aread);
	}

}
