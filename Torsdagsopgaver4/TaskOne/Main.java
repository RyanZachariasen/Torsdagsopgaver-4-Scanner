public class Main{
	public static void main(String[]args){


Team team1 = new Team("De seje");
Team team2 = new Team("De ikke så seje") ;
Team team3 = new Team("De Uovervindelige");
Team team4 = new Team("4");
Team team5 = new Team("5");
team1.setRank(30);
team2.setRank(29);
team3.setRank(28);
team4.setRank(27);
team5.setRank(26);


System.out.println(team1.toString());
System.out.println(team2.toString());
System.out.println(team3.toString());
System.out.println(team4.toString());
System.out.println(team5.toString());



	}
}