package control.eventos;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import control.Bridge;

public class ActionIrMarca implements MouseListener {
	
	Bridge bridge;
	
	public ActionIrMarca(Bridge bridge) {
		this.bridge = bridge;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.bridge.irAMarca();
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
