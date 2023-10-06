package primerparcial2023_2do_cuatrimestre;

public class Tenista extends Deportista {

	public Tenista(int numeroDeSocio, int diasSemanalesDeEntrenamiento) {
		super(numeroDeSocio, diasSemanalesDeEntrenamiento);
	}

	@Override
	public double getCuotaMensual() {
		return Deportista.CUOTA_BASE * (1 + 0.05 * super.getDiasSemanalesDeEntrenamiento());
	}

}
