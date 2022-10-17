package com.chinna.DatabaseApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chinna.DatabaseApplication.Model.UserData;

public interface UserDataRepo extends JpaRepository<UserData,Integer> {

}
