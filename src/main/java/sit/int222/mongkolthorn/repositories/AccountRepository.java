package sit.int222.mongkolthorn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int222.mongkolthorn.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
