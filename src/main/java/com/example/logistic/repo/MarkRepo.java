package com.example.logistic.repo;

import com.example.logistic.domain.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepo extends JpaRepository<Mark, Long> {
}