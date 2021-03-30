package Klondike;

public class MovimientoDescartePalo extends Opcion {
	
	private Descarte descarte;
	private Palo palo;

	public MovimientoDescartePalo(Descarte descarte) {
		super("Mover de Descarte a Palo");
		this.descarte = descarte;
		
	}

	@Override
	public void ejecutar(Tapete tapete) {
		assert palo!=null;
		int numero = super.recogerMazo("A", "Palo");
		palo = (Palo)tapete.getPalo(numero);
		if(descarte.vacia()) {
			System.out.println("Error!!! El descarte está vacio");
		}else {
			Carta carta = descarte.sacar();
			if (palo.apilable(carta)) {
				palo.poner(carta);
			}else {
				descarte.poner(carta);
				System.out.println("Error!!! No se puede realizar ese movimiento");
			}
		}
	}

}
