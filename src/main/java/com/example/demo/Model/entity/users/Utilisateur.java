package com.example.demo.Model.entity.users;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public  class  Utilisateur  implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotBlank
@Column(nullable = false)
private String nom,prenom,tel;
private String adresse;
@Email
@Column(unique = true)
private String email;
@NotEmpty
@Column(nullable = false)
private String password;

private String grade;


}
