package com.example.demo.sport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SportRepository extends JpaRepository<Sport, Long> {

}
