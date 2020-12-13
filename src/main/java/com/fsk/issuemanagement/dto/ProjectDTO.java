package com.fsk.issuemanagement.dto;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "Project Data Transfer Object")
public class ProjectDTO {

    @ApiModelProperty(value = "Project ID")
    private Long id;
    @NotNull
    @ApiModelProperty(required = true, value = "Project Name")
    private String projectName;
    @NotNull
    @ApiModelProperty(required = true, value = "Project Code")
    private String projectCode;

}
