package Klondike;

public class MovimientoPaloColumna extends Opcion {
	
	private Palo palo;
	private Columna columna;

	public MovimientoPaloColumna() {
		super("Mover de Palo a Columna");
	}

	@Override
	public void ejecutar(Tapete tapete) {
		assert columna!=null;
		int numero = super.recogerMazo("De", "Palo");
		palo = tapete.getPalo(numero);
		numero = super.recogerMazo("A", "Columna");
		columna = tapete.getColumna(numero);
		if (palo.vacia()) {
			System.out.println("Error!!! El palo está vacio");
		}else {
			Carta carta=palo.sacar();
			if(carta.apilable(columna)) {
				carta.poner(columna);
			}else {
				palo.poner(carta);
				System.out.println("Error!!! No se puede realizar este movimiento");
			}
		}		
	}
	
	

}
