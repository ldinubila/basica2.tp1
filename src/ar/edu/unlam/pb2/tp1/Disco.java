package ar.edu.unlam.pb2.tp1;

public class Disco {

	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;

	public Disco(Double radioInterior, Double radioExterior, Double superficie) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
		this.superficie = superficie;
	}
	public Disco(Double radioInterior, Double radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}

	public Double obtenerPerimetroInterior(Double radioInterior) {
		perimetroInterior = (2 * Math.PI * radioInterior);
		return perimetroInterior;

	}

	public Double obtenerPerimetroExterior(Double radioExterior) {
		perimetroExterior = (2 * Math.PI * radioExterior);
		return perimetroExterior;
	}

	public Double obtenerSuperficie(Double radioExterior, Double radioInterior) {
		superficie = (Math.PI * radioExterior * radioExterior) - (Math.PI * radioInterior * radioInterior);
		return superficie;
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
