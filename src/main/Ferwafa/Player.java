package main.Ferwafa;

import java.util.ArrayList;
import java.util.Date;

import main.Citizen;

public class Player extends Citizen{
    private String teamName;
    private String disciplineStatus;
    private int totalYellowCards;
    private int totalRedCards;
    private int yellowCardsInOneMatch;
    private int consecutiveYellowCards;
    private int playingPosition;
    private String Status;
    private static ArrayList<Match> playedHomeMatchs;
    private static ArrayList<Match> playedAwayMatchs;
    private int totalPlayedMachs;
    public Player(String nId, Date dateOfBirth, char sex, String names, String teamName) {
        super(nId, dateOfBirth, sex, names);
        this.teamName = teamName;
    }
    public Player(String teamName) {
        this.teamName = teamName;
    }
    public Player(String names, String teamName) {
        super(names);
        this.teamName = teamName;
    }
    public void computeTotalPlayedMatchs(){
      totalPlayedMachs=playedAwayMatchs.size()+playedHomeMatchs.size();
    }
    /**
     * @return String return the teamName
     */
    public String getTeamName() {
        return teamName;
    }


    public int getTotalPlayedMachs() {
        return totalPlayedMachs;
    }


    public void setTotalPlayedMachs(int totalPlayedMachs) {
        this.totalPlayedMachs = totalPlayedMachs;
    }


    public static ArrayList<Match> getPlayedAwayMatchs() {
        return playedAwayMatchs;
    }


    public static void setPlayedAwayMatchs(ArrayList<Match> playedAwayMatchs) {
        Player.playedAwayMatchs = playedAwayMatchs;
    }


    public static ArrayList<Match> getPlayedHomeMatchs() {
        return playedHomeMatchs;
    }


    public static void setPlayedHomeMatchs(ArrayList<Match> playedHomeMatchs) {
        Player.playedHomeMatchs = playedHomeMatchs;
    }


    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return String return the disciplineStatus
     */
    public String getDisciplineStatus() {
        return disciplineStatus;
    }

    /**
     * @param disciplineStatus the disciplineStatus to set
     */
    public void setDisciplineStatus(String disciplineStatus) {
        this.disciplineStatus = disciplineStatus;
    }

    /**
     * @return int return the totalYellowCards
     */
    public int getTotalYellowCards() {
        return totalYellowCards;
    }

    /**
     * @param totalYellowCards the totalYellowCards to set
     */
    public void setTotalYellowCards(int totalYellowCards) {
        this.totalYellowCards = totalYellowCards;
    }

    /**
     * @return int return the totalRedCards
     */
    public int getTotalRedCards() {
        return totalRedCards;
    }

    /**
     * @param totalRedCards the totalRedCards to set
     */
    public void setTotalRedCards(int totalRedCards) {
        this.totalRedCards = totalRedCards;
    }

    /**
     * @return int return the yellowCardsInOneMatch
     */
    public int getYellowCardsInOneMatch() {
        return yellowCardsInOneMatch;
    }

    /**
     * @param yellowCardsInOneMatch the yellowCardsInOneMatch to set
     */
    public void setYellowCardsInOneMatch(int yellowCardsInOneMatch) {
        this.yellowCardsInOneMatch = yellowCardsInOneMatch;
    }

    /**
     * @return int return the consecutiveYellowCards
     */
    public int getConsecutiveYellowCards() {
        return consecutiveYellowCards;
    }

    /**
     * @param consecutiveYellowCards the consecutiveYellowCards to set
     */
    public void setConsecutiveYellowCards(int consecutiveYellowCards) {
        this.consecutiveYellowCards = consecutiveYellowCards;
    }

    /**
     * @return int return the playingPosition
     */
    public int getPlayingPosition() {
        return playingPosition;
    }

    /**
     * @param playingPosition the playingPosition to set
     */
    public void setPlayingPosition(int playingPosition) {
        this.playingPosition = playingPosition;
    }

    /**
     * @return String return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }
    @Override
    public String toString() {
        return "Player [Status=" + Status + ", consecutiveYellowCards=" + consecutiveYellowCards + ", disciplineStatus="
                + disciplineStatus + ", playingPosition=" + playingPosition + ", teamName=" + teamName
                + ", totalPlayedMachs=" + totalPlayedMachs + ", totalRedCards=" + totalRedCards + ", totalYellowCards="
                + totalYellowCards + ", yellowCardsInOneMatch=" + yellowCardsInOneMatch + "]";
    }

}
