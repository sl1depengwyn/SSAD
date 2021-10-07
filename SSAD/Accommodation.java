package SSAD;

import java.util.Date;

public class Accommodation {
    private Date arrivalTime;
    private Date dischargeTime;
    private boolean isFinished;
    private Chamber chamber;
    private Administrator acceptedBy;

    public Accommodation(Date arrivalTime, Administrator administrator) {
        this.arrivalTime = arrivalTime;
        this.acceptedBy = administrator;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("INSERT ACCOMMODATIONS ...%d..%s.", arrivalTime.getTime(), administrator.getFirstName()));
    }

    public Date getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE ACCOMMODATIONS ...%d...", arrivalTime.getTime()));
    }

    public Date getDischargeTime() {
        return this.dischargeTime;
    }

    public void setDischargeTime(Date dischargeTime) {
        this.dischargeTime = dischargeTime;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE ACCOMMODATIONS ...%d...", arrivalTime.getTime()));
    }

    public boolean isFinished() {
        return this.isFinished;
    }

    public void finish() {
        this.isFinished = true;
        this.dischargeTime = new Date();
        chamber.free();
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE ACCOMMODATIONS ...%b..%d..", isFinished, dischargeTime.getTime()));
    }

    public Chamber getChamber() {
        return this.chamber;
    }

    public void setChamber(Chamber chamber) {
        this.chamber = chamber;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE ACCOMMODATIONS ...%d..", chamber.getId()));
    }

    public Administrator acceptedBy() {
        return this.acceptedBy;
    }

    private void setAcceptedBy(Administrator acceptedBy) {
        this.acceptedBy = acceptedBy;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE ACCOMMODATIONS ...%s..", acceptedBy.getFirstName().concat(acceptedBy.getLastName())));
    }
}