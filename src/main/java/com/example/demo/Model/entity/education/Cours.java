package com.example.demo.Model.entity.education;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.example.demo.Model.entity.users.Enseignant;
import com.example.demo.Model.entity.users.Etudiant;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cours implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = false)
private String titre,url,type;
@Lob
@NotBlank
private String description;

@ManyToMany(fetch = FetchType.LAZY,
cascade = {
    CascadeType.PERSIST,
    CascadeType.MERGE
},
mappedBy = "cours")
private List<Etudiant> etudiants = new ArrayList<Etudiant>();
@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name = "matiere")
@OnDelete(action = OnDeleteAction.CASCADE)
@JsonIdentityReference(alwaysAsId=true)
@JsonProperty("matiere")
private Matiere matiere;
@OneToOne(fetch = FetchType.LAZY,
cascade =  CascadeType.ALL,
mappedBy = "cours")
private Evaluation evaluation;

}
