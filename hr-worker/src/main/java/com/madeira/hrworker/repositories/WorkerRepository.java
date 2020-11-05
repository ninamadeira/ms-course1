package com.madeira.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madeira.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
