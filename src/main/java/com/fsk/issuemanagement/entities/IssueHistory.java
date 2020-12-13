package com.fsk.issuemanagement.entities;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ISSUE_HISTORY")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@ApiModel(value = "Entity Model: IssueHistory Entity", description = "ISSUE_HISTORY ENTITY MODEL")
public class IssueHistory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(name = "id", value = "Long", dataType = "Long", notes = "Id For IssueHistory Entity")
    private Long id;

    @JoinColumn(name = "ISSUE_ID")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @ApiModelProperty(name = "Issue", value = "Issue", dataType = "Issue", notes = "Issue For IssueHistory Entity")
    private Issue issue;

    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @ApiModelProperty(name = "Date", value = "Date", dataType = "Date", notes = "Date For IssueHistory Entity")
    private Date date;

//    @Column(name = "ISSUE_STATUS")
//    @Enumerated(EnumType.STRING)
//    private IssueStatus issueStatus;

    @Column(name = "DETAILS", length = 4000)
    @ApiModelProperty(name = "Details", value = "4000 Character", dataType = "String", notes = "Details For IssueHistory Entity")
    private String details;

    @JoinColumn(name = "ASSIGNEE_USER_ID")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @ApiModelProperty(name = "Assignee", value = "Assignee", dataType = "Assignee", notes = "Assignee For IssueHistory Entity")
    private User assignee;
}
