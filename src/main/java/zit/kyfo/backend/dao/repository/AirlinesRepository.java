package zit.kyfo.backend.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zit.kyfo.backend.dao.entity.AirlinesEntity;

import java.util.Optional;

public interface AirlinesRepository extends JpaRepository<AirlinesEntity, Integer> {

    Optional<AirlinesEntity> findByLogin(String login);
}
