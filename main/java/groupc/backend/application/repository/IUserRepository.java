package groupc.backend.application.repository;

import groupc.backend.application.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IUserRepository extends JpaRepository<User, Long> {
}
