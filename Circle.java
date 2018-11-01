import javax.swing.JOptionPane;

public class Circle {
	
	// class variables
	private double radius;
	private double circum;
	private double area;
		
	
	public void getradius() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter value for the radius:"));
	}
	
	public void calcCircum() {
		circum = Math.PI * 2 * radius;
		//JOptionPane.showMessageDialog(null, "Circumference = " + circum);
	}
	public void clacArea() {
		area = Math.PI * radius * radius;
		JOptionPane.showMessageDialog(null, "Area = " + area+ "\nCircumference = " + circum);
	}

}