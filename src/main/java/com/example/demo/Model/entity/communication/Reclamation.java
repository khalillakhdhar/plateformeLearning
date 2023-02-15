package com.example.demo.Model.entity.communication;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Entity
@Data
public class Reclamation extends Messagerie {
private String type;
@Email
private String email;



}
