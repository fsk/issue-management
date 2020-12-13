package com.fsk.issuemanagement.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "Issue Data Transfer Object")
public class IssueDTO {

    @ApiModelProperty(value = "Issue ID")
    private Long id;

    @ApiModelProperty(value = "Issue Description")
    private String description;

    @ApiModelProperty(value = "Issue Details")
    private String details;

    @ApiModelProperty(value = "Issue Date")
    private Date date;

    @ApiModelProperty(value = "Issue Assignee")
    private UserDTO assignee;

    @ApiModelProperty(value = "Issue Project")
    private ProjectDTO project;

}
