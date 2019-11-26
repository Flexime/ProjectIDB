package Constructors;

import javafx.beans.property.StringProperty;

public class ClientTable {
    private StringProperty company;
    private StringProperty first_name;
    private StringProperty last_name;
    private StringProperty pnumber;
    private StringProperty  creationDate;
    private StringProperty  startDate;
    private StringProperty  endDate;
    private StringProperty  summ;


  /*  public ClientTable(StringProperty company, StringProperty first_name, StringProperty last_name,
                       StringProperty pnumber, StringProperty creationDate, StringProperty startDate, StringProperty endDate, StringProperty summ) {
        this.company = company;
        this.first_name = first_name;
        this.last_name = last_name;
        this.pnumber = pnumber;
        this.creationDate = creationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.summ = summ;
    }*/

    public ClientTable(StringProperty company, StringProperty first_name, StringProperty last_name,
                       StringProperty pnumber, StringProperty creationDate, StringProperty startDate, StringProperty endDate, StringProperty summ) {
        this.company = company;
        this.first_name = first_name;
        this.last_name = last_name;
        this.pnumber = pnumber;
        this.creationDate = creationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.summ = summ;
    }

    public String getCompany() {
        return company.get();
    }

    public StringProperty companyProperty() {
        return company;
    }

    public void setCompany(String company) {
        this.company.set(company);
    }

    public String getFirst_name() {
        return first_name.get();
    }

    public StringProperty first_nameProperty() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name.set(first_name);
    }

    public String getLast_name() {
        return last_name.get();
    }

    public StringProperty last_nameProperty() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name.set(last_name);
    }

    public String getPnumber() {
        return pnumber.get();
    }

    public StringProperty pnumberProperty() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber.set(pnumber);
    }

    public String getCreationDate() {
        return creationDate.get();
    }

    public StringProperty creationDateProperty() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate.set(creationDate);
    }

    public String getStartDate() {
        return startDate.get();
    }

    public StringProperty startDateProperty() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate.set(startDate);
    }

    public String getEndDate() {
        return endDate.get();
    }

    public StringProperty endDateProperty() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate.set(endDate);
    }

    public String getSumm() {
        return summ.get();
    }

    public StringProperty summProperty() {
        return summ;
    }

    public void setSumm(String summ) {
        this.summ.set(summ);
    }
}
