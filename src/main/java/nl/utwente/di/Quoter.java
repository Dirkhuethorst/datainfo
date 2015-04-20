package nl.utwente.di;

public class Quoter {
	public double getBookPrice(String string){
		double i = 0.00;
		if (string.equals("1")){
			i = 10.0;
		} else if (string.equals("2")) {
			i = 45.0;
		} else if (string.equals("3")) {
			i = 20.0;
		} else if (string.equals("4")) {
			i = 35.0;
		} else if (string.equals("5")) {
			i = 50.0;
		}
		return i;
	}
}
