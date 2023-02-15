package com.example.demo.Model.repositories.education;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.entity.education.Evaluation;

public interface EvaluationRepository extends PagingAndSortingRepository<Evaluation, Long> {

}
