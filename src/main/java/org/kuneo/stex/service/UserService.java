package org.kuneo.stex.service;

import org.kuneo.stex.model.base.LoginUser;
import org.kuneo.stex.model.base.UserEntity;
import org.kuneo.stex.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService implements UserDetailsService {
  
  @Autowired
  UserRepository userRepository;
  
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    if (username == null || "".equals(username)) {
      throw new UsernameNotFoundException("Username is empty");
    }

    UserEntity user = userRepository.findOneByName(username);
    if (user == null) {
      throw new UsernameNotFoundException("User not found for name: " + username);
    }
    return new LoginUser(user);
  }  
}
