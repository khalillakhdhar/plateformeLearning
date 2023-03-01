package com.example.demo.Model.entity.education;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.example.demo.Model.entity.users.Enseignant;
import com.example.demo.Model.entity.users.Utilisateur;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Matiere {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotBlank
	private String titre;
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "enseignant")
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIdentityReference(alwaysAsId=true)
	@JsonProperty("enseignant")
	private Enseignant enseignant;
}
