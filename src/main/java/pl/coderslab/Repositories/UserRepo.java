package pl.coderslab.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
