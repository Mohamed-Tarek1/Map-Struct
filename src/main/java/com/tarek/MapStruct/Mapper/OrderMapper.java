package com.tarek.MapStruct.Mapper;

import com.tarek.MapStruct.DTO.OrderDTO;
import com.tarek.MapStruct.Entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;


@Component
@Mapper(componentModel = "spring" )
public interface OrderMapper {

    @Mapping(source = "id" ,target = "order_id")
    @Mapping(target = "order_type",constant = "Electronics")
    @Mapping(source = "orderStatus" ,target = "order_status")
    OrderDTO mapToDto(Order t);

    @Mapping(source = "order_id" ,target = "id")
    @Mapping(source = "order_type" ,target = "orderType")
    @Mapping(source = "order_status" ,target = "orderStatus")
    Order mapToEntity(OrderDTO dto);

    @Mapping(source = "order_id" ,target = "id")
    @Mapping(source = "order_type" ,target = "orderType")
    @Mapping(source = "order_status" ,target = "orderStatus")
    Order mapToUpdate(OrderDTO dto ,@MappingTarget Order t);


}
