package control.eventos;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import control.Bridge;

public class ActionAvanzar implements MouseListener {
	
	Bridge bridge;
	
	public ActionAvanzar(Bridge bridge) {
		this.bridge = bridge;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		this.bridge.getLibro().avanzarPagina();
		this.bridge.getAccionesLibro().actualizarPagina();
		this.bridge.getContentPane().updateUI();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		((JButton) e.getSource()).setForeground(Color.WHITE);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		((JButton) e.getSource()).setForeground(Color.GRAY);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

}
