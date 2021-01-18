package com.myfirstapp.demo.repository;

import com.myfirstapp.demo.mode.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
