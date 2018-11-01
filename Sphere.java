import javax.swing.JOptionPane;

public class Sphere {
	private double radius;
	private double volume;
	private double surfaceArea;

	public void getradius() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter value for the Radius:"));
		
	}

	public void clacVolume() {
		volume = Math.PI*(4/3)*radius*radius*radius;
		
	}

	public void clacSufaceArea() {
		surfaceArea = Math.PI*4*radius*radius;
		JOptionPane.showMessageDialog(null, "Volume = " + volume+ "\nSurface Area = " + surfaceArea);
	}

}
