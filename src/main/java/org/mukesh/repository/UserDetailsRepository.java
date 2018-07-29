/**
 * 
 */
package org.mukesh.repository;

import org.mukesh.dto.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mukeshwar Singh
 *
 */
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

}
