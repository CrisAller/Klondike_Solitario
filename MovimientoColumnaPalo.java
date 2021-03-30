package Klondike;

public class MovimientoColumnaPalo extends Opcion{
	
	private Columna columna;
	private Palo palo;

	public MovimientoColumnaPalo() {
		super("Mover de Columna a Palo");
	}

	@Override
	public void ejecutar(Tapete tapete) {
		assert palo!=null;
		columna = tapete.getColumna(super.recogerMazo("De", "Columna"));
		palo = tapete.getPalo(super.recogerMazo("A", "Palo"));
		if (columna.vacia()) {
			System.out.println("Error!!! La columna está vacia");
		}else {
			Carta carta = columna.sacar();
			if(palo.apilable(carta)) {
				carta.mostrar();
				palo.poner(carta);
			}else {
				columna.poner(carta);
				System.out.println("Error!!! No se puede realizar este movimiento");
			}
		}		
	}

}
