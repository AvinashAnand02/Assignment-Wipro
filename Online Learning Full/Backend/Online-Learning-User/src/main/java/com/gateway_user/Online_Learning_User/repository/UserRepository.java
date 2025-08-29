package com.gateway_user.Online_Learning_User.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gateway_user.Online_Learning_User.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
