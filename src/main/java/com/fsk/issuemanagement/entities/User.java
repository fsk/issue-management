package com.fsk.issuemanagement.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "Entity Model: User Entity", description = "USER ENTITY MODEL")
public class User  extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(name = "id", value = "Long", dataType = "Long", notes = "Id For User Entity")
    private Long id;

    @Column(name = "USER_NAME", length = 100, unique = true)
    @ApiModelProperty(name = "userName", value = "100 Character", dataType = "String", notes = "User Name For User Entity")
    private String userName;

    @Column(name = "PASSWORD", length = 200)
    @ApiModelProperty(name = "password", value = "200 Character", dataType = "String", notes = "Password Name For User Entity")
    private String password;

    @Column(name = "NAME", length = 200)
    @ApiModelProperty(name = "Name", value = "200 Character", dataType = "String", notes = "Name For User Entity")
    private String name;

    @Column(name = "SURNAME", length = 200)
    @ApiModelProperty(name = "Surname", value = "200 Character", dataType = "String", notes = "SurName For User Entity")
    private String surname;

    @Column(name = "EMAIL", length = 100)
    @ApiModelProperty(name = "email", value = "100 Character", dataType = "String", notes = "EMAIL For User Entity")
    private String email;

    @JoinColumn(name = "ASSIGNEE_USER_ID")
    @OneToMany(fetch = FetchType.LAZY)
    @ApiModelProperty(name = "Issue", value = "List<Issue>", dataType = "List<Issue>", notes = "Issue List For User Entity")
    private List<Issue> issues;



}
