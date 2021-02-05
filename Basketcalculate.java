//package quiz2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Basketcalculate extends Sports{
    /*Basketbol Puan Hesaplama*/
    public void basketranks(ArrayList<ArrayList<String>> basketballl) throws IOException {
        int ranking = 0;
        /*Basketbol Objelerini Oluşturuyoruz ve ArrayListe Atıyoruz*/
        for(int i = 0;i<basketballl.size();i++){
            basketball.add(new Basketball(basketballl.get(i).get(0),"B",0,0,0,0,0,0,0,0));
            basketball.add(new Basketball(basketballl.get(i).get(2),"B",0,0,0,0,0,0,0,0));
        }
        /*Basketbol Objelerinden Kendini Tekrar Edenleri Siliyoruz*/
        Collections.sort(basketball, Comparator.comparing(Basketball::getTeamsname));
        for(int i =0;i<basketball.size();i++){
            if(i+1 != basketball.size()){
                if(basketball.get(i).getTeamsname().equals(basketball.get(i+1).getTeamsname())){
                    basketball.remove(i);
                    i = -1;}
            }
        }
        /*Basketbol Puan Tablosu*/
        for(int i = 0;i<basketballl.size();i++){
            if (Integer.parseInt(basketballl.get(i).get(1)) > Integer.parseInt(basketballl.get(i).get(3))){
                for (int k = 0;k < basketball.size();k++){
                    if (basketballl.get(i).get(0).equals(basketball.get(k).getTeamsname())){
                        int result = basketball.get(k).getTeamsscore() + 2;
                        int win = basketball.get(k).getWin() + 1;
                        int playedmatch = basketball.get(k).getPlayedmatch() + 1;
                        int matchscore = basketball.get(k).getMatchscore() + Integer.parseInt(basketballl.get(i).get(1));
                        int rivalmatchscore = basketball.get(k).getRivalmatchscore() + Integer.parseInt(basketballl.get(i).get(3));
                        basketball.get(k).setRivalmatchscore(rivalmatchscore);
                        basketball.get(k).setMatchscore(matchscore);
                        basketball.get(k).setPlayedmatch(playedmatch);
                        basketball.get(k).setWin(win);
                        basketball.get(k).setTeamsscore(result);
                    }

                }
                for (int k = 0;k < basketball.size();k++){
                    if (basketballl.get(i).get(2).equals(basketball.get(k).getTeamsname())){
                        int result = basketball.get(k).getTeamsscore() + 1;
                        int loss = basketball.get(k).getLoss() + 1;
                        int playedmatch = basketball.get(k).getPlayedmatch() + 1;
                        int matchscore = basketball.get(k).getMatchscore() + Integer.parseInt(basketballl.get(i).get(3));
                        int rivalmatchscore = basketball.get(k).getRivalmatchscore() + Integer.parseInt(basketballl.get(i).get(1));
                        basketball.get(k).setRivalmatchscore(rivalmatchscore);
                        basketball.get(k).setMatchscore(matchscore);
                        basketball.get(k).setPlayedmatch(playedmatch);
                        basketball.get(k).setLoss(loss);
                        basketball.get(k).setTeamsscore(result);
                    }

                }
            }
            else if (Integer.parseInt(basketballl.get(i).get(3)) > Integer.parseInt(basketballl.get(i).get(1))){
                for (int k = 0;k < basketball.size();k++){
                    if (basketballl.get(i).get(2).equals(basketball.get(k).getTeamsname())){
                        int result = basketball.get(k).getTeamsscore() + 2;
                        int win = basketball.get(k).getWin() + 1;
                        int playedmatch = basketball.get(k).getPlayedmatch() + 1;
                        int matchscore = basketball.get(k).getMatchscore() + Integer.parseInt(basketballl.get(i).get(3));
                        int rivalmatchscore = basketball.get(k).getRivalmatchscore() + Integer.parseInt(basketballl.get(i).get(1));
                        basketball.get(k).setRivalmatchscore(rivalmatchscore);
                        basketball.get(k).setMatchscore(matchscore);
                        basketball.get(k).setPlayedmatch(playedmatch);
                        basketball.get(k).setWin(win);
                        basketball.get(k).setTeamsscore(result);
                    }
                }
                for (int k = 0;k < basketball.size();k++) {
                    if (basketballl.get(i).get(0).equals(basketball.get(k).getTeamsname())){
                        int result = basketball.get(k).getTeamsscore() + 1;
                        int loss = basketball.get(k).getLoss() + 1;
                        int playedmatch = basketball.get(k).getPlayedmatch() + 1;
                        int matchscore = basketball.get(k).getMatchscore() + Integer.parseInt(basketballl.get(i).get(1));
                        int rivalmatchscore = basketball.get(k).getRivalmatchscore() + Integer.parseInt(basketballl.get(i).get(3));
                        basketball.get(k).setRivalmatchscore(rivalmatchscore);
                        basketball.get(k).setMatchscore(matchscore);
                        basketball.get(k).setPlayedmatch(playedmatch);
                        basketball.get(k).setLoss(loss);
                        basketball.get(k).setTeamsscore(result);
                    }
                }
            }
        }
        /*Çıktı Aldığımız Kısım*/
        for(int i = 0; i < basketball.size();i++){
            int difference = basketball.get(i).getDifference() + basketball.get(i).getMatchscore() - basketball.get(i).getRivalmatchscore();
            basketball.get(i).setDifference(difference);
        }
        /*Sıralama Yaptığımız Kısım*/
        Collections.sort(basketball, Comparator.comparing(Basketball::getDifference));
        Collections.sort(basketball, Comparator.comparing(Basketball::getTeamsscore));
        for(int i = basketball.size()-1;i > -1;i--){
            ranking = ranking + 1;

            FileWriter fileWriter = new FileWriter("Basketball.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(ranking+".\t"+basketball.get(i).getTeamsname()+"\t"+basketball.get(i).getPlayedmatch()+"\t"+basketball.get(i).getWin()+"\t"+basketball.get(i).getEven()+"\t"+basketball.get(i).getLoss()+"\t"+basketball.get(i).getMatchscore()+":"+basketball.get(i).getRivalmatchscore()+"\t"+basketball.get(i).getTeamsscore());
            printWriter.close();
        }
    }
}
