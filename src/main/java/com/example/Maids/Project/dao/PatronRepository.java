package com.example.Maids.Project.dao;

import com.example.Maids.Project.entity.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatronRepository extends JpaRepository<Patron, Long> {
}
