package com.suprit.booknest.Service.Interfaces;

import com.suprit.booknest.Dto.HotelPriceDTO;
import com.suprit.booknest.Dto.HotelSearchRequest;
import com.suprit.booknest.Dto.InventoryDTO;
import com.suprit.booknest.Dto.UpdateInventoryRequestDTO;
import com.suprit.booknest.Entities.RoomEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface InventoryService {
    void initializeRoomForAYear(RoomEntity room);

    void deleteAllInventories(RoomEntity room);

    Page<HotelPriceDTO> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDTO> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDTO updateInventoryRequestDto);
}
