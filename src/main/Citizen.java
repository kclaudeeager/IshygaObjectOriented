package main;
import java.util.Date;


public class Citizen {
    protected String nId;
    protected Date dateOfBirth;
    protected char sex;
    protected String names;

    public Citizen() {
    }

    public Citizen(String names) {
        this.names = names;
    }

    public Citizen(String nId, Date dateOfBirth, char sex, String names) {
        this.nId = nId;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.names = names;
    }

    /**
     * @return String return the nId
     */
    public String getNId() {
        return nId;
    }

    /**
     * @param nId the nId to set
     */
    public void setNId(String nId) {
        this.nId = nId;
    }

    /**
     * @return Date return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return char return the sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * @return String return the names
     */
    public String getNames() {
        return names;
    }

    /**
     * @param names the names to set
     */
    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Citizen [dateOfBirth=" + dateOfBirth + ", nId=" + nId + ", names=" + names + ", sex=" + sex + "]";
    }

}
