package com.example.demo.Model.entity.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})

public class Admin extends Utilisateur {

	private String statut;
	
}
