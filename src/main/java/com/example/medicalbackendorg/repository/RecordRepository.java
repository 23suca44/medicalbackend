package com.example.medicalbackendorg.repository;

import com.example.medicalbackendorg.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}