package com.example.demo.Model.entity.communication;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import com.example.demo.Model.entity.users.Utilisateur;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "mode")
public class Messagerie implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
@NotBlank
private String text;
@Temporal(TemporalType.TIMESTAMP)
@CreatedDate

private Date date;
@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name = "emetteur")
@OnDelete(action = OnDeleteAction.CASCADE)
@JsonIdentityReference(alwaysAsId=true)
@JsonProperty("emetteur")
private Utilisateur emetteur;
@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name = "recepteur")
@OnDelete(action = OnDeleteAction.CASCADE)
@JsonIdentityReference(alwaysAsId=true)
@JsonProperty("recepteur")
private Utilisateur recepteur;





}
