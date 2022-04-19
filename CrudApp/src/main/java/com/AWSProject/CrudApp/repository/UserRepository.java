
package com.AWSProject.CrudApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AWSProject.CrudApp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
