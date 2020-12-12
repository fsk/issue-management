package com.fsk.issuemanagement.dto;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class ProjectDTO {

    private Long id;
    @NotNull
    private String projectName;
    @NotNull
    private String projectCode;

}
