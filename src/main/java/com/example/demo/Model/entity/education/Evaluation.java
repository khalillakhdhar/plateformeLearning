package com.example.demo.Model.entity.education;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import com.example.demo.Model.entity.users.Utilisateur;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Evaluation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date dateHeure;
	@NotNull
	@Min(value = 1)
	@Max(value = 5)
	private int evaluation;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "utilisateur_id", nullable = false)
    private Utilisateur utilisateur;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cours_id", nullable = false)
    private Cours cours;
}
