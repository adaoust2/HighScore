package data;

import java.util.*;

import elements.GParameters;
import generator.ClubGenerator;
import generator.MoyenneGenrator;

public class Test {
	
	private static ArrayList<String> playersStats = new ArrayList<String>();

	public static void main(String[] args) {

		System.out.println("PLAYERS STATS:");
		for (int i = 0; i < playersStats.size(); i++) {
			//System.out.println(playersStats.get(i));
		}

		ClubGenerator generator = new ClubGenerator();
		ArrayList<Club> clubs = generator.generateClubs();

		Iterator it = clubs.iterator();

		while (it.hasNext()) {
			Club current = (Club) it.next();
			System.out.println("\n\n"+current.getName() + "\n");
			HashMap<String, Player> players = current.getPlayers();
			MoyenneGenrator moyGenerator = new MoyenneGenrator(current);
			System.out.println("\n   MOYENNE : "+moyGenerator.calculMoyenne() );

		}
	}

}
