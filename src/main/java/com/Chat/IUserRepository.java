/**
 * 
 */
package com.Chat;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author atif
 *
 */
public interface IUserRepository extends JpaRepository<User, Long> {

}
