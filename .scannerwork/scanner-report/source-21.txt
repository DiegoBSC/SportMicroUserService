package com.sport.system.play.sportuserservice.repository;

import com.sport.system.play.sportuserservice.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {
    Page<User> findByIdCompany(String idCompany, Pageable pageable);
    Page<User> findAll(Pageable pageable);
    Optional<User> findByUsername(String username);
}
