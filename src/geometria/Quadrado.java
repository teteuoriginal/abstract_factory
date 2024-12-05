package geometria;

public class Quadrado implements Figura{


	private int lado;
	
	public int getLado() {
		return lado;
	}
	
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public int getArea() {
		int area = 0;
		return area = lado *lado;
	}
	
	@Override
	public String getNome() {
		//TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public int getPerimetro() {
		//TODO Auto-generated method stub
		return 0;
	}
	
	
}
