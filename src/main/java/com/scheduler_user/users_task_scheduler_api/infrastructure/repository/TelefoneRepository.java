package com.scheduler_user.users_task_scheduler_api.infrastructure.repository;


import com.scheduler_user.users_task_scheduler_api.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
