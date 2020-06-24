package com.example.finaluri2.Repository;

import com.example.finaluri2.Model.model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<model, Long> {
}