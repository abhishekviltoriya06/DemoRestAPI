package com.demo.rest.DemoRestAPI.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.rest.DemoRestAPI.DAO.UserDAO;
import com.demo.rest.DemoRestAPI.Domain.User;
 

@Service("userService")
public class UserService {
	@Autowired
	private UserDAO userDao;
	
	/*
	 * public UserService(UserRepository userRepository) {
	 * this.userRepository=userRepository; }
	 */
	
	@Transactional
	public List getUsers() {
		return userDao.getUserDetails();
	} 
	
	@Transactional
	public void addUsers(User user) {
		userDao.addUserDetails(user);
	} 
	
	@Transactional
    public void updateUser(User user) {
		userDao.updateUserDetails(user);
 
    }
 
    @Transactional
    public void deleteUser(int id) {
    	userDao.deleteUserDetail(id);
    }
	
}
