
public class Frete {

	private int codigo;
	private double valornota;
	private String destino;

	public Frete(double valor) {
		this.valornota = valor;
	}

	public int getCode() {
		return this.codigo;
	}

	public void setCode(int cod) {
		this.codigo = cod;
	}

	public double getValue() {
		return this.valornota;
	}

	public void setValue(double va) {
		this.valornota = va;
	}

	public String getDest() {
		return this.destino;
	}

	public void setDest(String d) {
		this.destino = d;
	}

	public double FreteSP(double v) {

		if(v < 3000) {
			v = (v * 0.05);
		}
		else if(v == 3000 && v <= 5000)
		{
			v = (v * 0.1);
		}
		else if(v > 5000) {
			v = (v * 0.15);
		}

		return v;
	}

	public double FreteOutros(double v) {
		return (v * 0.2);
	}

}