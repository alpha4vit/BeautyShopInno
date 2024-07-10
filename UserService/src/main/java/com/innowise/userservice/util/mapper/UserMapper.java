package com.innowise.userservice.util.mapper;

import com.innowise.userservice.dto.User;
import com.innowise.userservice.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    UserEntity toEntity(User dto);

    User toDTO(UserEntity entity);

    List<UserEntity> toEntities(List<User> dtos);

    List<User> toDTOs(List<UserEntity> entities);

}
