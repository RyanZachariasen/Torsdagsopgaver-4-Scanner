import java.util.ArrayList;


public class Team{
private String teamName;
private int teamRank;
private ArrayList<String> playerNames;

public Team(String teamName){
this.teamName = teamName;

}

public void setRank(int teamRank){
this.teamRank = teamRank;
}
public String toString(){
	return "Team: " + teamName + " Rank: " + teamRank;
}
}