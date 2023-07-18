package com.example.demo.Model.entity.users;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Model.entity.education.Cours;
import com.example.demo.Model.entity.education.Evaluation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})

public class Etudiant extends Utilisateur implements Serializable {

	@Column(nullable = false)
	@NotBlank
	private String classe;
	 @ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	                CascadeType.PERSIST,
	                CascadeType.MERGE
	            })
	    @JoinTable(name = "progression",joinColumns = { @JoinColumn(name = "etudiant_id") },
	            inverseJoinColumns = { @JoinColumn(name = "cours_id") })
	 private List<Cours> cours=new ArrayList<Cours>();
	 @OneToOne(fetch = FetchType.LAZY,
	            cascade =  CascadeType.ALL,
	            mappedBy = "utilisateur")
	    private Evaluation evaluation;
}
