package main.Ferwafa;


import java.util.Date;


public class Match {
    private Date dateOfMatch;
    private Team homeTeam;
    private Team AwayTeam;
    private String refaName;
    private String ChampionName;
    private String stadiumName;
    private String status;
    

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
     * @return String return the refaName
     */
    public String getRefaName() {
        return refaName;
    }

    /**
     * @param refaName the refaName to set
     */
    public void setRefaName(String refaName) {
        this.refaName = refaName;
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

}
