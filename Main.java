//package quiz2;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Sports sports = new Sports();
        Icecalculate icecalculate = new Icecalculate();
        Basketcalculate basketcalculate = new Basketcalculate();
        Voleycalculate voleycalculate = new Voleycalculate();
        Handcalculate handcalculate = new Handcalculate();

        ArrayList<ArrayList<String>> icehockeyy = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> handballl = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> basketballl = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> volleyballl = new ArrayList<ArrayList<String>>();
        icehockeyy = sports.filereader(args[0]).get(0);
        handballl = sports.filereader(args[0]).get(1);
        basketballl = sports.filereader(args[0]).get(2);
        volleyballl = sports.filereader(args[0]).get(3);

        icecalculate.iceranks(icehockeyy);
        handcalculate.handranks(handballl);
        basketcalculate.basketranks(basketballl);
        voleycalculate.volleyranks(volleyballl);

    }
}
