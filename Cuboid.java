import javax.swing.JOptionPane;

public class Cuboid {
	
	private double height, length, width;
	private double surfaceArea;
	private double volume;

	public void getside() {
		height = Double.parseDouble(JOptionPane.showInputDialog("Please enter value for height:"));
		length = Double.parseDouble(JOptionPane.showInputDialog("Please enter value for length"));
		width = Double.parseDouble(JOptionPane.showInputDialog("Please enter value for width"));
		
	}

	public void clacVolume() {
		volume = height*length*width;
		
	} //end of clacVolume

	public void clacSufaceArea() {
		surfaceArea = 2*height*width + 2*width*length +2*height*length;
		JOptionPane.showMessageDialog(null, "Volume = " + volume+ "\nSurface Area = " + surfaceArea);
	}

}
