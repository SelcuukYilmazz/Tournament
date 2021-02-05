//package quiz2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Handcalculate extends Sports {
    /* Hentbol Puan Hesaplama*/
    public void handranks(ArrayList<ArrayList<String>> handballl) throws IOException {
        int ranking = 0;
        /*Hentbol Objelerini Oluşturuyoruz ve ArrayListe Atıyoruz*/

        for(int i = 0;i<handballl.size();i++){
            handball.add(new Handball(handballl.get(i).get(0),"H",0,0,0,0,0,0,0,0));
            handball.add(new Handball(handballl.get(i).get(2),"H",0,0,0,0,0,0,0,0));

        }
        /* Kendini Tekrar Eden ArrayListleri Siliyoruz*/
        Collections.sort(handball, Comparator.comparing(Handball::getTeamsname));
        for(int i =0;i<handball.size();i++){
            if(i+1 != handball.size()){
                if(handball.get(i).getTeamsname().equals(handball.get(i+1).getTeamsname())){
                    handball.remove(i);
                    i = -1;}
            }
        }
        /*Hentbol Puan Tablosu*/
        for(int i = 0;i<handballl.size();i++){
            if (Integer.parseInt(handballl.get(i).get(1)) > Integer.parseInt(handballl.get(i).get(3))){
                for (int k = 0;k < handball.size();k++){
                    if (handballl.get(i).get(0).equals(handball.get(k).getTeamsname())){
                        int result = handball.get(k).getTeamsscore() + 2;
                        int win = handball.get(k).getWin() + 1;
                        int playedmatch = handball.get(k).getPlayedmatch() + 1;
                        int matchscore = handball.get(k).getMatchscore() + Integer.parseInt(handballl.get(i).get(1));
                        int rivalmatchscore = handball.get(k).getRivalmatchscore() + Integer.parseInt(handballl.get(i).get(3));
                        handball.get(k).setRivalmatchscore(rivalmatchscore);
                        handball.get(k).setMatchscore(matchscore);
                        handball.get(k).setPlayedmatch(playedmatch);
                        handball.get(k).setWin(win);
                        handball.get(k).setTeamsscore(result);
                    }
                }
                for (int k = 0;k < handball.size();k++){
                    if (handballl.get(i).get(2).equals(handball.get(k).getTeamsname())){
                        int loss = handball.get(k).getLoss() + 1;
                        int playedmatch = handball.get(k).getPlayedmatch() + 1;
                        int matchscore = handball.get(k).getMatchscore() + Integer.parseInt(handballl.get(i).get(3));
                        int rivalmatchscore = handball.get(k).getRivalmatchscore() + Integer.parseInt(handballl.get(i).get(1));
                        handball.get(k).setRivalmatchscore(rivalmatchscore);
                        handball.get(k).setMatchscore(matchscore);
                        handball.get(k).setPlayedmatch(playedmatch);
                        handball.get(k).setLoss(loss);
                    }
                }
            }
            else if (Integer.parseInt(handballl.get(i).get(3)) > Integer.parseInt(handballl.get(i).get(1))){
                for (int k = 0;k < handball.size();k++){
                    if (handballl.get(i).get(2).equals(handball.get(k).getTeamsname())){
                        int result = handball.get(k).getTeamsscore() + 2;
                        int win = handball.get(k).getWin() + 1;
                        int playedmatch = handball.get(k).getPlayedmatch() + 1;
                        int matchscore = handball.get(k).getMatchscore() + Integer.parseInt(handballl.get(i).get(3));
                        int rivalmatchscore = handball.get(k).getRivalmatchscore() + Integer.parseInt(handballl.get(i).get(1));
                        handball.get(k).setRivalmatchscore(rivalmatchscore);
                        handball.get(k).setMatchscore(matchscore);
                        handball.get(k).setPlayedmatch(playedmatch);
                        handball.get(k).setWin(win);
                        handball.get(k).setTeamsscore(result);
                    }
                }
                for (int k = 0;k < handball.size();k++){
                    if (handballl.get(i).get(0).equals(handball.get(k).getTeamsname())){
                        int loss = handball.get(k).getLoss() + 1;
                        int playedmatch = handball.get(k).getPlayedmatch() + 1;
                        int matchscore = handball.get(k).getMatchscore() + Integer.parseInt(handballl.get(i).get(1));
                        int rivalmatchscore = handball.get(k).getRivalmatchscore() + Integer.parseInt(handballl.get(i).get(3));
                        handball.get(k).setRivalmatchscore(rivalmatchscore);
                        handball.get(k).setMatchscore(matchscore);
                        handball.get(k).setPlayedmatch(playedmatch);
                        handball.get(k).setLoss(loss);
                    }
                }
            }
            else if (Integer.parseInt(handballl.get(i).get(3)) == Integer.parseInt(handballl.get(i).get(1))){
                for (int k = 0;k < handball.size();k++){
                    if (handballl.get(i).get(2).equals(handball.get(k).getTeamsname())){
                        int result = handball.get(k).getTeamsscore() + 1;
                        int even = handball.get(k).getEven() + 1;
                        int playedmatch = handball.get(k).getPlayedmatch() + 1;
                        int matchscore = handball.get(k).getMatchscore() + Integer.parseInt(handballl.get(i).get(1));
                        int rivalmatchscore = handball.get(k).getRivalmatchscore() + Integer.parseInt(handballl.get(i).get(3));
                        handball.get(k).setRivalmatchscore(rivalmatchscore);
                        handball.get(k).setMatchscore(matchscore);
                        handball.get(k).setPlayedmatch(playedmatch);
                        handball.get(k).setEven(even);
                        handball.get(k).setTeamsscore(result);
                    }
                }
                for(int k = 0;k < handball.size();k++){
                    if (handballl.get(i).get(0).equals(handball.get(k).getTeamsname())){
                        int result = handball.get(k).getTeamsscore() + 1;
                        int even = handball.get(k).getEven() + 1;
                        int playedmatch = handball.get(k).getPlayedmatch() + 1;
                        int matchscore = handball.get(k).getMatchscore() + Integer.parseInt(handballl.get(i).get(1));
                        int rivalmatchscore = handball.get(k).getRivalmatchscore() + Integer.parseInt(handballl.get(i).get(3));
                        handball.get(k).setRivalmatchscore(rivalmatchscore);
                        handball.get(k).setMatchscore(matchscore);
                        handball.get(k).setPlayedmatch(playedmatch);
                        handball.get(k).setEven(even);
                        handball.get(k).setTeamsscore(result);
                    }
                }
            }
        }
        /*Çıktı Aldığımız Kısım*/
        for(int i = 0; i < handball.size();i++){
            int difference = handball.get(i).getDifference() + handball.get(i).getMatchscore() - handball.get(i).getRivalmatchscore();
            handball.get(i).setDifference(difference);
        }
        /*Sıralamayı Burda Yapıyoruz*/
        Collections.sort(handball, Comparator.comparing(Handball::getDifference));
        Collections.sort(handball, Comparator.comparing(Handball::getTeamsscore));
        for(int i = handball.size()-1;i > -1;i--){
            ranking = ranking + 1;
            FileWriter fileWriter = new FileWriter("Handball.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(ranking+".\t"+handball.get(i).getTeamsname()+"\t"+handball.get(i).getPlayedmatch()+"\t"+handball.get(i).getWin()+"\t"+handball.get(i).getEven()+"\t"+handball.get(i).getLoss()+"\t"+handball.get(i).getMatchscore()+":"+handball.get(i).getRivalmatchscore()+"\t"+handball.get(i).getTeamsscore());
            printWriter.close();
        }
    }
}
