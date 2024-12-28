package com.example.FileTransferProject.service;

import com.example.FileTransferProject.model.User;
import com.example.FileTransferProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

//    @Override
//    public User findUserProfileByJwt(String jwt) {
////        String email = JwtProvider.getEmailFromToken(jwt);
////        User user = userRepository.findByEmail(email);
//
////        if (user == null) {
////            throw new UsernameNotFoundException("User not found");
////        }
////        return user;
//        return null;
//    }

    @Override
    public User findUserByEmail(String email) {
        User user = userRepository.findByEmail(email);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }

    @Override
    public User findUserById(Long userId) {
        Optional<User> user = userRepository.findById(userId);

        if (user.isEmpty()){
            throw new UsernameNotFoundException("User not found");
        }
        return user.get();
    }

//    @Override
//    public User updatePassword(User user, String newPassword) {
//        user.setPassword(newPassword);
//        return userRepository.save(user);
//    }
}
