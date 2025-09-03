package com.share2go.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.share2go.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
