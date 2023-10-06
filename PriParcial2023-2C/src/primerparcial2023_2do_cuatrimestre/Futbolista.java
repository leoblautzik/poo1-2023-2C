package primerparcial2023_2do_cuatrimestre;

public class Futbolista extends Deportista {

	public Futbolista(int numeroDeSocio, int diasSemanalesDeEntrenamiento) {
		super(numeroDeSocio, diasSemanalesDeEntrenamiento);
	}

	@Override
	public double getCuotaMensual() {
		return Deportista.CUOTA_BASE * (1 + 0.1 * super.getDiasSemanalesDeEntrenamiento());
	}

}
