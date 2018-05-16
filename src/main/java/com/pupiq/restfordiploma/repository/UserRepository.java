package com.pupiq.restfordiploma.repository;

import com.pupiq.restfordiploma.model.User;
import com.pupiq.restfordiploma.model.UserRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    Page<User> findUserById(Integer postId, Pageable pageable);
}
