package guia01Repaso;

public class Fecha {

	public static void informarDiaMesAnio(int fecha) {
		int anio = fecha / 10000;
		int dia = fecha % 100;
		int mes = fecha % 10000 / 100;

		String sdia;
		String smes;

		if (dia < 10)
			sdia = "0" + dia;
		else
			sdia = "" + dia;

		if (mes < 10)
			smes = "0" + mes;
		else
			smes = "" + mes;

		System.out.print("dia: " + sdia);

		System.out.print(" ,mes: " + smes);
		System.out.println(", año: " + anio);

		System.out.println(sdia + "/" + smes + "/" + anio);

	}

	public static void main(String[] args) {
		informarDiaMesAnio(20231002);
		informarDiaMesAnio(20240102);

	}

}
