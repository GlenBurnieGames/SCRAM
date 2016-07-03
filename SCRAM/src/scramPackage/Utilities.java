/**
 * 
 */
package scramPackage;

import javax.swing.ImageIcon;

/**
 * @author Girstblart
 *
 */
public class Utilities
{	
	public Utilities()
	{
		
	}
	
    public static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Scram.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
