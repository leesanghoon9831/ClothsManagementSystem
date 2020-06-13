package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cloths.ClothsInput;
import manager.ClothsManager;

public class ClothsViewer extends JPanel{
	
	WindowFrame frame;
	ClothsManager clothsManager;
	
	public ClothsViewer(WindowFrame frame, ClothsManager clothsManager) {
		this.frame = frame;
		this.clothsManager = clothsManager;
		
		System.out.println("****" + clothsManager.size() + "****");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Kind");
		model.addColumn("Price");
		
		for(int i=0; i<clothsManager.size(); i++) {
			Vector row = new Vector();
			ClothsInput ci = clothsManager.get(i);
			row.add(ci.getId());
			row.add(ci.getName());
			row.add(ci.getKind());
			row.add(ci.getPrice());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);	
	}
}
