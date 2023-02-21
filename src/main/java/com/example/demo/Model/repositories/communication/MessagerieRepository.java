package com.example.demo.Model.repositories.communication;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.entity.communication.Messagerie;
import com.example.demo.Model.entity.users.Utilisateur;

public interface MessagerieRepository extends JpaRepository<Messagerie, Long> {
public List<Messagerie> findMessagerieByEmetteur(Utilisateur emetteur);
public List<Messagerie> findMessagerieByRecepteur(Utilisateur recepteur);
}
