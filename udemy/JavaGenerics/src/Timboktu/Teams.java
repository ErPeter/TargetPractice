package Timboktu;

public class Teams<T extends Player> implements Comparable<Teams<T>> {
    private String name;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    public Teams(String name, int won, int lost, int tied) {

    }

    public Teams(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void match(Teams<T> opponentTeam, int opponentScore, int ourScore){
        if(opponentScore > ourScore){
            opponentTeam.won = opponentTeam.won +3;
            this.lost++;
        } else if(opponentScore == ourScore){
            opponentTeam.tied++;
            this.tied++;
        }else{
            this.won = this.won +3;
            opponentTeam.lost++;
        }
    }

    public int ranking(){
        return won + tied;
    }

    @Override
    public int compareTo(Teams<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        }else{
            return 0;
        }
    }
}
