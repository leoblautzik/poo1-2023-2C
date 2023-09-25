package encapsulamiento;

public class Cerradura {
	
	private int clave;
	private int cFcQlaB;
	private int cantidadDeAperturasExitosas = 0;
	private boolean estaAbierta = true;
	private boolean estaBloqueada = false;
	private int cantidadDeFallasConsecutivas = 0;
	
	public Cerradura(int claveDeApertura,int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.clave = claveDeApertura;
		this.cFcQlaB = cantidadDeFallosConsecutivosQueLaBloquean; 
	}

    public boolean abrir(int clave) {
    	
    	if(this.estaBloqueada)
    		throw new Error("La cerradura ya fue bloqueada");
    	
    	if(estaAbierta())
    		return true;
    	
    	if(clave == this.clave) {
    		estaAbierta = true;
    		this.cantidadDeAperturasExitosas++;
    		this.cantidadDeFallasConsecutivas = 0;
    		return true;
    	}else {
    		this.cantidadDeFallasConsecutivas++;
    		if(this.cantidadDeFallasConsecutivas >= this.cFcQlaB)
    			this.estaBloqueada = true;
    		return false;
    	}   	
    		
    }

    public void cerrar() {
    	if(this.estaBloqueada)
    		throw new Error("La cerradura ya fue bloqueada");
    	this.estaAbierta = false;
    	
    }

    public boolean estaAbierta() {
    	return this.estaAbierta;
    }

    public boolean estaCerrada() {
    	return !this.estaAbierta();
   	
    }

    public boolean fueBloqueada() {
    	return this.estaBloqueada;
    }

    public int contarAperturasExitosas() {
    	return this.cantidadDeAperturasExitosas;
    }

    public int contarAperturasFallidas() {
    	return this.cantidadDeFallasConsecutivas;
    }

}
