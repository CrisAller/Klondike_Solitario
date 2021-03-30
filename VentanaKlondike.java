package Klondike;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Point;
import javax.swing.JLabel;

public class VentanaKlondike extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaKlondike frame = new VentanaKlondike();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaKlondike() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 100, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		
		this.setTitle("KLONDIKE by me");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setExtendedState(MAXIMIZED_BOTH);
		Toolkit ventana = Toolkit.getDefaultToolkit();
		Dimension ventanaKlondike = ventana.getScreenSize();
		this.setSize(ventanaKlondike.width/2, ventanaKlondike.height/2);
		this.setLocation(ventanaKlondike.width/4,ventanaKlondike.height/4);
//		InterfaceMazos interfaceMazos = new InterfaceMazos(ventanaKlondike.width/2, ventanaKlondike.height/2);
//		add(interfaceMazos);
	}

}
