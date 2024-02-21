package FixtureGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Team> teamList = new ArrayList<>();

        Team t1 = new Team("Galatasaray",1);
        Team t2 = new Team("Fenerbahçe",2);
        Team t3 = new Team("Beşiktaş JK",3);
        Team t4 = new Team("Trabzonspor",4);
        Team t5 = new Team("Kasımpaşa FK",5);
        Team t6 = new Team("Konyaspor",6);
        teamList.add(t1);
        teamList.add(t2);
        teamList.add(t3);
        teamList.add(t4);
        teamList.add(t5);
        teamList.add(t6);

        ArrayList<String> fixture = new ArrayList<>();
        if(teamList.size() % 2 != 0) {
            teamList.add(new Team("BAY", 0));
        }
        int totalWeeks = teamList.size() - 1;
        int matchesPerWeek = teamList.size() / 2;

        ArrayList<Team> homeTeams = new ArrayList<>(teamList.subList(0,matchesPerWeek));
        ArrayList<Team> awayTeams = new ArrayList<>(teamList.subList(matchesPerWeek,teamList.size()));

        for(int week = 1; week < totalWeeks + 1; week++) {
            for (int match = 0; match < matchesPerWeek; match++) {
                Team homeTeam = homeTeams.get(match);
                Team awayTeam = awayTeams.get(match);
                String matchPair = homeTeam.getName() + " vs " + awayTeam.getName();
                fixture.add(matchPair);
            }
            Team lastHomeTeam = homeTeams.remove(homeTeams.size() - 1);
            Team firstAwayTeam = awayTeams.remove(0);
            awayTeams.add(lastHomeTeam);
            homeTeams.add(firstAwayTeam);

            int rounds = 0;
            for (String match : fixture) {
                System.out.println("Week " + rounds + ": " + match);
                if (rounds % (teamList.size() / 2) == 0) {
                    rounds++;
                }
            }
        }


    }
}
