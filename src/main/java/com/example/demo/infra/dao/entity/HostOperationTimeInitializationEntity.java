package com.example.demo.infra.dao.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "host_operation_time_initialization")
@Data
public class HostOperationTimeInitializationEntity {
    @Id
    private Long id;
    private Long hostId;
    private String data;
    private Integer initializationStatus;
    private Integer notificationStatus;
    private String opName;
    private Date gmtCreate;
    private Date gmtModify;
}
