package com.example.demo.Model.repositories.communication;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.entity.communication.Messagerie;

public interface MessagerieRepository extends PagingAndSortingRepository<Messagerie, Long> {

}
