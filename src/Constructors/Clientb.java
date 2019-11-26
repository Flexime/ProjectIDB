package Constructors;

public class Clientb {
    private String company;
    private String first_name;
    private String last_name;
    private String pnumber;
    private String creationDate;
    private String StartDate;
    private String endDate;
    private String summ;


    //Constructor

    public Clientb(String company, String first_name, String last_name, String pnumber, String creationDate, String startDate, String endDate, String summ) {
        this.company = company;
        this.first_name = first_name;
        this.last_name = last_name;
        this.pnumber = pnumber;
        this.creationDate = creationDate;
        this.StartDate = startDate;
        this.endDate = endDate;
        this.summ = summ;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSumm() {
        return summ;
    }

    public void setSumm(String summ) {
        this.summ = summ;
    }
}
