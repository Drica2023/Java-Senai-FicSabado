package aula1;

public class Exercicio1 {

	public static void main(String[] args) {
		double e = 7;
		double f = 2;
		double g = 4;
		double h = 9;

		double result1 = e + f * g - h;
		double result2 = e - (f + g);
		double result3 = e * e - g * h;
		double result4 = h - (f * 2);
		double result5 = f + h + e * g;
		double result6 = (e * f* g) / h;
		

		System.out.println("resultado 1 : " + result1);
		System.out.println("resultado 2 : " + result2);
		System.out.println("resultado 3 : " + result3);
		System.out.println("resultado 4 : " + result4);
		System.out.println("resultado 5 : " + result5);
		System.out.println("resultado 6 : " + result6);

	}

}
