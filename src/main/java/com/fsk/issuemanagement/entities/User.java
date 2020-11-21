package com.fsk.issuemanagement.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User  extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "USER_NAME", length = 100, unique = true)
    private String userName;

    @Column(name = "PASSWORD", length = 200)
    private String password;

    @Column(name = "NAME", length = 200)
    private String name;

    @Column(name = "SURNAME", length = 200)
    private String surname;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @JoinColumn(name = "ASSIGNEE_USER_ID")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Issue> issues;



}
