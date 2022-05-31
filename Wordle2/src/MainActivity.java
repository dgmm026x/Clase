import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainActivity {

	private JFrame frmWordle;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainActivity window = new MainActivity();
					window.frmWordle.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainActivity() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWordle = new JFrame();
		frmWordle.setTitle("Wordle2");
		frmWordle.setResizable(false);
		frmWordle.getContentPane().setBackground(Color.GRAY);
		frmWordle.getContentPane().setLayout(null);
		
		JButton boton1 = new JButton("Nueva partida");
		boton1.setBackground(Color.WHITE);
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton1.setBounds(10, 120, 120, 30);
		frmWordle.getContentPane().add(boton1);
		
		JButton boton2 = new JButton("Comprobar");
		boton2.setBackground(Color.WHITE);
		boton2.setBounds(304, 120, 120, 30);
		frmWordle.getContentPane().add(boton2);
		
		JLabel pantalla1 = new JLabel("A");
		pantalla1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		pantalla1.setHorizontalAlignment(SwingConstants.CENTER);
		pantalla1.setBackground(Color.WHITE);
		pantalla1.setBounds(47, 10, 60, 90);
		frmWordle.getContentPane().add(pantalla1);
		
		JLabel pantalla2 = new JLabel("A");
		pantalla2.setHorizontalAlignment(SwingConstants.CENTER);
		pantalla2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		pantalla2.setBackground(Color.WHITE);
		pantalla2.setBounds(117, 10, 60, 90);
		frmWordle.getContentPane().add(pantalla2);
		
		JLabel pantalla3 = new JLabel("A");
		pantalla3.setHorizontalAlignment(SwingConstants.CENTER);
		pantalla3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		pantalla3.setBackground(Color.WHITE);
		pantalla3.setBounds(187, 10, 60, 90);
		frmWordle.getContentPane().add(pantalla3);
		
		JLabel pantalla4 = new JLabel("A");
		pantalla4.setHorizontalAlignment(SwingConstants.CENTER);
		pantalla4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		pantalla4.setBackground(Color.WHITE);
		pantalla4.setBounds(257, 10, 60, 90);
		frmWordle.getContentPane().add(pantalla4);
		
		JLabel pantalla5 = new JLabel("A");
		pantalla5.setHorizontalAlignment(SwingConstants.CENTER);
		pantalla5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		pantalla5.setBackground(Color.WHITE);
		pantalla5.setBounds(327, 10, 60, 90);
		frmWordle.getContentPane().add(pantalla5);
		frmWordle.setBackground(Color.BLACK);
		frmWordle.setBounds(100, 100, 450, 200);
		frmWordle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
