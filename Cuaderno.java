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
}