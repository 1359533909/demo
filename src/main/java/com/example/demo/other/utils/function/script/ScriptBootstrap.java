// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.other.utils.function.script;

import com.example.demo.infra.dao.entity.AddressEntity;
import com.example.demo.other.utils.HttpClientUtil;
import org.springframework.util.CollectionUtils;
import utils.JacksonUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author mxl
 * @version 1.0
 * 2021/1/28 下午6:55
 **/
public class ScriptBootstrap {
    private final static String Hongkong = "中国香港";
    private final static String Aomen = "中国澳门";
    private final static String Taiwan = "中国台湾";

    public static void main(String[] str) {
        List<Long> ids = Arrays.asList(3l);
        if (CollectionUtils.isEmpty(ids)) {
            return;
        }
    }

    public static void updateHk(List<AddressEntity> addressEntities) {
        try {
            for (AddressEntity addressEntity : addressEntities) {
                if (addressEntity.getId() == null) {
                    continue;
                }
                addressEntity.setCityName(Hongkong);
                addressEntity.setProvinceName(Hongkong);
                String result = null;
                result = HttpClientUtil.httpPostRequest("http://10.30.98.114:8414/updateAddress",
                        JacksonUtils.toJsonString(addressEntity));
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateAM(List<AddressEntity> addressEntities) {
        try {

            for (AddressEntity addressEntity : addressEntities) {
                if (addressEntity.getId() == null) {
                    continue;
                }
                addressEntity.setCityName(Aomen);
                addressEntity.setProvinceName(Aomen);
                String result = null;
                result = HttpClientUtil.httpPostRequest("http://10.30.98.114:8414/updateAddress",
                        JacksonUtils.toJsonString(addressEntity));
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateTaiwan(List<AddressEntity> addressEntities) {
        try {
            for (AddressEntity addressEntity : addressEntities) {
                if (addressEntity.getId() == null) {
                    continue;
                }
                addressEntity.setProvinceName(Taiwan);
                String result = null;
                result = HttpClientUtil.httpPostRequest("http://10.30.98.114:8414/updateAddress",
                        JacksonUtils.toJsonString(addressEntity));
                System.out.println(result);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
