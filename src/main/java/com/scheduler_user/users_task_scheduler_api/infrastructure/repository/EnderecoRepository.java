package com.scheduler_user.users_task_scheduler_api.infrastructure.repository;


import com.scheduler_user.users_task_scheduler_api.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
