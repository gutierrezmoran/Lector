package vista;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class UI extends JFrame {

	private JPanel contentPane;
	protected JTextArea lectura;
	protected JButton btnAtras;
	protected JButton btnMarcar;
	protected JButton btnIrAMarca;
	protected JButton btnAlante;
	protected JLabel lblNumeroPagina;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JPanel panel_2;
	protected JLabel marca;

	public UI() {
		setBounds(new Rectangle(0, 0, 500, 700));
		setTitle("Kindle");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(30, 30, 20, 30));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 5));
		
		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlHighlight);
		panel.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		lblNumeroPagina = new JLabel("");
		panel_2.add(lblNumeroPagina, BorderLayout.CENTER);
		lblNumeroPagina.setBackground(Color.WHITE);
		lblNumeroPagina.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNumeroPagina.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		marca = new JLabel("");
		marca.setBackground(SystemColor.activeCaption);
		marca.setFont(new Font("Tahoma", Font.BOLD, 10));
		marca.setOpaque(true);
		marca.setBorder(new EmptyBorder(0, 10, 0, 10));
		panel_2.add(marca, BorderLayout.EAST);
		
		panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setPreferredSize(new Dimension(10, 40));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 0, 5, 0));
		btnAtras = new JButton("<<");		
		btnAtras.setContentAreaFilled(false);
		btnAtras.setForeground(Color.GRAY);
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtras.setBackground(Color.DARK_GRAY);
		btnAtras.setFocusPainted(false);
		btnAtras.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel_1.add(btnAtras);
		btnMarcar = new JButton("Marcar");		
		btnMarcar.setContentAreaFilled(false);
		btnMarcar.setForeground(Color.GRAY);
		btnMarcar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMarcar.setBackground(Color.DARK_GRAY);
		btnMarcar.setFocusPainted(false);
		btnMarcar.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel_1.add(btnMarcar);
		btnIrAMarca = new JButton("Ir a Marca");
		btnIrAMarca.setContentAreaFilled(false);
		btnIrAMarca.setForeground(Color.GRAY);
		btnIrAMarca.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIrAMarca.setBackground(Color.DARK_GRAY);
		btnIrAMarca.setFocusPainted(false);
		btnIrAMarca.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel_1.add(btnIrAMarca);
		btnAlante = new JButton(">>");
		btnAlante.setContentAreaFilled(false);
		btnAlante.setForeground(Color.GRAY);
		btnAlante.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAlante.setBackground(Color.DARK_GRAY);
		btnAlante.setFocusPainted(false);
		btnAlante.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel_1.add(btnAlante);
		
		lblNewLabel = new JLabel("KINDLE");
		lblNewLabel.setBorder(new EmptyBorder(25, 0, 5, 0));
		panel.add(lblNewLabel, BorderLayout.SOUTH);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		
		lectura = new JTextArea();
		lectura.setBackground(SystemColor.controlHighlight);
		lectura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lectura.setDisabledTextColor(Color.BLACK);
		lectura.setEnabled(false);
		lectura.setEditable(false);
		contentPane.add(lectura, BorderLayout.CENTER);
		lectura.setFont(new Font("Cambria", Font.PLAIN, 13));
		lectura.setBorder(new EmptyBorder(10, 10, 10, 10));
		lectura.setLineWrap(true);
		lectura.setWrapStyleWord(true);
						
	}
	
	public void marcar() {
		this.marca.setBackground(SystemColor.activeCaption);
		this.marca.setText("Marcada");
	}
	
	public void desmarcar() {
		this.marca.setBackground(SystemColor.controlHighlight);
		this.marca.setText("");
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextArea getLectura() {
		return lectura;
	}

	public JButton getBtnAtras() {
		return btnAtras;
	}

	public JButton getBtnMarcar() {
		return btnMarcar;
	}

	public JButton getBtnIrAMarca() {
		return btnIrAMarca;
	}

	public JButton getBtnAlante() {
		return btnAlante;
	}

	public JLabel getLblNumeroPagina() {
		return lblNumeroPagina;
	}

}
