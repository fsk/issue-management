package com.fsk.issuemanagement.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "PROJECT")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@ApiModel(value = "Entity Model: Project Entity", description = "PROJECT ENTITY MODEL")
public class Project extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(name = "id", value = "Long", dataType = "Long", notes = "Id For PROJECT Entity")
    private Long id;

    @Column(name = "PROJECT_CODE", unique = true)
    @ApiModelProperty(name = "ProjectCode", value = "Unlimited.", dataType = "String", notes = "ProjectCode For User Entity")
    private String projectCode;

    @Column(name = "PROJECT_NAME", length = 1000)
    @ApiModelProperty(name = "ProjectName", value = "1000 Character", dataType = "String", notes = "Project_Name For User Entity")
    private String projectName;

    @JoinColumn(name = "MANAGER_USER_ID")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @ApiModelProperty(name = "MANAGER_USER_ID", value = "User", dataType = "User", notes = "Manager For User Entity")
    private User manager;


}
