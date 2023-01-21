package com.example.demo1.modelmapper;

import com.example.demo1.model.modelmapper.User;
import com.example.demo1.model.modelmapper.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ModelMapperSample {



    public static void main(String[] args ){
        ModelMapper modelMapper= new ModelMapper();
        User user = User.builder().id(1).name("john").address("new york").build();

        UserDTO userDTO= modelMapper.map(user, UserDTO.class);

        System.out.println(userDTO);
    }
}
