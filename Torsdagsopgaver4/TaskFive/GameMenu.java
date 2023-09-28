import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{
	
	private ArrayList<String> actions = new ArrayList<String>();

	public GameMenu(ArrayList<String>arrayList){
this.actions = arrayList;
}

public void displayMenu(){
	int menuNum = 1;
	for(String action : actions){
		System.out.println(menuNum + ": " + action);
		menuNum++;
	}
}
public String getAction(){
Scanner sc = new Scanner(System.in);

System.out.println("Type a number to choose an action");
displayMenu();

String choice = sc.nextLine();
sc.close();

return choice;
}

}
