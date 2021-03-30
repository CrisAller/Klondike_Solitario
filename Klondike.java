package Klondike;

public class Klondike {

	private Menu menu;
	private Tapete tapete;
	
	
	public Klondike() {
		tapete = new Tapete();
		this.menu = new Menu();
		menu.anadir(new MovimientoBarajaDescarte(tapete.getBaraja(),tapete.getDescarte()));
		menu.anadir(new MovimientoDescartePalo(tapete.getDescarte()));	
		menu.anadir(new MovimientoDescarteColumna(tapete.getDescarte()));
		menu.anadir(new MovimientoPaloColumna());
		menu.anadir(new MovimientoColumnaPalo());
		menu.anadir(new MovimientoColumnaColumna());
		menu.anadir(new VolteoCartaColumna());
		menu.anadir(new VolteoDescarteBaraja(tapete.getDescarte(),tapete.getBaraja()));

	}
	
	public void jugar() {
		do {
			tapete.mostrar();
			menu.mostrar();
			menu.getOption().ejecutar(tapete);
			
		}while (!tapete.finJuego());	
		System.out.println("FIN");
	}
	
	public static void main(String[] args) {
		new Klondike().jugar();
		
	}

	public Tapete getTapete() {
		return tapete;
	}

	public void setTapete(Tapete tapete) {
		this.tapete = tapete;
	}

	public Menu getMenu() {
		return menu;
	}


	
	
}