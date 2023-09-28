import java.util.ArrayList;


public class GameMenu{
	private ArrayList<String> actions = new ArrayList<String>();

	public GameMenu(ArrayList<String>arrayList){
this.actions = arrayList;
}

public void displayMenu(){
	for(String action : actions){
		System.out.println(action);
	}
}
}