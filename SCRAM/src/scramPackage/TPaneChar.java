package scramPackage;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TPaneChar extends JTabbedPane
{
	Utilities util = new Utilities();
	
	
	public TPaneChar()
	{
		ImageIcon icon = util.createImageIcon("fire.jpg");
		
		JComponent panel1 = stepOne();
	    this.addTab("Priorities", icon, panel1, "Priorities");
	    this.setMnemonicAt(0, KeyEvent.VK_1);

		JComponent panel2 = stepTwo();
	    this.addTab("Skills", icon, panel2, "Choose Skills");
	    this.setMnemonicAt(1, KeyEvent.VK_2);
	    
	    //The following line enables to use scrolling tabs.
	    this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	}
	
	private JPanel stepOne()
	{		
		JPanel t = new JPanel(new GridBagLayout());
	
		JButton b1 = new JButton("Push it P");
		JLabel l1 = new JLabel("hello1"); 
		JLabel l2 = new JLabel("hello2");
		JLabel l3 = new JLabel("hello3");
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(50,50,50,50);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		t.add(l1, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		t.add(l2, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		t.add(l3, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		t.add(b1, gbc);
		t.setBackground(new Color(51,153,255));
		return t;
	}
	
	private JPanel stepTwo()
	{		
		JPanel t = new JPanel(new GridBagLayout());
	
		JButton b1 = new JButton("Push it P");
		JLabel l1 = new JLabel("hello1"); 
		JLabel l2 = new JLabel("hello2");
		JLabel l3 = new JLabel("hello3");
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(50,50,50,50);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		t.add(l1, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		t.add(l2, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		t.add(l3, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		t.add(b1, gbc);
		t.setBackground(new Color(51,153,255));
		return t;
	}
	
}