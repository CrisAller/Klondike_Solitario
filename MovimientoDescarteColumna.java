package Klondike;

public class MovimientoDescarteColumna extends Opcion{
	
	private Descarte descarte;
	private Columna columna;

	public MovimientoDescarteColumna(Descarte descarte) {
		super("Mover de Descarte a Columna");
		this.descarte = descarte;
	}

	@Override
	public void ejecutar(Tapete tapete) {
		assert columna!=null;
		int numero= super.recogerMazo("A", "Columna");
		columna = (Columna)tapete.getColumna(numero);
		if(descarte.vacia()) {
			System.out.println("Error!!! El descarte está vacio");
		}else {
			Carta carta = descarte.sacar();
			if (columna.apilable(carta)) {
				columna.poner(carta);
			}else {
				descarte.poner(carta);
				System.out.println("Error!!! No se puede realizar ese movimiento");
			}
		}
	}		
	
	

}
