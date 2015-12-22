/**
 * 
 */
package com.Chat;

import javax.inject.Inject;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author atif
 *
 */

@RestController
@RequestMapping("/api")
public class ChatResource {

	@Inject
	IUserRepository userRepository;

	@RequestMapping(value = "/v1/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getUsers() {
		return userRepository.findAll();
	}

	@RequestMapping(value = "/v1/saveUser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object saveUser(@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password) {
            User user=new User(username, password);
            return userRepository.saveAndFlush(user);
	}

}
