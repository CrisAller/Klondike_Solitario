package Klondike;

public class MovimientoBarajaDescarte extends Opcion {

	private Baraja baraja;
	private Descarte descarte;
	
	public MovimientoBarajaDescarte(Baraja baraja, Descarte descarte) {
		super("Mover de Baraja a Descarte");
		this.baraja = baraja;
		this.descarte=descarte;
	}
	
	@Override
	public void ejecutar(Tapete tapete) {
		Carta carta;
		if (baraja.vacia()) {
			System.out.println("Error!!!, no hay cartas en la baraja");
		}else {
			int contador = 3;
			while (!baraja.vacia() && contador >0) {
				carta = baraja.sacar();
				carta.voltear();
				descarte.poner(carta);
				contador--;
			}
		}		
	}

}
