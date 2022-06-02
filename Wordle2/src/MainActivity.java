/////////////////////////////////////////////////////////////////



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
import java.sql.SQLException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;



/////////////////////////////////////////////////////////////////



public class MainActivity {

	private JFrame frmWordle;
	private JTextField Pantalla1;
	private JTextField Pantalla2;
	private JTextField Pantalla3;
	private JTextField Pantalla4;
	private JTextField Pantalla5;
	
	
	
	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					MainActivity window = new MainActivity();
					window.frmWordle.setVisible(true);
				}
				
				catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
/////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	
	
	
	public MainActivity() throws SQLException {
		
		initialize();
		
		Wordle wordle = new Wordle();
		
		wordle.Juego();
	}
	
	
	
/////////////////////////////////////////////////////////////////
	
	
	
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
		boton1.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		boton1.setForeground(Color.WHITE);
		boton1.setBackground(Color.GRAY);
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton1.setBounds(10, 112, 120, 30);
		frmWordle.getContentPane().add(boton1);
		
		JButton boton2 = new JButton("Comprobar");
		boton2.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		boton2.setForeground(Color.WHITE);
		boton2.setBackground(Color.GRAY);
		boton2.setBounds(230, 112, 120, 30);
		frmWordle.getContentPane().add(boton2);
		
		Pantalla1 = new JTextField();
		Pantalla1.setText("1");
		Pantalla1.setHorizontalAlignment(SwingConstants.CENTER);
		Pantalla1.setFont(new Font("Nirmala UI", Font.PLAIN, 32));
		Pantalla1.setBackground(Color.LIGHT_GRAY);
		Pantalla1.setColumns(10);
		Pantalla1.setBounds(10, 10, 60, 90);
		frmWordle.getContentPane().add(Pantalla1);
		
		Pantalla2 = new JTextField();
		Pantalla2.setText("2");
		Pantalla2.setHorizontalAlignment(SwingConstants.CENTER);
		Pantalla2.setFont(new Font("Nirmala UI", Font.PLAIN, 32));
		Pantalla2.setColumns(10);
		Pantalla2.setBackground(Color.LIGHT_GRAY);
		Pantalla2.setBounds(80, 10, 60, 90);
		frmWordle.getContentPane().add(Pantalla2);
		
		Pantalla3 = new JTextField();
		Pantalla3.setText("3");
		Pantalla3.setHorizontalAlignment(SwingConstants.CENTER);
		Pantalla3.setFont(new Font("Nirmala UI", Font.PLAIN, 32));
		Pantalla3.setColumns(10);
		Pantalla3.setBackground(Color.LIGHT_GRAY);
		Pantalla3.setBounds(150, 10, 60, 90);
		frmWordle.getContentPane().add(Pantalla3);
		
		Pantalla4 = new JTextField();
		Pantalla4.setText("4");
		Pantalla4.setHorizontalAlignment(SwingConstants.CENTER);
		Pantalla4.setFont(new Font("Nirmala UI", Font.PLAIN, 32));
		Pantalla4.setColumns(10);
		Pantalla4.setBackground(Color.LIGHT_GRAY);
		Pantalla4.setBounds(220, 10, 60, 90);
		frmWordle.getContentPane().add(Pantalla4);
		
		Pantalla5 = new JTextField();
		Pantalla5.setText("5");
		Pantalla5.setHorizontalAlignment(SwingConstants.CENTER);
		Pantalla5.setFont(new Font("Nirmala UI", Font.PLAIN, 32));
		Pantalla5.setColumns(10);
		Pantalla5.setBackground(Color.LIGHT_GRAY);
		Pantalla5.setBounds(290, 10, 60, 90);
		frmWordle.getContentPane().add(Pantalla5);
		
		frmWordle.setBackground(Color.BLACK);
		frmWordle.setBounds(100, 100, 375, 190);
		frmWordle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}



/////////////////////////////////////////////////////////////////