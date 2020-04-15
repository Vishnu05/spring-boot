package com.vishnu.firstspringbootapp.repositories;

import com.vishnu.firstspringbootapp.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker,Long> {
}
