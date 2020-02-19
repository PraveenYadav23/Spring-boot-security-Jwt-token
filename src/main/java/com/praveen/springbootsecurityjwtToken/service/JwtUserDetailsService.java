package com.praveen.springbootsecurityjwtToken.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      logger.info("\n\n UserDetailService Method " + getClass().getName());
        return new User("pra","$2y$12$u54vXYPGe..5f4NUE8BoaerDnkpkRr.v0LZ7.X35vOsMnl6hFUOFq", new ArrayList<>());
    }
}
