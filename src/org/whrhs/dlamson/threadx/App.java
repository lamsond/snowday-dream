package org.whrhs.dlamson.threadx;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class App extends JFrame{

	public App() {
		add(new BoxCanvas());
		setSize(BoxCanvas.W, BoxCanvas.H);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {
			App app = new App();
			app.setVisible(true);
		});
	}
}
