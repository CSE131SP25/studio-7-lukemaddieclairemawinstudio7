package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public Fraction multiply(Fraction yippee) {
		int newN = this.numerator * yippee.numerator;
		int newD = this.denominator * yippee.denominator;
		Fraction newF = new Fraction(newN, newD);
		return newF;
	}
	public static void main (String[] args) {
		
		Fraction vicky = new Fraction (1,2);
		Fraction luke = new Fraction (3,4);
		System.out.println(vicky.multiply(luke));
	}
}
