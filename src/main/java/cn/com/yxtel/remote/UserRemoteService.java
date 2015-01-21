package cn.com.yxtel.remote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yxtel.domain.UserDomain;
import yxtel.remote.IUserRemoteService;
import cn.com.yxtel.service.UserService;

@Service
public class UserRemoteService implements IUserRemoteService {
	@Autowired
	private UserService userService;

	
	@Override
	public String getUserName(String email) {
		return userService.getUserName(email);
	}
	
	@Override
	public UserDomain getUserDomain(String email) {
		UserDomain user = new UserDomain();
		user.setEmail(email);
		user.setName("测试");
		return user;
	}

	@Override
	public UserDomain getUserDomain2(UserDomain domain) {
		UserDomain user = new UserDomain();
		user.setEmail(domain.getEmail() + "     test@yy.com");
		user.setName(domain.getName() + "     测试");
		return user;
	}

	
}
