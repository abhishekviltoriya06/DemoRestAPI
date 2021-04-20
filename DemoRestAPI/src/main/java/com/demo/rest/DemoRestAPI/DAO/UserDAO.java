package com.demo.rest.DemoRestAPI.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.rest.DemoRestAPI.Domain.User;

@Repository
public class UserDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
	
	public List getUserDetails() {
		 Session session = this.sessionFactory.getCurrentSession();
	     List userList = session.createQuery("from users").list();
	     return userList;
	}
	
	
	 public User addUserDetails(User user) {
	        Session session = this.sessionFactory.getCurrentSession();
	        session.persist(user);
	        return user;
	    }
	 
	 
	 public void updateUserDetails(User user) {
	        Session session = this.sessionFactory.getCurrentSession();
	        session.update(user);
	    }
	 
	    public void deleteUserDetail(int id) {
	        Session session = this.sessionFactory.getCurrentSession();
	        User p = (User) session.load(User.class, new Integer(id));
	        if (null != p) {
	            session.delete(p);
	        }
	    } 
}
