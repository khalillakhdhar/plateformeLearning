package com.example.demo.Model.entity.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Enseignant extends Utilisateur {

	@Column(nullable = false)
	private String specialite;

}
