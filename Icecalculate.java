//package quiz2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Icecalculate extends Sports{
    /*Buz Hokeyi Puan Hesaplama*/
    public void iceranks(ArrayList<ArrayList<String>> icehockeyy)throws IOException {
        int ranking = 0;

        /*Buz Hokeyi Objelerini Oluşturuyoruz ve ArrayListe Atıyoruz*/

        for(int i = 0;i<icehockeyy.size();i++){
            icehockey.add(new Icehockey(icehockeyy.get(i).get(0),"I",0,0,0,0,0,0,0,0));
            icehockey.add(new Icehockey(icehockeyy.get(i).get(2),"I",0,0,0,0,0,0,0,0));
        }
        /*Kendini Tekrar Eden Objeleri Siliyoruz*/
        Collections.sort(icehockey, Comparator.comparing(Icehockey::getTeamsname));
        for(int i =0;i<icehockey.size();i++){
            if(i+1 != icehockey.size()){
                if(icehockey.get(i).getTeamsname().equals(icehockey.get(i+1).getTeamsname())){
                    icehockey.remove(i);
                    i = -1;}
            }
        }
        /* Buz Hokeyi Puan Tablosu*/
        for(int i = 0;i<icehockeyy.size();i++){
            if (Integer.parseInt(icehockeyy.get(i).get(1)) > Integer.parseInt(icehockeyy.get(i).get(3))){
                for (int k = 0;k < icehockey.size();k++){
                    if (icehockeyy.get(i).get(0).equals(icehockey.get(k).getTeamsname())){
                        int result = icehockey.get(k).getTeamsscore() + 3;
                        int win = icehockey.get(k).getWin() + 1;
                        int playedmatch = icehockey.get(k).getPlayedmatch() + 1;
                        int matchscore = icehockey.get(k).getMatchscore() + Integer.parseInt(icehockeyy.get(i).get(1));
                        int rivalmatchscore = icehockey.get(k).getRivalmatchscore() + Integer.parseInt(icehockeyy.get(i).get(3));
                        icehockey.get(k).setRivalmatchscore(rivalmatchscore);
                        icehockey.get(k).setMatchscore(matchscore);
                        icehockey.get(k).setPlayedmatch(playedmatch);
                        icehockey.get(k).setWin(win);
                        icehockey.get(k).setTeamsscore(result);
                    }
                }
                for ( int k = 0;k < icehockey.size();k++){
                    if(icehockeyy.get(i).get(2).equals(icehockey.get(k).getTeamsname())){
                        int loss = icehockey.get(k).getLoss() + 1;
                        int playedmatch = icehockey.get(k).getPlayedmatch() + 1;
                        int matchscore = icehockey.get(k).getMatchscore() + Integer.parseInt(icehockeyy.get(i).get(3));
                        int rivalmatchscore = icehockey.get(k).getRivalmatchscore() + Integer.parseInt(icehockeyy.get(i).get(1));
                        icehockey.get(k).setRivalmatchscore(rivalmatchscore);
                        icehockey.get(k).setMatchscore(matchscore);
                        icehockey.get(k).setPlayedmatch(playedmatch);
                        icehockey.get(k).setLoss(loss);
                    }
                }
            }
            else if (Integer.parseInt(icehockeyy.get(i).get(3)) > Integer.parseInt(icehockeyy.get(i).get(1))){
                for (int k = 0;k < icehockey.size();k++){
                    if (icehockeyy.get(i).get(2).equals(icehockey.get(k).getTeamsname())){
                        int result = icehockey.get(k).getTeamsscore() + 3;
                        int win = icehockey.get(k).getWin() + 1;
                        int playedmatch = icehockey.get(k).getPlayedmatch() + 1;
                        int matchscore = icehockey.get(k).getMatchscore() + Integer.parseInt(icehockeyy.get(i).get(3));
                        int rivalmatchscore = icehockey.get(k).getRivalmatchscore() + Integer.parseInt(icehockeyy.get(i).get(1));
                        icehockey.get(k).setRivalmatchscore(rivalmatchscore);
                        icehockey.get(k).setMatchscore(matchscore);
                        icehockey.get(k).setPlayedmatch(playedmatch);
                        icehockey.get(k).setWin(win);
                        icehockey.get(k).setTeamsscore(result);
                    }
                }
                for ( int k = 0;k < icehockey.size();k++){
                    if(icehockeyy.get(i).get(0).equals(icehockey.get(k).getTeamsname())){
                        int loss = icehockey.get(k).getLoss() + 1;
                        int playedmatch = icehockey.get(k).getPlayedmatch() + 1;
                        int matchscore = icehockey.get(k).getMatchscore() + Integer.parseInt(icehockeyy.get(i).get(1));
                        int rivalmatchscore = icehockey.get(k).getRivalmatchscore() + Integer.parseInt(icehockeyy.get(i).get(3));
                        icehockey.get(k).setRivalmatchscore(rivalmatchscore);
                        icehockey.get(k).setMatchscore(matchscore);
                        icehockey.get(k).setPlayedmatch(playedmatch);
                        icehockey.get(k).setLoss(loss);
                    }
                }
            }
            else if (Integer.parseInt(icehockeyy.get(i).get(3)) == Integer.parseInt(icehockeyy.get(i).get(1))){
                for (int k = 0;k < icehockey.size();k++){
                    if (icehockeyy.get(i).get(2).equals(icehockey.get(k).getTeamsname())){
                        int result = icehockey.get(k).getTeamsscore() + 1;
                        int even = icehockey.get(k).getEven() + 1;
                        int playedmatch = icehockey.get(k).getPlayedmatch() + 1;
                        int matchscore = icehockey.get(k).getMatchscore() + Integer.parseInt(icehockeyy.get(i).get(3));
                        int rivalmatchscore = icehockey.get(k).getRivalmatchscore() + Integer.parseInt(icehockeyy.get(i).get(1));
                        icehockey.get(k).setRivalmatchscore(rivalmatchscore);
                        icehockey.get(k).setMatchscore(matchscore);
                        icehockey.get(k).setPlayedmatch(playedmatch);
                        icehockey.get(k).setEven(even);
                        icehockey.get(k).setTeamsscore(result);
                    }
                }
                for (int k = 0;k < icehockey.size();k++){
                    if (icehockeyy.get(i).get(0).equals(icehockey.get(k).getTeamsname())){
                        int result = icehockey.get(k).getTeamsscore() + 1;
                        int even = icehockey.get(k).getEven() + 1;
                        int playedmatch = icehockey.get(k).getPlayedmatch() + 1;
                        int matchscore = icehockey.get(k).getMatchscore() + Integer.parseInt(icehockeyy.get(i).get(1));
                        int rivalmatchscore = icehockey.get(k).getRivalmatchscore() + Integer.parseInt(icehockeyy.get(i).get(3));
                        icehockey.get(k).setRivalmatchscore(rivalmatchscore);
                        icehockey.get(k).setMatchscore(matchscore);
                        icehockey.get(k).setPlayedmatch(playedmatch);
                        icehockey.get(k).setEven(even);
                        icehockey.get(k).setTeamsscore(result);
                    }
                }
            }
        }
        /*Çıktı Aldığımız Kısım*/
        for(int i = 0; i < icehockey.size();i++){
            int difference = icehockey.get(i).getDifference() + icehockey.get(i).getMatchscore() - icehockey.get(i).getRivalmatchscore();
            icehockey.get(i).setDifference(difference);
        }
        /*Sıralamayı Burda Yapıyoruz*/
        Collections.sort(icehockey, Comparator.comparing(Icehockey::getDifference));
        Collections.sort(icehockey, Comparator.comparing(Icehockey::getTeamsscore));
        for(int i = icehockey.size()-1;i > -1;i--){
            ranking = ranking + 1;
            FileWriter fileWriter = new FileWriter("Icehockey.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(ranking+".\t"+icehockey.get(i).getTeamsname()+"\t"+icehockey.get(i).getPlayedmatch()+"\t"+icehockey.get(i).getWin()+"\t"+icehockey.get(i).getEven()+"\t"+icehockey.get(i).getLoss()+"\t"+icehockey.get(i).getMatchscore()+":"+icehockey.get(i).getRivalmatchscore()+"\t"+icehockey.get(i).getTeamsscore());
            printWriter.close();
        }
    }
}
