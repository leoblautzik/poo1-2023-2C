package primerparcial2023_2do_cuatrimestre;

public class Club {

	private Deportista[] socios;
	private int cantidadDeSocios = 0;

	public Club(int cantidadMaximaDeSociosQueAdmite) {
		this.socios = new Deportista[cantidadMaximaDeSociosQueAdmite];
	}

	public void agregarSocio(Deportista d) {
		if (cantidadDeSocios >= socios.length)
			throw new Error("No se admiten mas socios");
		socios[cantidadDeSocios] = d;
		cantidadDeSocios++;
	}
	
	public double getTotalMensualDeCuotas(){
		double suma =0;
		for (int i = 0; i < cantidadDeSocios; i++) {
			suma += socios[i].getCuotaMensual();
		}
		return suma;
	}


	public void listarPlanillaDesocios() {
		System.out.println("Nro De Socio" + "\t" + "Cuota Mensual");

		for (int i = 0; i < cantidadDeSocios; i++) {
			System.out.println(socios[i]);
		}
	}
}
