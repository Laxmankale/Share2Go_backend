package com.share2go.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.share2go.model.Ride;

public interface RideRepository extends JpaRepository<Ride, Long> {

}
