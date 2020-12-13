package com.fsk.issuemanagement.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ISSUE")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@ApiModel(value = "Entity Model: Issue Entity", description = "ISSUE ENTITY MODEL")
public class Issue extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(name = "id", value = "Long", dataType = "Long", notes = "Id For Issue Entity")
    private Long id;

    @Column(name = "DESCRIPTION", length = 1000)
    @ApiModelProperty(name = "Description", value = "1000 Character", dataType = "String", notes = "Description For Issue Entity")
    private String description;

    @Column(name = "DETAILS", length = 4000)
    @ApiModelProperty(name = "Details", value = "4000 Character", dataType = "String", notes = "Details For Issue Entity")
    private String details;

    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @ApiModelProperty(name = "Date", value = "Date", dataType = "Date", notes = "Date For Issue Entity")
    private Date date;

//    @Column(name = "ISSUE_STATUS")
//    @Enumerated(EnumType.STRING)
//    private IssueStatus issueStatus;

    @JoinColumn(name = "ASSIGNEE_USER_ID")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @ApiModelProperty(name = "Assignee", value = "User", dataType = "User", notes = "User For Issue Entity. Who assigned this issue.?")
    private User assignee;

    @JoinColumn(name = "PROJECT_ID")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @ApiModelProperty(name = "Project", value = "Project", dataType = "Project", notes = "Project For Issue Entity")
    private Project project;

}
