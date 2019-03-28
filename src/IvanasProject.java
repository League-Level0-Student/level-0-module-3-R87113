import javax.swing.JOptionPane;

public class IvanasProject {
public static void main(String[] args) {
	
	
	//Can change the 5 to however many times you want it to repeat
	for (int i = 0; i < 5; i++) {
		String ok = JOptionPane.showInputDialog("What is your books title?");
		
	//Change the Hey to an actual title	
	if(ok.equals ("Hey")) {
		bookA();		
	}
	//Same here, change Hi to an actual title, so on so forth
	else if(ok.equals ("Hi")) {
		bookA();	
	}
	
	else if(ok.equals("Yea")){
		bookC();
	}
	
	else if(ok.equals("Nah")){
		bookD();
	}
	//this basically means that if its not a existing book, it just closes the program
	else {
		System.exit(0);
	JOptionPane.showMessageDialog(null, "Book not found!");
	}
	
	
	}
	
	
}
	
	
//Create several of these, change the stuff in the quotes(blue) to information you want to be displayed
static void bookA() {
JOptionPane.showMessageDialog(null, "Year of publish:1/ Publisher:______/ Author:_______");
}
static void bookB() {
JOptionPane.showMessageDialog(null, "Year of publish:2/ Publisher:______/ Author:_______");
}
static void bookC() {
JOptionPane.showMessageDialog(null, "Year of publish:3/ Publisher:______/ Author:_______");
}
static void bookD() {
JOptionPane.showMessageDialog(null, "Year of publish:4/ Publisher:______/ Author:_______");
}



}
