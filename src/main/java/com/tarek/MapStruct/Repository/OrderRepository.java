package com.tarek.MapStruct.Repository;

import com.tarek.MapStruct.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface OrderRepository extends JpaRepository< Order,Long> {

   public Order findById(long id);
}
