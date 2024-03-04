package com.backend.Agriculture.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.backend.Agriculture.entities.Admin;
import com.backend.Agriculture.entities.Customer;
import com.backend.Agriculture.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository adminRepo;
	
	PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();

	@Override
	public Admin validate(String email, String password) {
		System.out.println("validating Admin...");
		Admin admin=adminRepo.findByEmail(email);
		System.out.println(admin.getPassword());
		
		if(admin!=null && passwordEncoder.matches(password, admin.getPassword())) {
			return admin;
		}
		
		return null;
	}

	@Override
	public void updateAdmin(Admin admin) {
		Admin admin1=adminRepo.findByEmail(admin.getEmail());
		if(admin.getPassword().equals("") || admin.getPassword()==null) {
			admin.setPassword(admin1.getPassword());
		}
		
		String encodedPassword=admin.getPassword();
		admin1.setPassword(encodedPassword);
		adminRepo.save(admin1);	
	}

	@Override
	public Admin findByEmail(String email) {
		// TODO Auto-generated method stub
		return adminRepo.findByEmail(email);
	}

	@Override
	public void resetPassword(Admin admin, String password) {
		String encodedPassword =(password);
		admin.setPassword(encodedPassword);
		adminRepo.save(admin);
	}

}

