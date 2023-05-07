package org.utarid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserMapper userMapper = new UserMapperImpl();

        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity(30, "Ahmet"));
        userEntities.add(new UserEntity(40, "Ali"));

        List<UserDTO> userDTOs = userEntities.stream().map(userMapper::userEntityToUserDTO).toList();
        userDTOs.forEach(System.out::println);
    }
}