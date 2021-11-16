/*
 * Aplicación alquiler de herrmientas 
* Tabla Category
 */
package co.usa.ciclo3.ciclo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    private String status;

    @ManyToOne
<<<<<<< HEAD
    @JoinColumn(name = "toolId")
=======
    @JoinColumn(name = "id")
>>>>>>> a4aeef9e5c9a0701cd9e1ed760afda3529383f71
    @JsonIgnoreProperties({"messages","reservations","tools","clients"})
    private Tool tool;

    @ManyToOne
<<<<<<< HEAD
    @JoinColumn(name = "clientIdClient")
=======
    @JoinColumn(name = "idClient")
>>>>>>> a4aeef9e5c9a0701cd9e1ed760afda3529383f71
    @JsonIgnoreProperties({"messages","reservations","tools","clients"})
    private Client client;

    private String score;

    public String getStatus() {
        if (status == null) {
            status = "created";
        }
        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}
