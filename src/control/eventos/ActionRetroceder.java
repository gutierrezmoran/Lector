package control.eventos;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import control.Bridge;

public class ActionRetroceder implements MouseListener {
	
	Bridge bridge;
	
	public ActionRetroceder(Bridge bridge) {
		this.bridge = bridge;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.bridge.getLibro().retrocederPagina();
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
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
