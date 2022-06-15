package com.example.demo.infra.dao.persistences;

import com.example.demo.infra.dao.entity.HostOperationTimeInitializationEntity;
import com.example.demo.infra.dao.mapper.HostOperationTImeInitializationMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HostOperationTimeInitializationPersistence {
    @Autowired
    private HostOperationTImeInitializationMapping initializationMapping;

    public HostOperationTimeInitializationEntity getByHostId(Long id){
        return initializationMapping.selectById(id);
    }
}
