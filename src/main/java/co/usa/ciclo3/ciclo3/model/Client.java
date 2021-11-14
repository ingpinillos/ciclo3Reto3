/*
 * Clase model apliación alquiler de herrmientas 
* Tabla Client
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
@Table(name = "client")

public class Client implements Serializable {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer idClient;
 private String email;
 private String password;
 private String name;
 private String age;

 public Integer getIdClient() {
  return idClient;
 }

 public String getEmail() {
  return email;
 }

 public String getPassword() {
  return password;
 }

 public String getName() {
  return name;
 }

 public String getAge() {
  return age;
 }

 public void setIdClient(Integer idClient) {
  this.idClient = idClient;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public void setName(String name) {
  this.name = name;
 }

 public void setAge(String age) {
  this.age = age;
 }

}
