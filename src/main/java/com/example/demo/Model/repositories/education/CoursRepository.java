package com.example.demo.Model.repositories.education;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.entity.education.Cours;

public interface CoursRepository extends PagingAndSortingRepository<Cours, Long> {

}
