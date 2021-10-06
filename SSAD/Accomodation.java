package SSAD;

import java.util.Date;
import SSAD.Administrator;
import SSAD.Chamber;

public class Accomodation {
  private Date arrivalTime;
  private Date dischargeTime;
  private boolean isFinished;
  private Chamber chamber;
  private Administrator acceptedBy;

  public Accomodation(Date arrivalTime, Administrator administrator) {
    this.arrivalTime = arrivalTime;
    this.acceptedBy = acceptedBy;
  }

  public Date getArrivalTime() {
    return this.arrivalTime;
  }

  public void setArrivalTime(Date arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public Date getDischargeTime() {
    return this.dischargeTime;
  }

  public void setDischargeTime(Date dischargeTime) {
    this.dischargeTime = dischargeTime;
  }

  public boolean isFinished() {
    return this.isFinished;
  }

  public void finish() {
    this.isFinished = true;
    this.dischargeTime = new Date();
    chamber.free();
  }

  public Chamber getChamber() {
    return this.chamber;
  }

  public void setChamber(Chamber chamber) {
    this.chamber = chamber;
  }

  public Administrator getAcceptedBy() {
    return this.acceptedBy;
  }

  public void setAcceptedBy(Administrator acceptedBy) {
    this.acceptedBy = acceptedBy;
  }
}