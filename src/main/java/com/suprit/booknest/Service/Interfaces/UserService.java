package com.suprit.booknest.Service.Interfaces;

import com.suprit.booknest.Dto.ProfileUpdateRequestDTO;
import com.suprit.booknest.Dto.UserDTO;
import com.suprit.booknest.Entities.UserEntity;

public interface UserService {
    UserEntity getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDTO profileUpdateRequestDto);

    UserDTO getMyProfile();
}
