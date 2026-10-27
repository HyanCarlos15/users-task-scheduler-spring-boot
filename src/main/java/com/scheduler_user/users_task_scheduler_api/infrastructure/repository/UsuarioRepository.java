package com.scheduler_user.users_task_scheduler_api.infrastructure.repository;


import com.scheduler_user.users_task_scheduler_api.infrastructure.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    boolean existsByEmail(String email);

    //    Classe utilizada para evitar o retorno de informações nulas
    Optional<Usuario> findByEmail(String email);
    @Transactional
    void deleteByEmail(String email);

}