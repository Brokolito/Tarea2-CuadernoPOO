public class Hojas {
	private String tipo;
	private String texto;

	public Hojas(String tipo, String texto) {
		this.tipo=tipo;
		this.texto=texto;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}