package org.example.nishiki_koi_shop.repository;

import org.example.nishiki_koi_shop.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);
    boolean existsByEmail(String email);


    @Query("SELECT u FROM User u WHERE u.deletedAt IS NULL")
    List<User> findAllActiveUsers();

    Optional<User> findByIdAndDeletedAtIsNull(Long id);

}