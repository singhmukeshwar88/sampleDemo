package org.mukesh.dao;

import org.mukesh.dto.UserDetails;
import org.mukesh.mapper.UserDetailsMapper;
import org.mukesh.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDAO implements IUserDAO {

	/*@Autowired
	private JdbcTemplate jdbcTemplate;*/
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	/*public UserDetails getUserDetails(int actorId) {
		// TODO Auto-generated method stub
		UserDetails userDetails;
		userDetails = getJdbcTemplate().queryForObject("select * from sakila.actor where actor_id=?", new Object[]{actorId}, new UserDetailsMapper());
		
		return userDetails;
	}*/

	public UserDetails save(UserDetails userDetails2) {
		// TODO Auto-generated method stub
		
		UserDetails userDetails = userDetailsRepository.save(userDetails2);
		
		return userDetails;
		
	}

	@Override
	public UserDetails getUserDetails(int actorId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
