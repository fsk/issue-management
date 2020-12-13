package com.fsk.issuemanagement.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
@Getter
@Setter
@ApiModel(value = "Entity Model: Base Entity", description = "BASE ENTITY MODEL")
public abstract class BaseEntity implements Serializable {

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    @ApiModelProperty(name = "createdAd", dataType = "Date",notes = "When created.?")
    private Date createdAd;

    @Column(name = "created_by", length = 100)
    @ApiModelProperty(name = "createdBy", value = "1000 character",notes = "Who created.?", dataType = "String")
    private String createdBy;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    @ApiModelProperty(name = "updatedAd", dataType = "Date",notes = "When updated.?")
    private Date updatedAd;

    @Column(name = "updated_by")
    @ApiModelProperty(name = "updatedBy", value = "1000 character",notes = "Who updated.?", dataType = "String")
    private String updatedBy;

    @Column(name = "status")
    @ApiModelProperty(value = "Depreceted. Not IMPORTANT")
    private Boolean status;
}
