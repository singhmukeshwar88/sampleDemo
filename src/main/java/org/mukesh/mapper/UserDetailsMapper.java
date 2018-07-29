package org.mukesh.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.mukesh.dto.UserDetails;
import org.springframework.jdbc.core.RowMapper;

public class UserDetailsMapper implements RowMapper<UserDetails> {

	public UserDetails mapRow(ResultSet result, int rownum) throws SQLException {
		// TODO Auto-generated method stub
		
		Long actorId = result.getLong("actor_id");
		String firstName = result.getString("first_name");
		String lastName = result.getString("last_name");
		Date date = result.getDate("last_update");
		
		//UserDetails userDetails = new UserDetails(actorId, firstName, lastName, date);
		
		return null;
	}

}
