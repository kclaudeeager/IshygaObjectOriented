package main.Ferwafa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FerwafaNotificationSystem {
    public FerwafaNotificationSystem() {
    }
    public static void main(String args[]){
        Team homeTeam=new Team((byte)1,"MAN_U",false);
        Team awayTeam=new Team((byte)1,"REAL_MADRID",false);
        Player player=new Player("CR7",homeTeam.getName());
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,-365*30);
        homeTeam.setPlayers(new ArrayList<>());
        homeTeam.getPlayers().add(player);
        homeTeam.setLineUp(new ArrayList<>());
        homeTeam.getLineUp().add(player);
        Refree refree=new Refree("19938005490243",calendar.getTime(),'M', "Antonio Mateu Lahoz");
        Match match=new Match(new Date(), homeTeam, awayTeam, "CHAMPIONS_LEAGUE","ORD_TRAFORD", refree);
        match.startMatch();
        
    }

}
