package com.fsk.issuemanagement.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "PROJECT")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Project extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PROJECT_CODE", unique = true)
    private String projectCode;

    @Column(name = "PROJECT_NAME", length = 1000)
    private String projectName;


}
