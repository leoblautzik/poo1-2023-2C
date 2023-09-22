package sociedades;

public abstract class  Sociedad implements Comparable<Sociedad>{
	
	private String denominacionSocial;
	private String domicilioLegal;
	private Double capitalSocial;
	private String cuit;
	public Sociedad(String denominacionSocial, 
			String domicilioLegal, 
			Double capitalSocial, 
			String cuit) {
		
		this.denominacionSocial = denominacionSocial;
		this.domicilioLegal = domicilioLegal;
		this.capitalSocial = capitalSocial;
		this.cuit = cuit;
	}
	@Override
	public String toString() {
		return "Sociedad [denominacionSocial=" + denominacionSocial + ", domicilioLegal=" + domicilioLegal
				+ ", capitalSocial=" + capitalSocial + ", cuit=" + cuit + "]";
	}
	
	@Override
	public int compareTo(Sociedad otra) {
		return Double.compare(this.capitalSocial, otra.capitalSocial);
	}
	
	
	
}
