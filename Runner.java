import javax.swing.JOptionPane;
//sudo chmod 777 "thejarname".jar

//ll
public class Runner {
	
	public static Double goAgain;
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome my created by Brenne Couson 9-14 3A" );
		
		// Instantiate each class
		
		Circle myCircle = new Circle();
		Rectangle myRectangle = new Rectangle();
		Triangle myTriangle = new Triangle();
		Cuboid myCuboid = new Cuboid();
		Sphere mySphere = new Sphere();
		goAgain = 1.0;
		
		while (goAgain == 1.0) {
			String answer = JOptionPane.showInputDialog("Please enter your selection: Triangle, Circle, Rectangle, Cuboid, and Sphere");
			JOptionPane.showMessageDialog(null, answer);
			
			//When comparing strings, == is unreliable - use String class methods
			if(answer.equals("Triangle")||answer.equals("triangle")) {
				myTriangle.setVarsToZero();
				myTriangle.setSides();
				myTriangle.clacPerimeter();
				myTriangle.clacArea();
				myTriangle.showVars();
				myTriangle.clacAngles();
				myTriangle.showVarsAngles();
			}
			else if(answer.equals("Circle")||answer.equals("circle")) {
				myCircle.getradius();
				myCircle.calcCircum();
				myCircle.clacArea();
			}
			else if(answer.equals("Cuboid")||answer.equals("cuboid")) {
				myCuboid.getside();
				myCuboid.clacVolume();
				myCuboid.clacSufaceArea();
			}
			else if(answer.equals("Sphere")||answer.equals("Sphere")) {
				mySphere.getradius();
				mySphere.clacVolume();
				mySphere.clacSufaceArea();
			}
			else {
				myRectangle.getSides();
				myRectangle.calcPerimeter();
				myRectangle.calcDiagonal();
				myRectangle.clacArea();
			}
			goAgain = Double.parseDouble(JOptionPane.showInputDialog("Please enter 1 to continue. Eneter 0 to end "));
		}//end of while
		JOptionPane.showMessageDialog(null, "ok bye");
	}//end of main
}//end of runner
