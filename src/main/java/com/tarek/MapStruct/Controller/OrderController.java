package com.tarek.MapStruct.Controller;

import com.tarek.MapStruct.DTO.OrderDTO;
import com.tarek.MapStruct.Entity.Order;
import com.tarek.MapStruct.Mapper.OrderMapper;
import com.tarek.MapStruct.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1")
public class OrderController {

    @Autowired
    private  OrderService orderService;
  //  @Autowired
    private  OrderMapper orderMapper ;

    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> getOrderDetails(@PathVariable Long id) {

        OrderDTO orderDTO = orderMapper.mapToDto(orderService.findById(id)) ;

        return ResponseEntity.ok(orderDTO) ;
    }

    @PostMapping("/order")
    public  ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTO orderDTO) {

        Order order = orderMapper.mapToEntity(orderDTO) ;

        OrderDTO dtos = orderMapper.mapToDto(orderService.save(order)) ;

        return new ResponseEntity<OrderDTO>(dtos, HttpStatus.OK);

    }
    @PutMapping("/order")
    public  ResponseEntity<OrderDTO> updateOrder(@RequestBody OrderDTO orderDTO) {

        Order order = orderService.findById(orderDTO.getOrder_id());

        Order orderMapped = orderMapper.mapToUpdate(orderDTO,order) ;

        OrderDTO dtos = orderMapper.mapToDto(orderService.save(orderMapped)) ;

        return new ResponseEntity<OrderDTO>(dtos, HttpStatus.OK);

    }



}
