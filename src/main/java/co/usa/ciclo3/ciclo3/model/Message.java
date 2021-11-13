/*
 * Clase model apliación alquiler de herrmientas 
* Tabla Category
 */
package co.usa.ciclo3.ciclo3.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * USA.edu.co Javier Pinillos
 */
@Entity
@Table(name = "message")

public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;
    private Integer tool;
    private Integer client;

    public Integer getIdMessage() {
        return idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public Integer getTool() {
        return tool;
    }

    public Integer getClient() {
        return client;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setTool(Integer tool) {
        this.tool = tool;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

}
