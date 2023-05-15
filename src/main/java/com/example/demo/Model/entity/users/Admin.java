package com.example.demo.Model.entity.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;

@Entity
@Data

public class Admin extends Utilisateur {

	private String statut;
	
}
