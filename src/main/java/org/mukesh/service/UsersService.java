/**
 * 
 */
package org.mukesh.service;

import org.mukesh.dao.UserDAO;
import org.mukesh.dto.UserDetails;
import org.mukesh.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mukeshwar Singh
 *
 */
@Service("usersService")
public class UsersService implements IUsersService {
	
	@Autowired
	UserDAO userDao; 
	
	private UserDetails userDetails;
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	public UserDetails getUserDetails(int actorId) {
		// TODO Auto-generated method stub
		userDetails = userDao.getUserDetails(actorId);
		return userDetails;
	}

	public UserDetails saveUserDetails(UserDetails userDetails2) {
		// TODO Auto-generated method stub
		
		UserDetails userDetails = userDetailsRepository.save(userDetails2);
		
		return userDetails;
		
	}

}
