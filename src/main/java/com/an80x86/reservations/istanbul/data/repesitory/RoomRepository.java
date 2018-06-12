package com.an80x86.reservations.istanbul.data.repesitory;

import com.an80x86.reservations.istanbul.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    Room findByNumber(String number);
}
