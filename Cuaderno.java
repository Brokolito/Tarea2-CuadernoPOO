import java.util.ArrayList;

public class Cuaderno {
	private ArrayList<Hojas> hojas;

	public Cuaderno() {
		this.hojas=new ArrayList<>();
	}

	public int arrancarHoja(Hojas hoja) {
		if(hojas.size()!=0){
			hojas.remove(hoja);

		}
		return hojas.size();
	}
	public int agregarHojas(Hojas hoja){
		hojas.add(hoja);
		return hojas.size();
	}
	public Hojas encontrarHojaPorTexto(String texto){
		for(Hojas hojas1:this.hojas){
			if (hojas1.getTexto().equals(texto)){
				return hojas1;
			}
		}
		return null;
	}
	public ArrayList<Hojas> encontrarHojasPorTipo(String tipo){
		ArrayList<Hojas> hojasDelMismoTipo=new ArrayList<>();
		for(Hojas hojas1:this.hojas){
			if (hojas1.getTipo().equals(tipo)){
				hojasDelMismoTipo.add(hojas1);
			}
		}
		return hojasDelMismoTipo;
	}
}