package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entity.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer>{

}
