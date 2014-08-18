package ch.ithings.demo.repository.jpa;

import ch.ithings.demo.domain.PersistentToken;
import ch.ithings.demo.domain.User;
import java.util.List;
import org.joda.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the PersistentToken entity.
 */
@Repository
public interface PersistentTokenRepository extends JpaRepository<PersistentToken, String> {

    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);

}
