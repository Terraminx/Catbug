
import javax.swing.JOptionPane;

public class Triangle {

	// class variables
	private double sideA, sideB, sideC;
	private double perimeter;
	private double area;

	// constructor
	public Triangle() {

	}

	// methods
	public void setVarsToZero() {

		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		area = 0.0;

	} // end of setvarstoZero
	
	public void showVars() {
		String msg = 
				"SideA, B, C = " + sideA + ", " + sideB + ", " + sideC 
				+ "\nperimeter: " + perimeter 
				+ "\ntheArea = " + area;
				
		JOptionPane.showMessageDialog(null, msg);
		
	} //end of showVars
	
	public void setSides() {
		boolean b = true;
		while (b) {
			try {
				sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter value for side A:"));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A number");
			}
		}
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter value for side B:"));
		sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter value for side C:"));
	} //end of setSides

	public void clacPerimeter() {
		perimeter = sideA + sideB + sideC;
		
	} //end of clacPerimeter

	public void clacArea() {
		double p = 0.0;
		p = (sideA + sideB + sideC)/2.0;
		area = Math.sqrt(p * (p - sideA) * ( p - sideB)*(p - sideC));
		
	}//end of clac

	public void clacAngles() {
		double cosC = 0;
		double cosA = 0;
		double cosB = 0;
		cosC = Math.acos((sideA*sideA + sideB*sideB - sideC*sideC)/(2.0*sideA*sideB));
		cosC = Math.toDegrees(cosC);
		cosA = Math.acos((sideB*sideB + sideC*sideC - sideA*sideA)/(2.0*sideC*sideB));
		cosA = Math.toDegrees(cosA);
		cosB = Math.acos((sideA*sideA + sideC*sideC - sideB*sideB)/(2.0*sideC*sideA));
		cosB = Math.toDegrees(cosB);
		JOptionPane.showMessageDialog(null, "CosA = " + cosA + "\nCosB = " + cosB + "\ncosC = " + cosC);
	}

	public void showVarsAngles() {
		
	}

} // end of methods
