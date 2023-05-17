package com.chhai.springsecuritybasic.service;

import com.chhai.springsecuritybasic.model.Account;
import com.chhai.springsecuritybasic.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserServiceDetailImpl implements UserDetailsService {

    // load user from th database


    // inject repository
    final private UserRepository userRepository;
    CustomUserServiceDetailImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Account user = userRepository.findUserByEmail(email);

        UserDetails userDetails = User.builder()
                .username(user.getEmail())
                .password(user.getPassword())
                .roles(user.getRole())
                .build();
        return userDetails;
    }
}
