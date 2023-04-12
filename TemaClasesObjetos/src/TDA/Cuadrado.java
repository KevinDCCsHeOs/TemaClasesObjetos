package TDA;

public class Cuadrado {
	private float lado;
	public Cuadrado() {}
	public Cuadrado(float lado) {
		this.lado = lado;
	}
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
	public float AreaCuadrado() {
		return (float) (Math.pow(lado, 2));
	}
	public float PerimetroCuadrado() {
		return (lado*4);
	}
}
