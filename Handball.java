//package quiz2;

public class Handball extends Handcalculate {
    /*Handball Objesi*/
    String teamsname;
    String teamskind;
    int teamsscore;
    int playedmatch;
    int win;
    int even;
    int loss;
    int matchscore;
    int rivalmatchscore;
    int difference;
    /*Getter ve Setterlar*/
    public String getTeamsname() {
        return teamsname;
    }

    public void setTeamsname(String teamsname) {
        this.teamsname = teamsname;
    }

    public String getTeamskind() {
        return teamskind;
    }

    public void setTeamskind(String teamskind) {
        this.teamskind = teamskind;
    }

    public int getTeamsscore() {
        return teamsscore;
    }

    public void setTeamsscore(int teamsscore) {
        this.teamsscore = teamsscore;
    }

    public int getPlayedmatch() {
        return playedmatch;
    }

    public void setPlayedmatch(int playedmatch) {
        this.playedmatch = playedmatch;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getEven() {
        return even;
    }

    public void setEven(int even) {
        this.even = even;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getMatchscore() {
        return matchscore;
    }

    public void setMatchscore(int matchscore) {
        this.matchscore = matchscore;
    }

    public int getRivalmatchscore() {
        return rivalmatchscore;
    }

    public void setRivalmatchscore(int rivalmatchscore) {
        this.rivalmatchscore = rivalmatchscore;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public Handball(String teamsname, String teamskind, int teamsscore, int playedmatch, int win, int even, int loss, int matchscore, int rivalmatchscore, int difference) {
        this.teamsname = teamsname;
        this.teamskind = teamskind;
        this.teamsscore = teamsscore;
        this.playedmatch = playedmatch;
        this.win = win;
        this.even = even;
        this.loss = loss;
        this.matchscore = matchscore;
        this.rivalmatchscore = rivalmatchscore;
        this.difference = difference;
    }
}
