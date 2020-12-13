package com.fsk.issuemanagement.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "User Data Transfer Object")
public class UserDTO {

    @ApiModelProperty(value = "UserDto ID")
    private Long id;

    @ApiModelProperty(value = "USerDto name")
    private String name;

    @ApiModelProperty(value = "UserDto Surname")
    private String surname;

}
