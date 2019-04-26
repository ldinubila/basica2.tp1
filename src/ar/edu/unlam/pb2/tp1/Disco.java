package ar.edu.unlam.pb2.tp1;

public class Disco {
	
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior = (2*3.14*radioExterior);
	private Double superficie = ((3.14*(radioExterior*2))-(3.14*radioInterior*2));
	final Double numeroPi = 3.14;
		
	
	public Disco(Double radioInterior, Double radioExterior, Double perimetroInterior, Double perimetroExterior,
			Double superficie) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
		this.perimetroInterior = perimetroInterior;
		this.perimetroExterior = perimetroExterior;
		this.superficie = superficie;
	}
	
	
	public Double obtenerPerimetroInterior(Double radioInterior) {
		perimetroInterior = 2*numeroPi*radioInterior;
		return perimetroInterior;
		
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
	
	
	
	

