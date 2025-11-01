package com.victor.usuario.infraestructure.Repository;


import com.victor.usuario.infraestructure.Entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone,Long> {
}
