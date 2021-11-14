/*
 * Clase model apliación alquiler de herrmientas 
* Tabla Category
 */
package co.usa.ciclo3.ciclo3.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * USA.edu.co Javier Pinillos
 */
@Entity
@Table(name = "reservation")

public class Reservation implements Serializable {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer idReservation;
 private Date startDate;
 private Date devolutionDate;
 private Integer client;
 private Integer tool;

 public Integer getIdReservation() {
  return idReservation;
 }

 public Date getStartDate() {
  return startDate;
 }

 public Date getDevolutionDate() {
  return devolutionDate;
 }

 public Integer getClient() {
  return client;
 }

 public Integer getTool() {
  return tool;
 }

 public void setIdReservation(Integer idReservation) {
  this.idReservation = idReservation;
 }

 public void setStartDate(Date startDate) {
  this.startDate = startDate;
 }

 public void setDevolutionDate(Date devolutionDate) {
  this.devolutionDate = devolutionDate;
 }

 public void setClient(Integer client) {
  this.client = client;
 }

 public void setTool(Integer tool) {
  this.tool = tool;
 }

}
