package ar.edu.unlam.pb2.tp1;

public class Disco {
	
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;
	final Double numeroPi = 3.14;
		
	
	


	public Disco() {
		
	}

	
	
	public Double obtenerPerimetroInterior(Double radioInterior) {
		perimetroInterior = (2*numeroPi*radioInterior);
		return perimetroInterior;
		
	}
	
	public Double obtenerPerimetroExterior(Double radioExterior) {
		perimetroExterior = (2*numeroPi*radioExterior);
		return perimetroExterior;
	}
	
	public Double obtenerSuperficie(Double radioExterior, Double radioInterior ) {
		superficie = (numeroPi*radioExterior*radioExterior)-(numeroPi*radioInterior*radioInterior);
		return superficie;
	}
	
	
	
	
	
	public Double getRadioInterior() {
		return radioInterior;
	}
	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}
	public Double getRadioExterior() {
		return radioExterior;
	}
	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
	public Double getPerimetroInterior() {
		return perimetroInterior;
	}
	public void setPerimetroInterior(Double perimetroInterior) {
		this.perimetroInterior = perimetroInterior;
	}
	public Double getPerimetroExterior() {
		return perimetroExterior;
	}
	public void setPerimetroExterior(Double perimetroExterior) {
		this.perimetroExterior = perimetroExterior;
	}
	public Double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}
	
	
	
	
	
}
	
	
	
	

