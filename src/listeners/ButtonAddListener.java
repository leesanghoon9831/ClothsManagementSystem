package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ClothsAdder;
import gui.ClothsViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		ClothsAdder adder = frame.getClothsadder();
		frame.setupPanel(adder);
	}
}
