package Klondike;

public class VolteoDescarteBaraja extends Opcion {
	
	private Descarte descarte;
	private Baraja baraja;

	public VolteoDescarteBaraja(Descarte descarte, Baraja baraja) {
		super("Voltear Descarte en Baraja");
		this.descarte = descarte;
		this.baraja = baraja;
	}

	@Override
	public void ejecutar(Tapete tapete) {
		assert baraja!=null;
		if(descarte.vacia()) {
			System.out.println("Error!!! No hay cartas");
		}else {
			for(int i=descarte.primerHueco-1;i>=0;i--) {
				baraja.poner(descarte.cartas[i]);
				descarte.cartas[i].voltear();
			}
			descarte.primerHueco=0;
		}
	}		
	

}
