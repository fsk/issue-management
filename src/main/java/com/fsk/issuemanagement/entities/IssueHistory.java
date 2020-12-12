package com.fsk.issuemanagement.entities;


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
public class IssueHistory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "ISSUE_ID")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Issue issue;

    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

//    @Column(name = "ISSUE_STATUS")
//    @Enumerated(EnumType.STRING)
//    private IssueStatus issueStatus;

    @Column(name = "DETAILS", length = 4000)
    private String details;

    @JoinColumn(name = "ASSIGNEE_USER_ID")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;
}
