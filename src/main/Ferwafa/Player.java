package main.Ferwafa;

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


    /**
     * @return String return the teamName
     */
    public String getTeamName() {
        return teamName;
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

}
