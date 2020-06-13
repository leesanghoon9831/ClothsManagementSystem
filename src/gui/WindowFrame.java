package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.ClothsManager;

public class WindowFrame extends JFrame{
	ClothsManager clothsManager;
	MenuSelection menuselection;
	ClothsAdder clothsadder;
	ClothsViewer clothsviewer;
	

	public WindowFrame(ClothsManager clothsManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.clothsManager = clothsManager;
		this.menuselection = new MenuSelection(this);
		this.clothsadder = new ClothsAdder(this);
		this.clothsviewer = new ClothsViewer(this, this.clothsManager);
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ClothsAdder getClothsadder() {
		return clothsadder;
	}

	public void setClothsadder(ClothsAdder clothsadder) {
		this.clothsadder = clothsadder;
	}

	public ClothsViewer getClothsviewer() {
		return clothsviewer;
	}

	public void setClothsviewer(ClothsViewer clothsviewer) {
		this.clothsviewer = clothsviewer;
	}
}
