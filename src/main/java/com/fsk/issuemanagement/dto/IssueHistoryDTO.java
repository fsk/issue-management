package com.fsk.issuemanagement.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "Issue History Data Transfer Object")
public class IssueHistoryDTO {

    @ApiModelProperty(value = "IssueHistory ID")
    private Long id;

    @ApiModelProperty(value = "IssueHistory Issue")
    private IssueDTO issue;

    @ApiModelProperty(value = "IssueHistory Description")
    private String description;

    @ApiModelProperty(value = "IssueHistory Date")
    private Date date;

    @ApiModelProperty(value = "IssueHistory Details")
    private String details;

    @ApiModelProperty(value = "IssueHistory assignee")
    private UserDTO assignee;

}
