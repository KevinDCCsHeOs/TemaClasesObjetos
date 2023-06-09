package TestClasesObjetos;

import javax.swing.JOptionPane;
import EntradaSalida.Tools;
import TDA.Cuadrado;
import TDA.Rectangulo;
import TDA.Circulo;
import TDA.Triangulo;

public class PruebaFiguras {
	public static String Boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null, "Seleccione dando clic","Menu de figuras",JOptionPane.NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return valores[n];
	}
	public static void MenuFiguras(String menu) {
		String sel="";
		do {
			sel=Boton(menu);
			switch(sel) {
			case "Cuadrado":
				Cuadrado cuadrado=new Cuadrado();
				cuadrado.setLado(Tools.leerFloat("Dame el lado"));
				MenuCuadrado("Perimetro,Area,Salir",cuadrado.getLado());
				break;
			case "Rectangulo":
				Rectangulo rectangulo=new Rectangulo();
				rectangulo.setBase(Tools.leerFloat("Dame la base"));
				rectangulo.setAltura(Tools.leerFloat("Dame la altura"));
				MenuRectangulo("Perimetro,Area,Salir", rectangulo.getBase(), rectangulo.getAltura());
				break;
			case "Circulo":
				Circulo circulo=new Circulo();
				circulo.setRadio(Tools.leerFloat("Dame el radio:"));
				MenuCirculo("Perimetro,Area,Salir", circulo.getRadio());
				break;
			case "Triangulo":
				Triangulo triangulo=new Triangulo();
				triangulo.setBase(Tools.leerFloat("Dame la base: "));
				triangulo.setAltura(Tools.leerFloat("Dame la altura: "));
				triangulo.setLado1(Tools.leerFloat("Dame el primer lado: "));
				triangulo.setLado2(Tools.leerFloat("Dame el segundo lado: "));
				triangulo.setCatetoO(Tools.leerFloat("Dame el cateto opuesto: "));
				triangulo.setCatetoA(Tools.leerFloat("Dame el cateto adyacente: "));
				MenuTriangulo("Area,Perimetro,Hipotenusa,Tipo de triangulo,Salir",triangulo.getBase(),triangulo.getAltura(),triangulo.getLado1(),
						triangulo.getLado2(),triangulo.getCatetoO(),triangulo.getCatetoA());
				break;
			case "Salir":
				Tools.imprimePantalla("Adiós");
				break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	public static void main(String[] args) {
		MenuFiguras("Cuadrado,Rectangulo,Circulo,Triangulo,Salir");
	}
	public static void MenuCuadrado(String menu, float lado) {
		String sel="";
		Cuadrado cua=new Cuadrado(lado);
		do {
			sel=Boton(menu);
			switch (sel) {
			case "Perimetro":
				Tools.imprimePantalla("El Perimetro es: \n"+cua.PerimetroCuadrado());
				break;
			case "Area":
				Tools.imprimePantalla("El Area es: \n"+cua.AreaCuadrado());
				break;
			case "Salir":
				Tools.imprimePantalla("Puedes seguir probando otra figura");
				break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	public static void MenuRectangulo(String menu, float base, float altura) {
		String sel="";
		Rectangulo rec=new Rectangulo(base, altura);
		do {
			sel=Boton(menu);
			switch (sel) {
			case "Perimetro":
				Tools.imprimePantalla("El perimetro es: \n"+rec.PerimetroRectangulo());
				break;
			case "Area":
				Tools.imprimePantalla("EL area es: \n"+rec.AreaRectangulo());
				break;
			case "Salir":
				Tools.imprimePantalla("Puedes seguir probando otra figura");
				break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	public static void MenuCirculo(String menu, float radio) {
		String sel="";
		Circulo cir=new Circulo(radio);
		do {
			sel=Boton(menu);
			switch (sel) {
			case "Perimetro":
				Tools.imprimePantalla("El perimetro es: \n"+cir.PerimetroCirculo());
				break;
			case "Area":
				Tools.imprimePantalla("EL area es: \n"+cir.AreaCirculo());
				break;
			case "Salir":
				Tools.imprimePantalla("Puedes seguir probando otra figura");
				break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	public static void MenuTriangulo(String menu, float base, float altura, float lado1, float lado2, float catetoO, float catetoA) {
		String sel="";
		Triangulo tri=new Triangulo(base, altura, lado1, lado2, catetoO, catetoA);
		do {
			sel=Boton(menu);
			switch (sel) {
			case "Area":
				Tools.imprimePantalla("El area es: \n"+tri.AreaTriangulo());
				break;
			case "Perimetro":
				Tools.imprimePantalla("El perimetro es: \n"+tri.PerimetroTriangulo());
				break;
			case "Hipotenusa":
				Tools.imprimePantalla("La hipotenusa es: \n"+tri.HipotenusaTriangulo());
				break;
			case "Tipo de triangulo":
				Tools.imprimePantalla("El triangulo es: \n"+tri.TipoTriangulo());
				break;
			case "Salir":
				Tools.imprimePantalla("Puedes seguir probando otra figura");
				break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
}
