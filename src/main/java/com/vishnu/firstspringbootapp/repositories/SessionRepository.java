package com.vishnu.firstspringbootapp.repositories;

import com.vishnu.firstspringbootapp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
