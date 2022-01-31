package main.Ferwafa;


import java.util.ArrayList;


public class Team {
    private ArrayList<Player> players;
    private String headCoachName;
    private Player teamCaptain;
    private byte division;
    private String name;
    private boolean isWomenTeam;
    

    /**
     * @return ArrayList<Player> return the players
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * @return String return the headCoachName
     */
    public String getHeadCoachName() {
        return headCoachName;
    }

    /**
     * @param headCoachName the headCoachName to set
     */
    public void setHeadCoachName(String headCoachName) {
        this.headCoachName = headCoachName;
    }

    /**
     * @return Player return the teamCaptain
     */
    public Player getTeamCaptain() {
        return teamCaptain;
    }

    /**
     * @param teamCaptain the teamCaptain to set
     */
    public void setTeamCaptain(Player teamCaptain) {
        this.teamCaptain = teamCaptain;
    }

    /**
     * @return byte return the division
     */
    public byte getDivision() {
        return division;
    }

    /**
     * @param division the division to set
     */
    public void setDivision(byte division) {
        this.division = division;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return boolean return the isWomenTeam
     */
    public boolean isIsWomenTeam() {
        return isWomenTeam;
    }

    /**
     * @param isWomenTeam the isWomenTeam to set
     */
    public void setIsWomenTeam(boolean isWomenTeam) {
        this.isWomenTeam = isWomenTeam;
    }

}
