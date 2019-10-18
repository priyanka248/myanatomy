package controllers;

import ninja.Result;
import ninja.Results;
import ninja.FilterWith;
import ninja.session.Session;

import com.google.inject.Singleton;
import com.google.inject.Inject;
import com.google.inject.Provider;

import javax.persistence.EntityManager;
import java.util.List;

import filter.LoginFilter;
import jdk.internal.jline.internal.Log;
import entity.User;
import entity.UserDto;
import ninja.Context;


@Singleton
public class AdminController {

	@Inject
	Provider<EntityManager> entitiyManagerProvider;

	

    public Result performLogin(UserDto user, Session session, Context context) {
		String userId = user.getUserId();
		String pwd = user.getPassword();
		String isAdmin = user.getUser_type();
		String userid = context.getSession().get("userId" + isAdmin);
		System.out.print("#######################################"+userid);
    	String password = context.getSession().get("password");
		
		if (userExists(userId, pwd)) {
			session.put("userId", userId);
			return Results.html().template("/views/ApplicationController/result.ftl.html").render(user);
		} else {
			session.clear();
		}
		return Results.html().render(user);
    }
    
    public Result performAdmin(User user, Context context)
    {
    	String userid = context.getSession().get("userId");
    	String password = context.getSession().get("password");
    	return Results.ok();
    
    }
    private boolean checkAdmin(String userId, String password)
    {
    	EntityManager entityManager = entitiyManagerProvider.get();
    	return true;
    }
	private boolean userExists(String userId, String password) {
		EntityManager entityManager = entitiyManagerProvider.get();
		List<?> users = entityManager.createQuery("from User where userId = ?1 and password = ?2").setParameter(1, userId).setParameter(2, password).getResultList();
		return (users.size() > 0) ? true : false;
	}
}