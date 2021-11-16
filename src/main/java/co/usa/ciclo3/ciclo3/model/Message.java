/*
 * Aplicación alquiler de herrmientas 
* Tabla Category
 */
package co.usa.ciclo3.ciclo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
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
@Table(name = "message")

public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

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

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
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


}
