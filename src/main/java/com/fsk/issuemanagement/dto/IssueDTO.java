package com.fsk.issuemanagement.dto;

import com.fsk.issuemanagement.entities.IssueStatus;
import lombok.Data;

import java.util.Date;

@Data
public class IssueDTO {

    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDTO assignee;
    private ProjectDTO project;

}
