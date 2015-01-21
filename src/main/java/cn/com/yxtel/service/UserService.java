package cn.com.yxtel.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public String getUserName(String email){
		return "cs " + email;
	}
	

}
