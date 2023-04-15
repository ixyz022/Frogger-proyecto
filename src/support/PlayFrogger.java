// PlayFrogger.java
package src.support;

import src.core.FroggerComponent;

import javax.swing.*;
import java.awt.*;

public class PlayFrogger extends JFrame {
	public PlayFrogger() {
		getContentPane().setLayout(new FlowLayout());
		add(new FroggerComponent());
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}