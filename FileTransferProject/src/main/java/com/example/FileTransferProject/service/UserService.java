package com.example.FileTransferProject.service;

//import com.example.TradingCryptoPlatformApplication.domain.VerifcationType;
import com.example.FileTransferProject.model.User;

public interface UserService {

//    public User findUserProfileByJwt(String jwt);
    public User findUserByEmail(String email);
    public User findUserById(Long userId);

//    public User enableTwoFactorAuthentication(
//            VerifcationType verificationType,
//            String sendTo,
//            User user);

//    User updatePassword(User user, String newPassword);
}
