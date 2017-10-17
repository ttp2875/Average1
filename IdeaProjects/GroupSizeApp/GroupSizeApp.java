import javax.swing.JOptionPane;
	public class GroupSizeApp {
	public static void main(String [] args) {

	String input = JOptionPane.showInputDialog("Numbers of people ");
	int people = Integer.parseInt(input);
	
	if (people == 10) {
	JOptionPane.showMessageDialog(null,"10 players total. Group size " + people/2);
	}else if (people > 10){
	JOptionPane.showMessageDialog(null,input + "  players total.Group size " + people/2);
	}else if (people < 10){
	JOptionPane.showMessageDialog(null,input + "  players total.Group size " + people/3);
	}else if (people < 3){
	JOptionPane.showMessageDialog(null,"The number of people has to be at least 3");
		}
	}
}
