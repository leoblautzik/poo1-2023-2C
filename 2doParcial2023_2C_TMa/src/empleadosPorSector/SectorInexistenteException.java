package empleadosPorSector;

public class SectorInexistenteException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public SectorInexistenteException() {
		super("El sector no coresponde a la empresa");
	}

}
