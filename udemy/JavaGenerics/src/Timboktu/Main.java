package Timboktu;
//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LeagueTable<Teams<Football>> premierLeague = new LeagueTable<>("Premier League");

        Teams<Football> chelsea = new Teams<>("Chelsea");
        Teams<Football> arsenal = new Teams<>("Arsenal");
//        Teams<BasketBall> bulls = new Teams<>("Chicago Bulls");


        premierLeague.addTeam(chelsea);
        premierLeague.addTeam(arsenal);

        chelsea.match(arsenal, 1, 1);
        arsenal.match(chelsea, 1, 3);

//        premierLeague.addTeam(bulls);
        premierLeague.leagueTable();
    }
}
