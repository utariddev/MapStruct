package org.utarid;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserEntity userDTOToUserEntity(UserDTO userDTO);

    UserDTO userEntityToUserDTO(UserEntity userEntity);
}
