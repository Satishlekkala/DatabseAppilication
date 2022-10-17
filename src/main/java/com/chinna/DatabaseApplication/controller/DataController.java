package com.chinna.DatabaseApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinna.DatabaseApplication.Model.UserData;
import com.chinna.DatabaseApplication.dao.UserDataRepo;

@Controller
public class DataController {
	@Autowired
	UserDataRepo repo;
	@RequestMapping("/")
	public String indexpage() {
		return "index";
	}
	@RequestMapping("/saveData")
	@ResponseBody
public String saveData(UserData userData) {
		repo.save(userData);
	return"success";
}
}
