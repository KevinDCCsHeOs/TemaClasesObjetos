package TDA;

public class Fecha {
	//atributos
		private byte dia;
		private byte mes;
		private short añio;
		//Constructor vacio
		public Fecha() {}
		//Constructor parametrizado
		public Fecha(byte dia,byte mes,short añio) 
		{
			this.dia=dia;
			this.añio=añio;
			this.mes=mes;
		}
		//Encapsular
		public void setDia(byte dia) {
			this.dia=dia;
		}
		public byte getDia() {
			return dia;
		}
		public byte getMes() {
			return mes;
		}
		public void setMes(byte mes) {
			this.mes = mes;
		}
		public short getAñio() {
			return añio;
		}
		public void setAñio(short añio) {
			this.añio = añio;
		}
		@Override
		public String toString() {
			return "Fecha [dia=" + dia + ", mes=" + mes + ", añio=" + añio + "]";
		}
}
//Falta toString en fecha