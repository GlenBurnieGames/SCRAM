package scramPackage;

import java.awt.*;
import javax.swing.*;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Scram implements ActionListener
{
	Component c1, c2, c3;
	JButton b1, b2, b3;
	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{	
		System.out.println("Working dir:  " + System.getProperty("user.dir"));
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Scram scram = new Scram();
					scram.frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Scram()
	{
		initialize();
		JPanel r = new JPanel();
		b1 = new JButton("Characters");
		b2 = new JButton("Skills");
		b3 = new JButton("Push it R");
		r.add(b1);
		r.add(b2);
		r.add(b3);
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
		r.setPreferredSize(new Dimension(100,100));
		r.setBackground(new Color(255,80,40));
		frame.add(r, BorderLayout.WEST);
		c1 = new TPaneChar();
		c2 = TabbedPane1();
		c3 = TabbedPane2();
		frame.add(c1, BorderLayout.CENTER);
		frame.add(c2, BorderLayout.CENTER);
		frame.add(c3, BorderLayout.CENTER);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Scram.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    
    public JComponent TabbedPane1() {
        
        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = createImageIcon("images/middle.gif");
         
        JComponent panel1 = blue();
        tabbedPane.addTab("Tab 1", icon, panel1,
                "Does nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
         
        JComponent panel2 = orange();
        tabbedPane.addTab("Tab 2", icon, panel2,
                "Does twice as much nothing");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
         
        JComponent panel3 = green();
        tabbedPane.addTab("Tab 3", icon, panel3,
                "Still does nothing");
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
         
        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        return tabbedPane;
    }
    
public JComponent TabbedPane2() {
        
        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = createImageIcon("images/middle.gif");
         
        JComponent panel1 = green();
        tabbedPane.addTab("Tab 1", icon, panel1,
                "Does nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
         
        JComponent panel2 = blue();
        tabbedPane.addTab("Tab 2", icon, panel2,
                "Does twice as much nothing");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
         
        JComponent panel3 = orange();
        tabbedPane.addTab("Tab 3", icon, panel3,
                "Still does nothing");
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
         
        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        return tabbedPane;
    }
    
	private JPanel blue()
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

	private JPanel orange()
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
		t.setBackground(new Color(255,204,51));
		return t;
	}
	

	private JPanel green()
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
		t.setBackground(new Color(0,255,0));
		return t;
	}

	@Override
	public void actionPerformed(ActionEvent evt)
	{
		Object src = evt.getSource();
	    if (src == b1) 
	    {
	    	frame.remove(c2);
	    	frame.remove(c3);
	    	frame.add(c1, BorderLayout.CENTER);
	    	frame.validate();
	    	frame.repaint();
	    } 
	    else if (src == b2) 
	    {
	    	frame.remove(c1);
	    	frame.remove(c3);
	    	frame.add(c2, BorderLayout.CENTER);
	    	frame.validate();
	    	frame.repaint();
	    }
	    else if (src == b3) 
	    {
	    	frame.remove(c2);
	    	frame.remove(c1);
	    	frame.add(c3, BorderLayout.CENTER);
	    	frame.validate();
	    	frame.repaint();
	    }
	    
		
	}
	
}
