package com.reserva.resto.client_service.repository;

import com.reserva.resto.client_service.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
