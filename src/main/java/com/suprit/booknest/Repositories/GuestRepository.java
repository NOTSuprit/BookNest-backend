package com.suprit.booknest.Repositories;

import com.suprit.booknest.Dto.GuestDTO;
import com.suprit.booknest.Entities.GuestEntity;
import com.suprit.booknest.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<GuestEntity, Long> {
    List<GuestDTO> findByUser(UserEntity user);
}