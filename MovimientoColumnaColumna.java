package Klondike;

public class MovimientoColumnaColumna extends Opcion {
	
	private Columna columna;

	public MovimientoColumnaColumna() {
		super("Mover de Columna a Columna");
			}

	@Override
	public void ejecutar(Tapete tapete) {
		assert columna!=null;
		Columna columnaRecoge = tapete.getColumna(super.recogerMazo("De", "Columna"));
		Columna columnaRecibe = tapete.getColumna(super.recogerMazo("A", "Columna"));
		if(columnaRecoge.vacia()) {
			System.out.println("Error!!! La columna está vacia");
		}else {
			Carta carta= columnaRecoge.sacar();
			if(columnaRecibe.apilable(carta)) {
				columnaRecibe.poner(carta);
			}else {
				columnaRecoge.poner(carta);
				System.out.println("Este movimiento no está permitido");
			}
		}		
	}

}
