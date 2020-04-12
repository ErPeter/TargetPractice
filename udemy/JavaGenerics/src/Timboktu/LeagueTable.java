package Timboktu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeagueTable< T extends Teams> {
    public String name;
    private ArrayList<T> teams = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if(!this.teams.contains(team)){
            this.teams.add(team);
            return true;
        }else{
            System.out.println("Team: " + team.getName() + " is already in the league");
            return false;
        }
    }

    public void leagueTable(){
        Collections.sort(teams);
        for(T t : teams){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}
