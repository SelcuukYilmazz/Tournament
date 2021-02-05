//package quiz2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Voleycalculate extends Sports {
    /*Voleybol Puan Hesaplama*/
    public void volleyranks(ArrayList<ArrayList<String>> volleyballl) throws IOException {
        int ranking = 0;
        /*Voleybol Objelerini Oluşturuyoruz ve ArrayListe Atıyoruz*/
        for(int i = 0;i<volleyballl.size();i++){
            volleyball.add(new Volleyball(volleyballl.get(i).get(0),"V",0,0,0,0,0,0,0,0));
            volleyball.add(new Volleyball(volleyballl.get(i).get(2),"V",0,0,0,0,0,0,0,0));

        }
        /*Kendini Tekrar Eden Objeleri Siliyoruz*/
        Collections.sort(volleyball, Comparator.comparing(Volleyball::getTeamsname));
        for(int i =0;i<volleyball.size();i++){
            if(i+1 != volleyball.size()){
                if(volleyball.get(i).getTeamsname().equals(volleyball.get(i+1).getTeamsname())){
                    volleyball.remove(i);
                    i = -1;}
            }
        }
        /*Voleybol Puan Tablosu*/
        for(int i = 0;i<volleyballl.size();i++) {
            if (Integer.parseInt(volleyballl.get(i).get(1)) - Integer.parseInt(volleyballl.get(i).get(3)) >= 2) {
                for (int k = 0; k < volleyball.size(); k++) {
                    if (volleyballl.get(i).get(0).equals(volleyball.get(k).getTeamsname())) {
                        int result = volleyball.get(k).getTeamsscore() + 3;
                        int win = volleyball.get(k).getWin() + 1;
                        int playedmatch = volleyball.get(k).getPlayedmatch() + 1;
                        int matchscore = volleyball.get(k).getMatchscore() + Integer.parseInt(volleyballl.get(i).get(1));
                        int rivalmatchscore = volleyball.get(k).getRivalmatchscore() + Integer.parseInt(volleyballl.get(i).get(3));
                        volleyball.get(k).setRivalmatchscore(rivalmatchscore);
                        volleyball.get(k).setMatchscore(matchscore);
                        volleyball.get(k).setPlayedmatch(playedmatch);
                        volleyball.get(k).setWin(win);
                        volleyball.get(k).setTeamsscore(result);
                    }
                }
                for (int k = 0; k < volleyball.size(); k++){
                    if(volleyballl.get(i).get(2).equals(volleyball.get(k).getTeamsname())){
                        int loss = volleyball.get(k).getLoss() + 1;
                        int playedmatch = volleyball.get(k).getPlayedmatch() + 1;
                        int matchscore = volleyball.get(k).getMatchscore() + Integer.parseInt(volleyballl.get(i).get(3));
                        int rivalmatchscore = volleyball.get(k).getRivalmatchscore() + Integer.parseInt(volleyballl.get(i).get(1));
                        volleyball.get(k).setRivalmatchscore(rivalmatchscore);
                        volleyball.get(k).setMatchscore(matchscore);
                        volleyball.get(k).setPlayedmatch(playedmatch);
                        volleyball.get(k).setLoss(loss);
                    }
                }

            } else if (Integer.parseInt(volleyballl.get(i).get(3)) - Integer.parseInt(volleyballl.get(i).get(1)) >= 2) {
                for (int k = 0; k < volleyball.size(); k++) {
                    if (volleyballl.get(i).get(2).equals(volleyball.get(k).getTeamsname())) {
                        int result = volleyball.get(k).getTeamsscore() + 3;
                        int win = volleyball.get(k).getWin() + 1;
                        int playedmatch = volleyball.get(k).getPlayedmatch() + 1;
                        int matchscore = volleyball.get(k).getMatchscore() + Integer.parseInt(volleyballl.get(i).get(3));
                        int rivalmatchscore = volleyball.get(k).getRivalmatchscore() + Integer.parseInt(volleyballl.get(i).get(1));
                        volleyball.get(k).setRivalmatchscore(rivalmatchscore);
                        volleyball.get(k).setMatchscore(matchscore);
                        volleyball.get(k).setPlayedmatch(playedmatch);
                        volleyball.get(k).setWin(win);
                        volleyball.get(k).setTeamsscore(result);
                    }

                }
                for (int k = 0; k < volleyball.size(); k++){
                    if(volleyballl.get(i).get(0).equals(volleyball.get(k).getTeamsname())){
                        int loss = volleyball.get(k).getLoss() + 1;
                        int playedmatch = volleyball.get(k).getPlayedmatch() + 1;
                        int matchscore = volleyball.get(k).getMatchscore() + Integer.parseInt(volleyballl.get(i).get(1));
                        int rivalmatchscore = volleyball.get(k).getRivalmatchscore() + Integer.parseInt(volleyballl.get(i).get(3));
                        volleyball.get(k).setRivalmatchscore(rivalmatchscore);
                        volleyball.get(k).setMatchscore(matchscore);
                        volleyball.get(k).setPlayedmatch(playedmatch);
                        volleyball.get(k).setLoss(loss);
                    }
                }
            } else if (Integer.parseInt(volleyballl.get(i).get(1)) - Integer.parseInt(volleyballl.get(i).get(3)) == 1) {
                for (int k = 0; k < volleyball.size(); k++) {
                    if (volleyballl.get(i).get(0).equals(volleyball.get(k).getTeamsname())) {
                        int result = volleyball.get(k).getTeamsscore() + 2;
                        int win = volleyball.get(k).getWin() + 1;
                        int playedmatch = volleyball.get(k).getPlayedmatch() + 1;
                        int matchscore = volleyball.get(k).getMatchscore() + Integer.parseInt(volleyballl.get(i).get(1));
                        int rivalmatchscore = volleyball.get(k).getRivalmatchscore() + Integer.parseInt(volleyballl.get(i).get(3));
                        volleyball.get(k).setRivalmatchscore(rivalmatchscore);
                        volleyball.get(k).setMatchscore(matchscore);
                        volleyball.get(k).setPlayedmatch(playedmatch);
                        volleyball.get(k).setWin(win);
                        volleyball.get(k).setTeamsscore(result);
                    }
                }
                for (int k = 0 ; k < volleyball.size(); k++){
                    if (volleyballl.get(i).get(2).equals(volleyball.get(k).getTeamsname())) {
                        int result = volleyball.get(k).getTeamsscore() + 1;
                        int loss = volleyball.get(k).getLoss() + 1;
                        int playedmatch = volleyball.get(k).getPlayedmatch() + 1;
                        int matchscore = volleyball.get(k).getMatchscore() + Integer.parseInt(volleyballl.get(i).get(3));
                        int rivalmatchscore = volleyball.get(k).getRivalmatchscore() + Integer.parseInt(volleyballl.get(i).get(1));
                        volleyball.get(k).setRivalmatchscore(rivalmatchscore);
                        volleyball.get(k).setMatchscore(matchscore);
                        volleyball.get(k).setPlayedmatch(playedmatch);
                        volleyball.get(k).setLoss(loss);
                        volleyball.get(k).setTeamsscore(result);

                    }
                }
            } else if (Integer.parseInt(volleyballl.get(i).get(3)) - Integer.parseInt(volleyballl.get(i).get(1)) == 1) {
                for (int k = 0; k < volleyball.size(); k++) {
                    if (volleyballl.get(i).get(2).equals(volleyball.get(k).getTeamsname())) {
                        int result = volleyball.get(k).getTeamsscore() + 2;
                        int win = volleyball.get(k).getWin() + 1;
                        int playedmatch = volleyball.get(k).getPlayedmatch() + 1;
                        int matchscore = volleyball.get(k).getMatchscore() + Integer.parseInt(volleyballl.get(i).get(3));
                        int rivalmatchscore = volleyball.get(k).getRivalmatchscore() + Integer.parseInt(volleyballl.get(i).get(1));
                        volleyball.get(k).setRivalmatchscore(rivalmatchscore);
                        volleyball.get(k).setMatchscore(matchscore);
                        volleyball.get(k).setPlayedmatch(playedmatch);
                        volleyball.get(k).setWin(win);
                        volleyball.get(k).setTeamsscore(result);
                    }
                }
                for (int k = 0 ; k < volleyball.size(); k++){
                    if (volleyballl.get(i).get(0).equals(volleyball.get(k).getTeamsname())) {
                        int result = volleyball.get(k).getTeamsscore() + 1;
                        int loss = volleyball.get(k).getLoss() + 1;
                        int playedmatch = volleyball.get(k).getPlayedmatch() + 1;
                        int matchscore = volleyball.get(k).getMatchscore() + Integer.parseInt(volleyballl.get(i).get(1));
                        int rivalmatchscore = volleyball.get(k).getRivalmatchscore() + Integer.parseInt(volleyballl.get(i).get(3));
                        volleyball.get(k).setRivalmatchscore(rivalmatchscore);
                        volleyball.get(k).setMatchscore(matchscore);
                        volleyball.get(k).setPlayedmatch(playedmatch);
                        volleyball.get(k).setLoss(loss);
                        volleyball.get(k).setTeamsscore(result);
                    }
                }

            }

        }
        /*Çıktı Aldığımız Kısım*/
        for(int i = 0; i < volleyball.size();i++){
            int difference = volleyball.get(i).getDifference() + volleyball.get(i).getMatchscore() - volleyball.get(i).getRivalmatchscore();
            volleyball.get(i).setDifference(difference);
        }
        /*Sıralama Yaptığımız Kısım*/
        Collections.sort(volleyball, Comparator.comparing(Volleyball::getDifference));
        Collections.sort(volleyball, Comparator.comparing(Volleyball::getTeamsscore));
        for(int i = volleyball.size()-1;i > -1;i--){
            ranking = ranking + 1;
            FileWriter fileWriter = new FileWriter("Volleyball.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(ranking+".\t"+volleyball.get(i).getTeamsname()+"\t"+volleyball.get(i).getPlayedmatch()+"\t"+volleyball.get(i).getWin()+"\t"+volleyball.get(i).getEven()+"\t"+volleyball.get(i).getLoss()+"\t"+volleyball.get(i).getMatchscore()+":"+volleyball.get(i).getRivalmatchscore()+"\t"+volleyball.get(i).getTeamsscore());
            printWriter.close();
        }
    }
}
