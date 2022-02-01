package main.Ferwafa;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Match {
    private Date dateOfMatch;
    private Team homeTeam;
    private Team AwayTeam;
    private String ChampionName;
    private String stadiumName;
    private String status="NOT_PLAYED";
    private Refree refree;
    private long usedTime=0;
    private String elapsedTime;
    long startTime;
    Instant now=Instant.now();
     Calendar calendar=Calendar.getInstance();
     SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
     int secondsToAdd=0;
    private String remainedTime;
     //Instant yesterday=now.minus(1,ChronoUnit.DAYS);
     public void startMatch(){
         System.out.println("Match is started.....");
         setStatus("PLAYING");
        
       startTime=System.nanoTime();
        System.out.println("StartTime: "+ startTime);
       while(status=="PLAYING"){
          calendar.add(Calendar.SECOND, secondsToAdd++);
          setRemainedTime(sdf.format(calendar.getTime()));
          if(status=="ENDED"){
         
              break;
          }
          System.out.println("type x to end match");
          try (var scanner = new Scanner(System.in)) {
              String end=scanner.next();
              if(end.equalsIgnoreCase("x")){
                  endMatch();
              }
          }
          
       }
        
     }
  
     public void endMatch(){
        long endTime=System.nanoTime();
        System.out.println("EndTime "+ endTime);
        usedTime=(endTime-startTime);
        System.out.println("Used Time "+ usedTime);
        double seconds=(double)usedTime/1_000_000_000.0;
        System.out.println("Used Seconds: "+ seconds);
        Date date=new Date((long)seconds*1000);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, -2);
        date=calendar.getTime();
       elapsedTime=sdf.format(date);
          setStatus("ENDED");
          System.out.println("The used time: "+getElapsedTime());
    }
public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

public long getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(long usedTime) {
        this.usedTime = usedTime;
    }


    public String getRemainedTime() {
        return remainedTime;
    }

    public void setRemainedTime(String remainedTime) {
        this.remainedTime = remainedTime;
    }

    public Match(Date dateOfMatch, Team homeTeam, Team awayTeam, String championName, String stadiumName,
            Refree refree) {
        this.dateOfMatch = dateOfMatch;
        this.homeTeam = homeTeam;
        AwayTeam = awayTeam;
        ChampionName = championName;
        this.stadiumName = stadiumName;
        this.refree = refree;
    }
    public void giveCardPlayer(Player player,String givencard){
       if(!this.status.equals("PLAYING")){
         System.out.println("Not allowed to give a card when not playing");
         return;
       }
       Cards.card card=refree.giveCard(givencard);
       if(card.ordinal()==0){
       player.setYellowCardsInOneMatch(player.getYellowCardsInOneMatch()+1); 
       if(player.getYellowCardsInOneMatch()==2){
        giveCardPlayer(player,"RED");
       }
    }
    else{
         player.setTotalRedCards(player.getTotalRedCards()+1);
         if(homeTeam.getLineUp().contains(player))
            homeTeam.getLineUp().remove(player);
         else
         AwayTeam.getLineUp().remove(player);
    }
   
        
    }
    public Refree getRefree() {
        return refree;
    }
    public void setRefree(Refree refree) {
        this.refree = refree;
    }
    public void notifylPlayedMatchesToPlayers(Player player){
       if(homeTeam.getLineUp().contains(player)){
           Player.getPlayedHomeMatchs().add(this);
           
       }
       if(AwayTeam.getLineUp().contains(player)){
        Player.getPlayedAwayMatchs().add(this);
        
    }
}


    /**
     * @return Date return the dateOfMatch
     */
    public Date getDateOfMatch() {
        return dateOfMatch;
    }

    /**
     * @param dateOfMatch the dateOfMatch to set
     */
    public void setDateOfMatch(Date dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }

    /**
     * @return Team return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * @return Team return the AwayTeam
     */
    public Team getAwayTeam() {
        return AwayTeam;
    }

    /**
     * @param AwayTeam the AwayTeam to set
     */
    public void setAwayTeam(Team AwayTeam) {
        this.AwayTeam = AwayTeam;
    }

    /**
     * @return String return the ChampionName
     */
    public String getChampionName() {
        return ChampionName;
    }

    /**
     * @param ChampionName the ChampionName to set
     */
    public void setChampionName(String ChampionName) {
        this.ChampionName = ChampionName;
    }

    /**
     * @return String return the stadiumName
     */
    public String getStadiumName() {
        return stadiumName;
    }

    /**
     * @param stadiumName the stadiumName to set
     */
    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Match [AwayTeam= " + AwayTeam + ", ChampionName= " + ChampionName + ", dateOfMatch=" + dateOfMatch
                + ", elapsedTime=" + elapsedTime + ", homeTeam=" + homeTeam + ", refree=" + refree + ", stadiumName="
                + stadiumName + ", status=" + status + ", usedTime=" + usedTime + "]";
    }

}
