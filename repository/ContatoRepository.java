package repository;

import model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ContatoRepository extends JpaRepository<Contato, Integer>{
}
