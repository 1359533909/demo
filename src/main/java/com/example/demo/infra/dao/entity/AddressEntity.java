package com.example.demo.infra.dao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
public class AddressEntity implements Serializable {
    public static final String ID = "id";
    public static final String USER_ID = "userId";
    public static final String PROVINCE_ID = "provinceId";
    public static final String PROVINCE_NAME = "provinceName";
    public static final String CITY_ID = "cityId";
    public static final String CITY_NAME = "cityName";
    public static final String DISTRICT_ID = "districtId";
    public static final String DISTRICT_NAME = "districtName";
    public static final String STREET = "street";
    public static final String BLOCK = "block";
    public static final String ADDRESS = "address";
    public static final String LONGITUDE = "longitude";
    public static final String LATITUDE = "latitude";
    public static final String PUBLISHED = "published";
    public static final String PUBLISH_BY = "publishBy";
    public static final String STATUS = "status";
    public static final String CREATE_BY = "createBy";
    public static final String GMT_CREATE = "gmtCreate";
    public static final String GMT_MODIFY = "gmtModify";
    public static final String AREA_ID = "areaId";
    public static final String AREA_NAME = "areaName";
    public static final String IS_CHANGE = "isChange";
    public static final String MAF_ROAD = "mafRoad";
    public static final String BLOCK_ID = "block_id";
    /**
     * 表主键
     */
    private Long id;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 省份编码
     */
    private Integer provinceId;
    /**
     * 省份名称
     */
    private String provinceName;
    /**
     * 城市编码
     */
    private Integer cityId;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 行政区编码
     */
    private Integer districtId;
    /**
     * 行政区名称
     */
    private String districtName;
    /**
     * 街道名称
     */
    private String street;
    /**
     * 小区名称
     */
    private String block;
    /**
     * 准备地址
     */
    private String address;
    /**
     * 经度
     */
    private Integer longitude;
    /**
     * 维度
     */
    private Integer latitude;
    /**
     * 地址是否已发布, 0-否 1-是
     */
    private Integer published;
    /**
     * 发布人
     */
    private Long publishBy;
    /**
     * 记录状态 0-删除 1-正常
     */
    private Integer status;
    /**
     * 创建人
     */
    private Long createBy;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModify;
    /**
     * 最近商圈ID
     */
    private Integer areaId;
    /**
     * 最近商圈名字
     */
    private String areaName;
    /**
     * 最近的道路信息
     */
    private String mafRoad;

    /**
     * 大商圈id, 多个逗号分隔
     */
    private String hotelAreaId;

    /**
     * 大商圈名称
     */
    private String hotelAreaName;

    /**
     * 榛果商圈id, 多个逗号分隔
     */
    private String zhenguoAreaId;

    /**
     * 榛果商圈名称
     */
    private String zhenguoAreaName;

    /**
     * aoi id, 多个逗号分隔
     */
    private String aoiId;

    /**
     * aoi 名称
     */
    private String aoiName;

    private Integer isChange;

    /**
     * 小区ID
     */
    private Long blockId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
        this.published = published;
    }

    public Long getPublishBy() {
        return publishBy;
    }

    public void setPublishBy(Long publishBy) {
        this.publishBy = publishBy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getMafRoad() {
        return mafRoad;
    }

    public void setMafRoad(String mafRoad) {
        this.mafRoad = mafRoad;
    }

    public String getHotelAreaId() {
        return hotelAreaId;
    }

    public void setHotelAreaId(String hotelAreaId) {
        this.hotelAreaId = hotelAreaId;
    }

    public String getHotelAreaName() {
        return hotelAreaName;
    }

    public void setHotelAreaName(String hotelAreaName) {
        this.hotelAreaName = hotelAreaName;
    }

    public String getZhenguoAreaId() {
        return zhenguoAreaId;
    }

    public void setZhenguoAreaId(String zhenguoAreaId) {
        this.zhenguoAreaId = zhenguoAreaId;
    }

    public String getZhenguoAreaName() {
        return zhenguoAreaName;
    }

    public void setZhenguoAreaName(String zhenguoAreaName) {
        this.zhenguoAreaName = zhenguoAreaName;
    }

    public String getAoiId() {
        return aoiId;
    }

    public void setAoiId(String aoiId) {
        this.aoiId = aoiId;
    }

    public String getAoiName() {
        return aoiName;
    }

    public void setAoiName(String aoiName) {
        this.aoiName = aoiName;
    }

    public Integer getIsChange() {
        return isChange;
    }

    public void setIsChange(Integer isChange) {
        this.isChange = isChange;
    }

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }
}