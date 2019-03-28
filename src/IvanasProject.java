import javax.swing.JOptionPane;

public class IvanasProject {
public static void main(String[] args) {
	
	
	
	for (int i = 0; i < 5; i++) {
		String ok = JOptionPane.showInputDialog("What is your books title?");
		
		
	if(ok.equals ("Hey")) {
		bookA();		
	}
	
	else if(ok.equals ("Hi")) {
		bookA();	
	}
	
	else {
		System.exit(0);
	
	}
	
	
	}
	
	
}
	
	

static void bookA() {
JOptionPane.showMessageDialog(null, "Year of publish:______/ Publisher:______/ Author:_______");
}
static void bookB() {
JOptionPane.showMessageDialog(null, "Year of publish:______/ Publisher:______/ Author:_______");
}
static void bookC() {
JOptionPane.showMessageDialog(null, "Year of publish:______/ Publisher:______/ Author:_______");
}
static void bookD() {
JOptionPane.showMessageDialog(null, "Year of publish:______/ Publisher:______/ Author:_______");
}









}
