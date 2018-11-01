import javax.swing.JOptionPane;

public class Rectangle {
	
	private double height, length;
	private double perimeter;
	private double area;
	private double diagonal;
	
	
	public void getSides() {
		height = Double.parseDouble(JOptionPane.showInputDialog("Please enter value for height:"));
		length = Double.parseDouble(JOptionPane.showInputDialog("Please enter value for length"));
	} //end of setSides
	public void calcPerimeter() {
		perimeter = height*2 +length*2;
	}
	public void calcDiagonal() {
		diagonal = Math.sqrt(height*height + length*length);
	}
	public void clacArea() {
		area = height*length;
		JOptionPane.showMessageDialog(null, "Area = " + area+ "\nPerimeter = " + perimeter + "\nDiagonal = " + diagonal);
	}
	

}
